$(document).ready(function () {
    $( "#btn-registrar" ).click(function () { 
        if ( $( "#frm-registro-usuario" ).valid() ) {
            var form = $( "#frm-registro-usuario" ).serialize();
            $.ajax({
                'url': "Registro",
                'type': "post",
                'data': form
            })
            .done(function(data, textStatus, jqXHR) {
                if (textStatus === 'success') {
                    var mensaje = eval(data);
                    alert("Usuario registrado. " + mensaje.registrado);
                    closeModalRegistrar('modalRegistro');
                }
            })
            .fail(function(status, errorThrown) {
                alert("Estatus del servidor: " + status + "\n" + 
                    "Error:" + errorThrown + "\n");
            });
        } else {
            console.log("NOT VALID FORM!!!");
        }
    });
    $( "#btn-Acceso" ).click(function () { 
        if ( $( "#frm-Acceso-Principal" ).valid() ) {
            var form = $( "#frm-Acceso-Principal" ).serialize();
            $.ajax({
                'url': "AccesoSistema",
                'type': "post",
                'data': form,
                'contentType': "application/x-www-form-urlencoded"
            })
            .done(function(data, textStatus, jqXHR) {
                if (textStatus === 'success') {
                    $( "#message-alert-error #DataError" ).hide();
                    $( "#message-alert-error #serverError" ).hide();
                    $( "#message-alert-error" ).show();
                    if ( jqXHR.getResponseHeader("user-not-exists")
                            === "error" ) {
                        $( "#message-alert-error #DataError" ).show();
                    } else if (jqXHR.getResponseHeader("server-error-header")
                            === "error") {
                        $( "#message-alert-error #serverError" ).show();
                    } else {
                        $( "#message-alert-error" ).hide();
                        closeModalRegistrar('modalLogin');
                        window.location.href = 
                            jqXHR.getResponseHeader("login-success-header");
                        return false;
                    }
                }
            })
            .fail(function(jqXHR, textStatus, errorThrown) {
                alert("Estatus del servidor: " + textStatus + "\n" + 
                    "Error:" + errorThrown + "\n");
            });
        } else {
            console.log("NOT VALID FORM!!!");
        }
    });
});