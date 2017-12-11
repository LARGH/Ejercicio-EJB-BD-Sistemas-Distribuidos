$(document).ready(function () {
    $( "#agregar-carrera" ).click(function () {
        if ( $( "#frm-Agregar-Nueva-Carrera" ).valid() ) {
            $.ajax({
                'url': "CarreraDispatcher",
                'type': "get",
                'data': {
                    'accion': "agregar", 
                    'nombre': $( "#nombre-carrera" ).val(),
                    'descripcion': $( "#descripcion-carrera" ).val()
                },
                'contentType': 'application/json',
                'dataType': "json"
            })
            .done(function (data, textStatus, jqXHR) {
                var object = eval(data);
                console.log("Exito: " + object);
                if (textStatus === 'success') {
                    $( "#message-alert-success" ).hide();
                    $( "#message-alert-error" ).hide();
                    var response = 
                        jqXHR.getResponseHeader("register-carrera-header");
                    if (response === 'success') {
                        $( "#message-alert-success" ).show();
                    } else {
                        $( "#message-alert-error" ).show();
                    }
                }
            })
            .fail(function (jqXHR, textStatus, errorThrown) {
                $( "#message-alert-error" ).show();
                //alert("Estatus del servidor: " + textStatus + "\n" + 
                //    "Error: " + errorThrown + "\n" + 
                //    jqXHR.getResponseHeader("register-carrera-header"));
            });
        } else {
            console.log("FORM NOT VALID!");
        }
    });
    $( "#btn-update-Carrera" ).click(function () {
        if ( $( "#frm-update-Carrera" ).valid() ) {
            var $idCarrera = $(this).attr( 'data-id-carrera' );
            var $nombreCarrera = $( "#nombre-carrera" ).val();
            var $status = $( "#estatus-carrera" ).is(":checked");
            var $descripcion = $( "#descripcion-carrera" ).val();
            $.ajax({
                'url': "CarreraDispatcher",
                'type': "get",
                'data': {
                    'id': $idCarrera,
                    'name': $nombreCarrera,
                    'status': $status,
                    'descripcion': $descripcion,
                    'accion': 'editar',
                    'event': 'clickEdit'
                },
                'contentType': 'application/json',
                'dataType': "json"
            })
            .done(function (data, textStatus, jqXHR) {
                if (textStatus === 'success') {
                    var $object = eval(data);
                    $( "#message-alert-success" ).hide();
                    $( "#message-alert-error" ).hide();
                    var response = 
                        jqXHR.getResponseHeader("update-carrera-header");
                    if (response === 'success') {
                        $( "#message-alert-success" ).show();
                        $( "#nombre-carrera" ).val( $object.data );
                        $( "#estatus-carrera" ).attr("checked", ($object.status) ? "checked":"");
                        $( "#descripcion-carrera" ).val( $object.desc );
                    } else {
                        $( "#message-alert-error" ).show();
                    }
                }
            })
            .fail(function (jqXHR, textStatus, errorThrown) {
                $( "#message-alert-error" ).show();
                //alert("Estatus del servidor: " + textStatus + "\n" + 
                //    "Error: " + errorThrown + "\n" + 
                //    jqXHR.getResponseHeader("register-carrera-header"));
            });
        } else {
            console.log("FORM NOT VALID!");
        }
    });
    $( "#btn-borrar-carrera" ).click(function () {
        var $id = $(this).attr('data-id-carrera');
        var $name = $(this).attr('data-name-carrera');
        $.ajax({
            'url': 'CarreraDispatcher',
            'type': 'get',
            'data': {
                'id': $id,
                'name': $name,
                'accion': 'borrar'
            },
            'contentType': 'application/json',
            'dataType': "json"
        })
        .done(function (data, textStatus, jqXHR) {
            if (textStatus === 'success') {
                $( "#message-alert-success" ).hide();
                $( "#message-alert-error" ).hide();
                var response = 
                    jqXHR.getResponseHeader("delete-carrera-header");
                if (response === 'success') {
                    $( "#message-alert-success" ).show();
                } else {
                    $( "#message-alert-error" ).show();
                }
                closeModalBorrarCarrera('modal-borrar-carrera');
            }
        })
        .fail(function(jqXHR, textStatus, errorThrown) {
            console.log("Estatus del servidor: " + textStatus + "\n" + 
                "Error: " + errorThrown + "\n" + 
                jqXHR.getResponseHeader("edit-carrera-redirect"));
        });
    });
});