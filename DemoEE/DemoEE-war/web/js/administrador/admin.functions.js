$(document).ready(function () {
    
});

function closeModalBorrarCarrera(modal) {
    $( "#" + modal ).modal('toggle');
}

function insertRowIntoContainerList($json, $user, $target) {
    var $row, $div;
    if ($user === 'alumnos') {
        $row = $( "<a id='" + $json.id + 
                "' href='#' class='list-group-item'></a>" );
        $div = $( "<div class='row'></div>" );
        $div.append( 
                "<div class='col-md-9 text-left'>" + 
                $json.nombre + "</div>" );
        $div.append(
            "<div class='col-md-3 text-right'>" + 
            "<span id='cantidad-alumnos'" + 
            "data-toggle='tooltip'" + 
            "title='Cantidad de alumnos inscritos'" +
            "class='badge'>" + $json.alumnCount + "</span></div>" );
        $row.append($div).appendTo($target);
    } else if ($user === 'admin') {
        console.log("STATUS CARRERA:" + $json.status);//((($json.status === 'true')? '' : ' disabled'))
        $row = $( "<a id='" + $json.id + 
                "' href='#' class='list-group-item" + ((($json.status)? '' : ' disabled')) + "'></a>" );
        $div = $( "<div class='row'></div>" );
        var $div_title = $( "<div class='col-md-9 text-left'></div>" );
        $div_title.append( $json.nombre );
        var $div_inner = $( "<div class='col-md-3 text-right'></div>" );
        $div_inner.append(
            "<button " +
                "class='btn btn-sm btn-info verCarrera'" +
                "data-placement='bottom'" +
                "data-toggle='tooltip'" +
                "title='Ver datos de carrera'" +
                "data-id-carrera='" + $json.id + "'" +
                "data-name-carrera='" + $json.nombre + "'>" +
            "<span class='glyphicon glyphicon-eye-open'></span></button>&nbsp;"
        );
        $div_inner.append(
            "<button " +
                "class='btn btn-sm btn-warning editCarrera'" +
                "data-placement='bottom'" +
                "data-toggle='tooltip'" +
                "title='Editar carrera'" +
                "data-name-carrera='" + $json.nombre + "'" +
                "data-id-carrera='" + $json.id + "'>" +
            "<span class='glyphicon glyphicon-edit'></span></button>&nbsp;"
        );
        if ($json.status) {
            $div_inner.append(
                "<button " +
                    "class='btn btn-sm btn-danger deleteCarrera'" +
                    "data-placement='bottom'" +
                    "data-toggle='tooltip'" +
                    "title='Borrar carrera'" +
                    "data-id-carrera='" + $json.id + "'" +
                    "data-name-carrera='" + $json.nombre + "'>" +
                "<span class='glyphicon glyphicon-remove'></span></button>&nbsp;"
            );
        }
        $div_inner.append(
            "<span " +
                "data-toggle='tooltip'" +
                "title='Cantidad de alumnos inscritos'" +
                "class='badge cantAlumns'>" + $json.alumnCount +"</span>"
        );
        $div.append($div_title).append($div_inner);
        $row.append($div).appendTo($target);
    }
}

function insertRowErrorEmptyData($mensaje, $target) {
    var $row = $( "<a id='mensaje' href='#' " + 
        "class='list-group-item'></a>" );
    var $div = $( "<div class='row alert alert-warning alert-dismissable'></div>" );
    /*var $alert = 
      $( "<div class=''></div>" );*/
    $div.append( 
        "<strong>Mensaje:</strong> " + $mensaje);
    //$div.append($alert); 
    $row.append($div).appendTo($target);
}

function clearContainerList($container) {
    $( "#" + $container ).html("");
}