<%-- 
    Document   : CU_EditarCarrera
    Created on : 16/10/2017, 06:07:04 PM
    Author     : Rafael Landa
--%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Import Bootstrap 3-->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        <title>Editar carrera</title>
        <style type="text/css">
            textarea {
                resize: none;
            }
            .input { }
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
                        <li>Editar Carrera</li>
                    </ol>
                </div>
                <div class="row">
                    <div class="jumbotron">
                        <div class="container">
                            <form id="frm-update-Carrera" 
                                  name="frm-update-Carrera"
                                  class="form-group">
                                <div class="row">
                                    <div id="message-alert-error">
                                        <div class="alert alert-danger alert-dismissable">
                                            <button type="button" id="closeAlertError" class="close">&times;</button>
                                            <strong>Error!</strong> Ha ocurrido un error interno del servidor al actualizar la carrera.
                                        </div>
                                    </div>
                                    <div id="message-alert-success">
                                        <div class="alert alert-success alert-dismissable">
                                            <button type="button" id="closeAlertSuccess" class="close">&times;</button>
                                            <strong>Carrera actualizada!</strong> La carrera que ha ingresado, ha sido actualizada exitosamente.
                                        </div>
                                    </div>
                                </div>
                                <div class="row">
                                    <div class="form-group">
                                        <div class="row">
                                            <div class="form-group">
                                                <label for="nombre-carrera">Nombre de Carrera: </label>
                                                <div class="input">
                                                    <input type="text" name="nombre-carrera" 
                                                            id="nombre-carrera" class="form-control" 
                                                            placeholder="Nombre de carrera" 
                                                            required 
                                                            value="<%=request.getParameter("name")%>">
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div>
                                                    <div>
                                                        <label for="estatus-carrera">Estatus de carrera: </label>
                                                    </div>
                                                    <div class="checkbox">
                                                        <label>
                                                            <c:if test="${param.status == true}">
                                                                <input type="checkbox" name="estatus-carrera" 
                                                                       id="estatus-carrera" checked="checked"> Estatus carrera activa
                                                            </c:if>
                                                            <c:if test="${param.status == false}">
                                                                <input type="checkbox" name="estatus-carrera" 
                                                                    id="estatus-carrera"> Estatus carrera activa
                                                            </c:if>
                                                        </label>
                                                    </div>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <label for="descripcion-carrera">Descripci&oacute;n: </label>
                                                <div class="input">
                                                    <textarea type="text" name="descripcion-carrera" 
                                                            id="descripcion-carrera" class="form-control" 
                                                            placeholder="Agrega una descripcion de la carrera..." 
                                                            required rows="5" cols="40"><%=request.getParameter("desc")%></textarea>
                                                </div>
                                            </div>
                                            <div class="form-group">
                                                <div class="col-md-3"></div>
                                                <div class="col-md-6">
                                                    <button type="button" id="btn-update-Carrera" name="btn-update-Carrera" 
                                                        data-id-carrera="<%=request.getParameter("id")%>"
                                                        class="btn btn-block btn-primary">Actualizar Carrera</button>
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
        <script type="text/javascript" src="js/administrador/admin.validations.js"></script>
        <script type="text/javascript" src="js/administrador/admin.ajax.js"></script>
    </body>
</html>
