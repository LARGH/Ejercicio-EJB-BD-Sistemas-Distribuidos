$(document).ready(function () {
    //Validación del formulario agregar carrera nueva.
    //
    $( "#frm-Agregar-Nueva-Carrera" ).validate({
        'rules': {
            'nombre-carrera': {
                'required': true
            },
            'descripcion-carrera': {
                'required': true
            }
        },
        'messages': {
            'nombre-carrera': {
                'required': addCarrera.mensajes.errorRequiredNombreCarrera
            },
            'descripcion-carrera': {
                'required': addCarrera.mensajes.errorRequiredDescripcionCarrera
            }
        },
        errorElement: "em",
        errorPlacement: function ( error, element ) {
            error.addClass( "help-block" );
            element.parents( ".input" ).addClass( "has-feedback" );
            error.insertAfter( element.parent( ".input" ) );
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
            $( element ).parents( ".input" ).addClass( "has-error" ).removeClass( "has-success" );
            $( element ).next( "span" ).addClass( "glyphicon-remove" ).removeClass( "glyphicon-ok" );
        },
        unhighlight: function (element, errorClass, validClass) {
            $( element ).parents( ".input" ).addClass( "has-success" ).removeClass( "has-error" );
            $( element ).next( "span" ).addClass( "glyphicon-ok" ).removeClass( "glyphicon-remove" );
        }
    });
    $( "#frm-update-Carrera" ).validate({
        'rules': {
            'nombre-carrera': {
                'required': true
            },
            'descripcion-carrera': {
                'required': true
            }
        },
        'messages': {
            'nombre-carrera': {
                'required': addCarrera.mensajes.errorRequiredNombreCarrera
            },
            'descripcion-carrera': {
                'required': addCarrera.mensajes.errorRequiredDescripcionCarrera
            }
        },
        errorElement: "em",
        errorPlacement: function ( error, element ) {
            error.addClass( "help-block" );
            element.parents( ".input" ).addClass( "has-feedback" );
            error.insertAfter( element.parent( ".input" ) );
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
            $( element ).parents( ".input" ).addClass( "has-error" ).removeClass( "has-success" );
            $( element ).next( "span" ).addClass( "glyphicon-remove" ).removeClass( "glyphicon-ok" );
        },
        unhighlight: function (element, errorClass, validClass) {
            $( element ).parents( ".input" ).addClass( "has-success" ).removeClass( "has-error" );
            $( element ).next( "span" ).addClass( "glyphicon-ok" ).removeClass( "glyphicon-remove" );
        }
    });
});