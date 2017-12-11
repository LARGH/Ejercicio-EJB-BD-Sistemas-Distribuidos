function addEventListener(object) {
    $( "#" + object ).bind("click");
}

function closeModalRegistrar(modal) {
    $( "#" + modal ).modal('toggle');
    registro.resetForm("frm-registro-usuario");
}

$(document).ready(function () {
    $( "#message-alert-error" ).hide();
    $( "#message-alert-error #DataError" ).hide();
    $( "#message-alert-error #serverError" ).hide();
    addEventListener("md-frm-registrar");
    $( "#btnForAlumno" ).click(function () {
        login.resetForm("frm-Acceso-Principal");
        $( "#modalLogin" ).modal({
            'keyboard': true
        });
    });
    $( "#btnForAdministrador" ).click(function () {
        login.resetForm("frm-Acceso-Principal");
        $( "#modalLogin" ).modal({
            'keyboard': true
        });
    });
    $( "#md-frm-registrar" ).click(function () {
        $( "#modalRegistro" ).modal({
            'keyboard': true
        });
        registro.resetForm("frm-registro-usuario");
    });
    $( "#message-alert-error #DataError #closeAlert" ).click(function () {
        $( "#message-alert-error #DataError" ).hide();
    });
    $( "#message-alert-error #serverError #closeAlert" ).click(function () {
        $( "#message-alert-error #serverError" ).hide();
    });
});