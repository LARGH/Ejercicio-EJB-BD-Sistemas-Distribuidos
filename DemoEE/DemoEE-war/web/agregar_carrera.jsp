<%-- 
    Document   : CU_AgregarCarrera
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
        <title>Agregar nueva carrera</title>
        <style type="text/css">
            textarea {
                resize: none;
                overflow: auto;
            }
            .input {
                
            }
        </style>
    </head>
    <body>
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
                        <li><a href="inicio_admin.jsp">Inicio</a></li>
                        <li class="active">Registrar Carrera</li>
                    </ol>
                </div>
                <div class="row">
                    <div class="jumbotron">
                        <div class="container">
                            <form id="frm-Agregar-Nueva-Carrera" 
                                  name="frm-Agregar-Nueva-Carrera"
                                  class="form-group"
                                  autocomplete="off">
                                <div class="row">
                                    <div id="message-alert-error">
                                        <div class="alert alert-danger alert-dismissable">
                                            <button type="button" id="closeAlertError" class="close">&times;</button>
                                            <strong>Error!</strong> Ha ocurrido un error interno del servidor al registrar la carrera.
                                        </div>
                                    </div>
                                    <div id="message-alert-success">
                                        <div class="alert alert-success alert-dismissable">
                                            <button type="button" id="closeAlertSuccess" class="close">&times;</button>
                                            <strong>Carrera registrada!</strong> La carrera que ha ingresado, ha sido registrada exitosamente.
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="form-group">
                                                <label for="nombre-carrera">Nombre de Carrera: </label>
                                                <!--<div id="form-input-add" class="input-group">
                                                    <input type="text" name="nombre-carrera" 
                                                        id="nombre-carrera" class="form-control" 
                                                        placeholder="Nombre de carrera" 
                                                        required>
                                                </div>-->
                                                <div class="input">
                                                    <input type="text" name="nombre-carrera" 
                                                            id="nombre-carrera" class="form-control" 
                                                            placeholder="Nombre de carrera" 
                                                            required>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="descripcion-carrera">Descripci&oacute;n: </label>
                                                <div class="input">
                                                    <textarea type="text" name="descripcion-carrera" 
                                                            id="descripcion-carrera" class="form-control" 
                                                            placeholder="Agrega una descripcion de la carrera..." 
                                                            required rows="5" cols="40"></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div id="message-info">
                                                    <div class="alert alert-info alert-dismissable">
                                                        <strong>Importante! </strong> Toda carrera se registra de forma <b>inactiva</b> por defecto.
                                                        Se tiene que activar posteriormente en: <b>Editar carrera</b>.
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-3"></div>
                                                <div class="col-md-6">
                                                    <button id="agregar-carrera" name="agregar-carrera"
                                                        class="btn btn-block bottom-left btn-primary">Agregar carrera</button>
                                                </div>
                                                <div class="col-md-3"></div>
                                            </div>
                                        </div>
                                    </div>
                                </div>
                            </form>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/plugins/jquery.validate.js"></script>
        <script type="text/javascript" src="js/administrador/admin.messages.js"></script>
        <script type="text/javascript" src="js/administrador/admin.events.js"></script>
        <script type="text/javascript" src="js/administrador/admin.functions.js"></script>
        <script type="text/javascript" src="js/administrador/admin.validations.js"></script>
        <script type="text/javascript" src="js/administrador/admin.ajax.js"></script>
    </body>
</html>
