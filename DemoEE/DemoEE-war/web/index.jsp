<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--Import Bootstrap 3-->
        <link type="text/css" rel="stylesheet" href="css/bootstrap.min.css">
        <title>Carreras Alumnos</title>
    </head>
    <body>
        <div class="container">
            <div class="row">
                <div class="container">
                    <h2>Sistema de administración de carreras</h2>
                </div>
            </div>
            <div class="row">
                <div class="jumbotron">
                    <div class="container">
                        <div class="row">
                            <div class="col-lg-3"></div>
                            <div class="col-lg-6">
                                <h3>Accede mediante los siguientes usuarios</h3>
                                <h4>Administra y Visualiza nuevas carreras, <br> inscribete</h4><br>
                            </div>
                            <div class="col-lg-3"></div>
                        </div>
                        <div class="row">
                            <div class="col-lg-3"></div>
                            <div class="col-lg-6">
                                <p align="center"><a href="#modalRegistro" 
                                    data-toggle="modalRegistro" id="md-frm-registrar" name="md-frm-registrar">Crear nueva cuenta</a></p>
                            </div>
                            <div class="col-lg-3"></div>
                        </div>
                        <div class="row">
                            <div class="col-md-1"></div>
                            <div class="col-md-10">
                                <div class="btn-group-lg">
                                    <button type="button" id="btnForAlumno" 
                                        class="btn btn-primary btn-lg btn-block">Soy un Alumno</button>
                                    <button type="button" id="btnForAdministrador" 
                                        class="btn btn-warning btn-lg btn-block">Soy un Administrador</button>
                                </div>
                            </div>
                            <div class="col-md-1"></div>
                        </div>
                    </div>
                </div>
            </div>
        </div>
        <!-- modal formulario acceso al sistema -->
        <div class="modal fade" id="modalLogin" 
             tabindex="-1" role="dialog" 
             aria-labelledby="tituloFormulario" 
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h3 class="modal-title" id="tituloFormulario">Formulario de acceso:</h3>
                    </div>
                    <form id="frm-Acceso-Principal"
                          accept-charset="UTF-8" 
                          enctype="application/x-www-form-urlencoded"
                          name="frm-Acceso-Principal" 
                          class="form-horizontal" 
                          role="form">
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div id="message-alert-error">
                                    <div id="DataError" class="alert alert-danger alert-dismissable">
                                        <button type="button" id="closeAlert" class="close">&times;</button>
                                        <strong>Error!</strong> Favor de verificar los datos proporcionados.
                                    </div>
                                    <div id="serverError" class="alert alert-danger alert-dismissable">
                                        <button type="button" id="closeAlert" class="close">&times;</button>
                                        <strong>Error!</strong> El servidor no est&aacute; en linea.
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="clave_usuario">Nombre de usuario: </label>
                                    <div id="form-input">
                                        <input type="text" name="clave_usuario" 
                                            id="clave-usuario" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Nombre de usuario" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="clave_password">Contrase&ntilde;a: </label>
                                    <div id="form-input">
                                        <input type="password" name="clave_password" 
                                            id="clave-password" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Contraseña" required>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" 
                                    class="btn btn-primary btn-lg" 
                                    name="btn-Acceso" id="btn-Acceso">Acceder</button>
                                <button type="button" 
                                    class="btn btn-secondary btn-lg" 
                                    name="btn-Cerrar" id="btn-Cerrar" 
                                    data-dismiss="modal">Cerrar</button>
                            </div>
                        </div>
                    </form>
              </div>
            </div>
        </div>
        <!-- modal formulario registro al sistema -->
        <div class="modal fade" id="modalRegistro" 
             tabindex="-1" role="dialog" 
             aria-labelledby="tituloFormularioRegistro" 
             aria-hidden="true">
            <div class="modal-dialog" role="document">
                <div class="modal-content">
                    <div class="modal-header">
                        <button type="button" class="close" data-dismiss="modal" aria-label="Close">
                            <span aria-hidden="true">&times;</span>
                        </button>
                        <h3 class="modal-title" id="tituloFormularioRegistro">Formulario de registro:</h3>
                    </div>
                    <form id="frm-registro-usuario" name="frm-registro-usuario" class="form-horizontal" role="form">
                        <div class="modal-body">
                            <div class="container-fluid">
                                <div class="form-group">
                                    <label for="nombre-usuario">Nombre: </label>
                                    <div id="form-input">
                                        <input type="text" name="nombre-usuario" 
                                            id="nombre-usuario" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe tu nombre" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap-paterno-usuario">Apellido paterno: </label>
                                    <div id="form-input">
                                        <input type="text" name="ap-paterno-usuario" 
                                            id="ap-paterno-usuario" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe tu apellido paterno" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="ap-materno-usuario">Apellido materno: </label>
                                    <div id="form-input">
                                        <input type="text" name="ap-materno-usuario" 
                                            id="ap-materno-usuario" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe tu apellido materno" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="correo-electronico">Correo electronico: </label>
                                    <div id="form-input">
                                        <input type="text" name="correo-electronico" 
                                            id="correo-electronico" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe tu correo electronico" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="clave_usuario">Nombre de usuario: </label>
                                    <div id="form-input">
                                        <input type="text" name="clave_usuario" 
                                            id="clave_usuario" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe el nombre de usuario" required>
                                    </div>
                                </div>
                                <div class="form-group">
                                    <label for="clave_password">Contrase&ntilde;a: </label>
                                    <div id="form-input">
                                        <input type="password" name="clave_password" 
                                            id="clave_password" class="form-control" 
                                            autocomplete="off"
                                            placeholder="Escribe tu contraseña" required>
                                    </div>
                                </div>
                            </div>
                            <div class="modal-footer">
                                <button type="button" 
                                    class="btn btn-primary btn-lg" 
                                    name="btn-registrar" id="btn-registrar">Registrar</button>
                                <button type="button" 
                                    class="btn btn-secondary btn-lg" 
                                    name="btn-Cerrar" id="btn-Cerrar" 
                                    data-dismiss="modal">Cerrar</button>
                            </div>
                        </div>
                    </form>
              </div>
            </div>
        </div>
        <!--Import jQuery-->
        <script type="text/javascript" src="js/jquery.js"></script>
        <script type="text/javascript" src="js/tether.min.js"></script>
        <script type="text/javascript" src="js/bootstrap.min.js"></script>
        <script type="text/javascript" src="js/plugins/jquery.validate.js"></script>
        <script type="text/javascript" src="js/objects/frmAccesoPrincipal.js"></script>
        <script type="text/javascript" src="js/objects/methods.validation.js"></script>
        <script type="text/javascript" src="js/index.events.js"></script>
        <script type="text/javascript" src="js/index.validations.js"></script>
        <script type="text/javascript" src="js/index.ajax.js"></script>
    </body>
</html>