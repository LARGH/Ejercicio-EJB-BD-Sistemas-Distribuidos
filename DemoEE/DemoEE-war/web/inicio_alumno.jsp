<%-- 
    Document   : CU_inicio
    Created on : 16/10/2017, 10:37:23 PM
    Author     : Rafael Landa
--%>

<%@page import="webappserver.net.mx.server.servidorweb.model.dto.Alumno"%>
<%@page import="webappserver.net.mx.server.servidorweb.utilities.UserSesion"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Import Bootstrap 3-->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        <title>Inicio alumnos</title>
        <style type="text/css">
            .scrollable-list {
                height: auto;
                max-height: 400px;
                overflow-x: hidden;
            }
            #img-user-icon {
                height: 50px;
                width: auto;
            }
            #btn-user {
                float: right;
                margin-bottom: 18px;
                margin-left: 20px;
                margin-top: 20px;
            }/*
            #drop-icon {
                height: auto;
            }*/
        </style>
    </head>
    <body onload="javascript: cargarCarreraAlumno( '<%=((Alumno)(request.getSession().getAttribute(UserSesion.getAttributeDatosUserType()))).getMatricula()%>' );"><!--  -->
        <div class="container">
            <div class="row">
                <div class="container">
                    <div class="row">
                        <div class="col-md-9 text-left">
                            <h2>Sistema de administraci&oacute;n de carreras</h2>
                        </div>
                        <div class="col-sm-6 col-md-3">
                            <div class="row"></div>
                            <div class="row">
                                <div id="btn-user">
                                    <!-- Split button -->
                                    <div class="btn-group">
                                        <button id="btn-icon-user" name="btn-icon-user" type="button" 
                                                class="btn btn-default">
                                            <span class="glyphicon glyphicon-user"></span>
                                        </button>
                                        <button id="btn-show-menu-user" name="btn-icon-user" type="button" 
                                                class="btn btn-default dropdown-toggle" 
                                                data-toggle="dropdown">
                                            <span class="caret"></span>
                                            <span class="sr-only">Toggle Dropdown</span>
                                        </button>
                                        <ul class="dropdown-menu" role="menu">
                                            <li><a href="#"><h4>Mi cuenta:</h4></a></li>
                                            <li class="divider"></li>
                                            <li><a href="inicio_alumno.jsp">Inicio</a></li>
                                            <li><a href="editar_cuenta_alumnos.jsp">Editar Perfil</a></li>
                                            <li class="divider"></li>
                                            <li><a href="index.jsp">Salir</a></li>
                                        </ul>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="row">
                    <ol class="breadcrumb">
                        <li class="active"><a href="#">Inicio</a></li>
                        <li class="active"><a href="editar_cuenta_alumnos.jsp">Editar Perfil</a></li>
                    </ol>
                </div>
                <div class="row">
                    <div class="well list-group">
                        <li href="#" class="list-group-item active">
                            <div class="row">
                                <div class="col-md-5 text-left">
                                    <h4>Mis carreras: </h4>
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
                                    <a href="buscar_carreras.jsp" role="button" id="btn-Buscar-Carrera" 
                                        class="btn btn-sm btn-default" 
                                        data-toggle="tooltip" title="Buscar carrera">
                                        <span class="glyphicon glyphicon-search"></span>
                                    </a>
                                </div>
                            </div>
                        </li>
                        <div id="content-list" class="scrollable-list"></div>
                    </div>
                </div>
            </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/alumnos/alumnos.ajax.js"></script>
        <script type="text/javascript">
            $(document).ready(function() {
                $('#btn-Buscar-Carrera').tooltip({
                    'placement': 'top',
                    'trigger': 'hover'
                });
                $('#cantidad-alumnos').tooltip({
                    'placement': 'bottom',
                    'trigger': 'hover'
                });
                $('#btn-show-menu-user').popover({
                    'placement': 'bottom',
                    'trigger': 'click',
                    'animation': true,
                    'html': true
                });
            });
        </script>
    </body>
</html>
