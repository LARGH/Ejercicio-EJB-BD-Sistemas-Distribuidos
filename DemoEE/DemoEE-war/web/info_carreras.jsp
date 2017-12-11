<%-- 
    Document   : CU_VerCarreras
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
        <title>Carrera: </title>
        <style type="text/css">
            .scrollable-list {
                height: auto;
                max-height: 400px;
                overflow-x: hidden;
            }
        </style>
    </head>
    <body onload="javascript: cargarListaAlumnosPorCarrera('content-list', <%=request.getParameter("id")%>, '<%=request.getParameter("name")%>');">
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
                        <li class="active">Ver datos de carrera</li>
                    </ol>
                </div>
                <div class="row">
                    <div class="jumbotron">
                        <div class="container">
                            <div class="row">
                                <div class="form-group">
                                    <div class="col-lg-12">
                                        <label for="nombre-carrera">Nombre de Carrera: </label>
                                        <input type="text" name="nombre-carrera" 
                                            id="nombre-carrera" class="form-control"
                                            value="<%=request.getParameter("name")%>"
                                            placeholder="Nombre de carrera" value="Carrera" 
                                            data-id-input="<%=request.getParameter("id")%>" disabled>
                                    </div>
                                    <div class="col-lg-12">
                                        <label for="nombre-carrera">Descripci&oacute;n de Carrera: </label>
                                        <input type="text" name="nombre-carrera" 
                                            id="nombre-carrera" class="form-control"
                                            value="<%=request.getParameter("name")%>"
                                            placeholder="Nombre de carrera" value="Carrera" 
                                            data-id-input="<%=request.getParameter("desc")%>" disabled>
                                    </div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
                <div class="row">
                    <div class="jumbotron">
                        <div class="container">
                            <div class="row">
                                <div class="list-group">
                                    <li href="#" class="list-group-item active">
                                        <div class="row">
                                            <div class="col-md-5 text-left">
                                                <h4>Lista de alumnos: </h4>
                                            </div>
                                            <div class="col-md-5 text-left">
                                                <form id="frm-encontrar-nombres">
                                                    <div class="col-lg-10">
                                                        <div class="input-group">
                                                            <input type="text" class="form-control" placeholder="Buscar alumnos...">
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
                                                    data-toggle="tooltip" title="Actualizar lista">
                                                    <span class="glyphicon glyphicon-repeat"></span>
                                                </a>
                                            </div>
                                        </div>
                                    </li>
                                    <div id="content-list" class="scrollable-list"></div>
                                </div>
                            </div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/administrador/admin.functions.js"></script>
        <script type="text/javascript" src="js/administrador/admin.events.js"></script>
        <script type="text/javascript" src="js/commons/carreras.ajax.js"></script>
    </body>
</html>
