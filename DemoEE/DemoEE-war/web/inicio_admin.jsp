<%-- 
    Document   : CU_inicio
    Created on : 16/10/2017, 07:01:18 PM
    Author     : Rafael Landa
    Usuario    : Administrador
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Import Bootstrap 3-->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        <title>Inicio Administrador</title>
        <style type="text/css">
            .scrollable-list {
                height: auto;
                max-height: 400px;
                overflow-x: hidden;
            }
            .verCarrera { }
        </style>
    </head>
    <body onload="javascript: cargarListaCarreras( 'readAll', 'admin', 'content-list' );">
        <div class="container">
            <div class="row">
                <div class="container">
                    <div class="col-md-9 text-left">
                        <h2>Sistema de administración de carreras</h2>
                    </div>
                    <div class="col-md-3 text-right">
                        <h2>Administrador</h2>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="row">
                    <ol class="breadcrumb">
                        <li class="active"><a href="inicio_admin.jsp">Inicio</a></li>
                    </ol>
                </div>
                <div class="row">
                    <div id="message-alert-error">
                        <div class="alert alert-danger alert-dismissable">
                            <button type="button" id="closeAlertError" class="close">&times;</button>
                            <strong>Error!</strong> Ha ocurrido un error interno del servidor al borrar la carrera.
                        </div>
                    </div>
                    <div id="message-alert-success">
                        <div class="alert alert-success alert-dismissable">
                            <button type="button" id="closeAlertSuccess" class="close">&times;</button>
                            <strong>Carrera dada de baja!</strong> La carrera que ha seleccionado, ha sido dada de baja exitosamente.
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="well list-group">
                        <li href="#" class="list-group-item active">
                            <div class="row">
                                <div class="col-md-5 text-left">
                                    <h4>Lista de carreras: </h4>
                                </div>
                                <div class="col-md-5 text-left">
                                    <form id="frm-encontrar-nombres">
                                        <div class="col-lg-10">
                                            <div class="input-group">
                                                <input type="text" class="form-control" placeholder="Buscar carreras...">
                                                <span class="input-group-btn">
                                                    <button id="btn-buscar-Carrera" name="btn-buscar-Carrera" 
                                                        class="btn btn-default">Buscar</button>
                                                </span>
                                            </div>
                                        </div>
                                    </form>
                                </div>
                                <div class="col-md-2 text-right">
                                    <a href="#" role="button" id="btn-Refrescar" class="btn btn-sm btn-default" 
                                       data-toggle="tooltip" title="Actualizar lista"
                                       onclick="javascript: cargarListaCarreras( 'readAll', 'admin', 'content-list' );">
                                        <span class="glyphicon glyphicon-repeat"></span>
                                    </a>
                                    <a href="agregar_carrera.jsp" role="button" id="btn-Agregar-Carrera" class="btn btn-sm btn-default" 
                                        data-toggle="tooltip" title="Agregar carrera">
                                        <span class="glyphicon glyphicon-edit"></span>
                                    </a>
                                </div>
                            </div>
                        </li>
                        <div id="content-list" class="scrollable-list"></div>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal borrar carrera -->
        <div class="modal fade" id="modal-borrar-carrera" 
             tabindex="-1" role="dialog" 
             aria-labelledby="titulo-alerta" 
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h3 class="modal-title" id="titulo-alerta">Borrar carrera:</h3>
                    </div>
                    <div class="modal-body">
                        <div class="container-fluid">
                            &iquest;Desea borrar la carrera <b id="nombreCarrera">####</b>&quest;<br><br>
                        </div>
                    </div>
                    <div class="modal-footer">
                        <button type="button" 
                            class="btn btn-danger btn-lg" 
                            name="btn-borrar-carrera" id="btn-borrar-carrera">
                            Borrar carrera</button>
                        <button type="button" 
                            class="btn btn-secondary btn-lg" 
                            name="btn-Cancelar" id="btn-Cancelar" 
                            data-dismiss="modal">Cancelar</button>
                    </div>
              </div>
            </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/administrador/admin.events.js"></script>
        <script type="text/javascript" src="js/administrador/admin.functions.js"></script>
        <script type="text/javascript" src="js/commons/carreras.ajax.js"></script>
        <script type="text/javascript" src="js/administrador/admin.ajax.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#btn-Refrescar').tooltip({
                    'placement': 'top',
                    'trigger': 'hover'
                });
                $('#btn-Agregar-Carrera').tooltip({
                    'placement': 'top',
                    'trigger': 'hover'
                });
            });
        </script>
    </body>
</html>
