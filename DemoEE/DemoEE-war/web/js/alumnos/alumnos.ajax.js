$(document).ready(function () {
    
});

function cargarCarreraAlumno($_matricula) {
    $.ajax({
        'url': "AlumnoDispatcher",
        'type': "get",
        'data': {
            'accion': 'isInscrito',
            'matricula': $_matricula
        },
        'contentType': "application/json",
        'dataType': "json"
    })
    .done(function (data, textStatus, jqXHR) {
        if (textStatus === 'success') {
            var response = 
                jqXHR.getResponseHeader("inscrito-carrera");
            if (response === 'error') {
                
            } else {
                var $object = eval(data);
                var $target = $( "#content-list" );
                var $row = $( '<a href="#" class="list-group-item"></a>' );
                if ($object.status === 'empty') {
                    $row.attr("id", "mensaje");
                    var $div = $( "<div class='row'></div>" );
                    var $alert = 
                      $( "<div class='alert alert-danger alert-dismissable'>" );
                    $alert.append( 
                        "<strong>Error!</strong> " + "No existen carreras inscritas.");
                    $div.append($alert); 
                    $row.append($div).appendTo($target);
                } else if ($object.status === 'full') {
                    for (var i in $object.listaCarreras) {
                        $row = $( "<a id='" + $object.listaCarreras[i].IdCarrera + 
                                "' href='#' class='list-group-item'></a>" );
                        var $div = $( "<div class='row'></div>" );
                        $div.append( 
                                "<div class='col-md-9 text-left'>" + 
                                $object.listaCarreras[i].nombreCarrera + "</div>" );
                        $div.append(
                            "<div class='col-md-3 text-right'>" + 
                            "<span id='cantidad-alumnos'" + 
                            "data-toggle='tooltip'" + 
                            "title='Cantidad de alumnos inscritos'" +
                            "class='badge'>" + 0 + "</span></div>" );
                        $row.append($div).appendTo($target);
                    }
                }
            }
        }
    })
    .fail(function (jqXHR, textStatus, errorThrown) {
        console.log("Estatus del servidor: " + textStatus + "\n" + 
            "Error:" + errorThrown + "\n");
    });
}