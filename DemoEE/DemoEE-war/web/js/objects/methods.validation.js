$(document).ready(function () {
    $.validator.addMethod("loginRegex", function(value, element) {
        return this.optional(element) || /^[a-z0-9\-\s]+$/i.test(value);
    }, login.mensajes.errorRegexUsuario);
});