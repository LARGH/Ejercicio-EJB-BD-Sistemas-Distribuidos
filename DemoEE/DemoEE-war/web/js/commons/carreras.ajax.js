$(document).ready(function () {
    
});

function bindEvendClickVerCarrera() {
    $('.deleteCarrera').tooltip({
        'placement': 'bottom',
        'trigger': 'hover'
    });
    $('.editCarrera').tooltip({
        'placement': 'bottom',
        'trigger': 'hover'
    });
    $('.verCarrera').tooltip({
        'placement': 'bottom',
        'trigger': 'hover'
    });
    $('.cantAlumns').tooltip({
        'placement': 'bottom',
        'trigger': 'hover'
    });
    $('.verCarrera').click(function() {
        var $id = $(this).attr('data-id-carrera');
        var $name = $(this).attr('data-name-carrera');
        $.ajax({
            'type': 'POST',
            'url': 'CarreraDispatcher',
            'data': {
                'id': $id,
                'name': $name,
                'accion': 'verCarrera',
                'event': 'selected'
            }
        })
        .done(function (data, textStatus, jqXHR) {
            if (textStatus === 'success') {
                window.location = 
                    jqXHR.getResponseHeader("ver-carrera-redirect");
                return false;
            }
        })
        .fail(function(jqXHR, textStatus, errorThrown) {
            console.log("Estatus del servidor: " + textStatus + "\n" + 
                "Error: " + errorThrown + "\n" + 
                jqXHR.getResponseHeader("ver-carrera-redirect"));
        });
    });
    $('.editCarrera').click(function() {
        var $id = $(this).attr('data-id-carrera');
        var $name = $(this).attr('data-name-carrera');
        $.ajax({
            'type': 'POST',
            'url': 'CarreraDispatcher',
            'data': {
                'id': $id,
                'name': $name,
                'accion': 'editar',
                'event': 'selected'
            }
        })
        .done(function (data, textStatus, jqXHR) {
            if (textStatus === 'success') {
                window.location = 
                    jqXHR.getResponseHeader("edit-carrera-redirect");
                return false;
            }
        })
        .fail(function(jqXHR, textStatus, errorThrown) {
            console.log("Estatus del servidor: " + textStatus + "\n" + 
                "Error: " + errorThrown + "\n" + 
                jqXHR.getResponseHeader("edit-carrera-redirect"));
        });
    });
    $('.deleteCarrera').click(function() {
        $( "#modal-borrar-carrera #nombreCarrera" )
            .html("<i>'" + $(this).attr("data-name-carrera") + "'</i>");
        $( "#modal-borrar-carrera #btn-borrar-carrera" )
            .attr("data-id-carrera", $(this).attr("data-id-carrera"));
        $( "#modal-borrar-carrera #btn-borrar-carrera" )
            .attr("data-name-carrera", $(this).attr("data-name-carrera"));
        $( "#modal-borrar-carrera" ).modal({
            'keyboard': true
        });
    });
}

function cargarListaCarreras(opcion, $user, idList) {
    $.ajax({
        'url': "CarreraDispatcher",
        'type': "get",
        'data': { 'accion': "" + opcion },
        'contentType': 'application/json',
        'dataType': "json"
    })
    .done(function(data, textStatus, jqXHR) {
        if (textStatus === 'success') {
            var responseHeader = 
                jqXHR.getResponseHeader("server-response-header");
            if (responseHeader === "error") {
                alert("Error de conexion servidor.");
            } else if (responseHeader === "success") {
                var $object = eval(data);
                var $target = $( "#" + idList );
                clearContainerList( idList );
                console.log("STATUS SERVER: SUCCESS. ");
                if ($object.status === "empty") {
                    insertRowErrorEmptyData(
                        "No existen datos registrados de carreras.", 
                        $target
                    );
                } else if ($object.status === "full") {
                    for (var i in $object.listaCarreras) {
                        insertRowIntoContainerList(
                            {'id': $object.listaCarreras[i].IdCarrera,
                            'nombre': $object.listaCarreras[i].nombreCarrera,
                            'status': $object.listaCarreras[i].status,
                            'alumnCount': 0},
                            $user,
                            $target 
                        );
                    }
                    bindEvendClickVerCarrera();
                }
            }
        }
    })
    .fail(function(jqXHR, textStatus, errorThrown) {
        console.log("Estatus del servidor: " + textStatus + "\n" + 
            "Error: " + errorThrown + "\n" + 
            jqXHR.getResponseHeader("server-response-header"));
    });
}

function cargarListaAlumnosPorCarrera($idList, $id, $nombre) {
    $.ajax({
        'url': "CarreraDispatcher",
        'type': "get",
        'data': { 
            'id': $id,
            'nombre': $nombre,
            'accion': "verCarrera",
            'event': "selectCarrera"
        },
        'contentType': 'application/json',
        'dataType': "json"
    })
    .done(function(data, textStatus, jqXHR) {
        if (textStatus === 'success') {
            var responseHeader = 
                jqXHR.getResponseHeader("server-response-header");
            if (responseHeader === "error") {
                alert("Error de conexion servidor.");
            } else if (responseHeader === "success") {
                var $object = eval(data);
                var $target = $( "#" + $idList );
                var $row, $div;
                clearContainerList( $idList );
                console.log("STATUS SERVER: SUCCESS. ");
                if ($object.status === "null" || $object.status === "empty") {
                    insertRowErrorEmptyData(
                        "No existen datos registrados de carreras.", 
                        $target
                    );
                }
                else if ($object.status === "full") {
                    alert("Hay datos en lista.");
                    for (var i in $object.listaAlumnosInscritos) {
                        $row = $( "<a id='" + $object.listaAlumnosInscritos[i].matricula + 
                                "' href='#' class='list-group-item'></a>" );
                        $div = $( "<div class='row'></div>" );
                        $div.append( 
                                "<div class='col-md-9 text-left'>" + 
                                $object.listaAlumnosInscritos[i].apPaterno + "&nbsp;" +
                                $object.listaAlumnosInscritos[i].apMaterno + "&nbsp;" +
                                $object.listaAlumnosInscritos[i].nombreAlumno
                                + "</div>" );
                        $div.append(
                            "<div class='col-md-3 text-right'>" + 
                            "<span " + 
                            "data-toggle='tooltip' " + 
                            "title='Matricula' " +
                            "class='badge matricula'>" + $object.listaAlumnosInscritos[i].matricula + 
                            "</span></div>" );
                        $row.append($div).appendTo($target);
                    }
                    bindEvendTooltip('matricula');
                }
            }
        }
    })
    .fail(function(jqXHR, textStatus, errorThrown) {
        console.log("Estatus del servidor: " + textStatus + "\n" + 
            "Error: " + errorThrown + "\n" + 
            jqXHR.getResponseHeader("server-response-header"));
    });
}