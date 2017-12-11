$(document).ready(function () {
    jQuery.validator.addMethod("regx", function (value, element, regexpr) {
        return regexpr.test(value);
    }, "Ingresar un nombre v&aacute;lido.");
    $( "#frm-Acceso-Principal" ).validate({
        'rules': {
            'clave_usuario': {
                'required': true,
                'minlength': 3,
                'loginRegex': true
            },
            'clave_password': {
                'required': true,
                'minlength': 3,
                'maxlength': 30
            }
        },
        'messages': {
            'clave_usuario': {
                'required': login.mensajes.errorUsuario,
                'minlength': login.mensajes.errorLenghtUsuario,
                'loginRegex': login.mensajes.errorRegexUsuario
            },
            'clave_password': {
                'required': login.mensajes.errorPassword,
                'minlength': login.mensajes.errorPassword,
                'maxlength': login.mensajes.errorMaxLenghtPassword
            }
        },
        errorElement: "em",
        errorPlacement: function ( error, element ) {
            error.addClass( "help-block" );
            element.parents( "#form-input" ).addClass( "has-feedback" );
            error.insertAfter( element.parent( "#form-input" ) );
            if ( !element.next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-remove form-control-feedback'></span>" ).insertAfter( element );
            }
        },
        success: function ( label, element ) {
            if ( !$( element ).next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-ok form-control-feedback'></span>" ).insertAfter( $( element ) );
            }
        },
        highlight: function ( element, errorClass, validClass ) {
            $( element ).parents( "#form-input" ).addClass( "has-error" ).removeClass( "has-success" );
            $( element ).next( "span" ).addClass( "glyphicon-remove" ).removeClass( "glyphicon-ok" );
        },
        unhighlight: function (element, errorClass, validClass) {
            $( element ).parents( "#form-input" ).addClass( "has-success" ).removeClass( "has-error" );
            $( element ).next( "span" ).addClass( "glyphicon-ok" ).removeClass( "glyphicon-remove" );
        }
    });
    $( "#frm-registro-usuario" ).validate({
        'rules': {
            'nombre-usuario': {
                'required': true,
                'minlength': 3
            },
            'ap-paterno-usuario': {
                'required': true,
                'minlength': 3
            },
            'ap-materno-usuario': {
                'required': true,
                'minlength': 3
            },
            'correo-electronico': {
                'required': true,
                'email': true
            },
            'clave_usuario': {
                'required': true,
                'minlength': 3,
                'loginRegex': true
            },
            'clave_password': {
                'required': true,
                'minlength': 3,
                'maxlength': 30
            }
        },
        'messages': {
            'nombre-usuario': {
                'required': registro.mensajes.errorNombreUsuario,
                'minlength': registro.mensajes.errorLengthNombreUsuario
            },
            'ap-paterno-usuario': {
                'required': registro.mensajes.errorApPaternoUsuario,
                'minlength': registro.mensajes.errorLengthApPaternoUsuario
            },
            'ap-materno-usuario': {
                'required': registro.mensajes.errorApMaternoUsuario,
                'minlength': registro.mensajes.errorLengthApPaternoUsuario
            },
            'correo-electronico': {
                'required': registro.mensajes.errorEmailRequiredUsuario,
                'email': registro.mensajes.errorEmailUsuario 
            },
            'clave_usuario': {
                'required': registro.mensajes.errorUsuario,
                'minlength': registro.mensajes.errorLengthUsuario,
                'loginRegex': registro.mensajes.errorRegexUsuario
            },
            'clave_password': {
                'required': registro.mensajes.errorPassword,
                'minlength': registro.mensajes.errorPassword,
                'maxlength': registro.mensajes.errorMaxLenghtPassword
            }
        },
        errorElement: "em",
        errorPlacement: function ( error, element ) {
            error.addClass( "help-block" );
            element.parents( "#form-input" ).addClass( "has-feedback" );
            error.insertAfter( element.parent( "#form-input" ) );
            if ( !element.next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-remove form-control-feedback'></span>" ).insertAfter( element );
            }
        },
        success: function ( label, element ) {
            if ( !$( element ).next( "span" )[ 0 ] ) {
                $( "<span class='glyphicon glyphicon-ok form-control-feedback'></span>" ).insertAfter( $( element ) );
            }
        },
        highlight: function ( element, errorClass, validClass ) {
            $( element ).parents( "#form-input" ).addClass( "has-error" ).removeClass( "has-success" );
            $( element ).next( "span" ).addClass( "glyphicon-remove" ).removeClass( "glyphicon-ok" );
        },
        unhighlight: function (element, errorClass, validClass) {
            $( element ).parents( "#form-input" ).addClass( "has-success" ).removeClass( "has-error" );
            $( element ).next( "span" ).addClass( "glyphicon-ok" ).removeClass( "glyphicon-remove" );
        }
    });
});