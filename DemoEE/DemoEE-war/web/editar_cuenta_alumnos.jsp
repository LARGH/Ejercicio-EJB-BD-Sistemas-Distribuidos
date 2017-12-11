<%-- 
    Document   : CU_Editar
    Created on : 16/10/2017, 06:07:04 PM
    Author     : Rafael Landa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Import Bootstrap 3-->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        <title>Editar perfil</title>
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
    <body>
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
                        <li><a href="inicio_alumno.jsp">Inicio</a></li>
                        <li class="active">Editar Perfil</li>
                    </ol>
                </div>
                <div class="row">
                    
                </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
    </body>
</html>
