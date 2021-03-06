package client.ejb.screens.validations;

/**
 *
 * @author Rafael Landa
 */
public enum KeyErrors {
    EMPTY_MATRICULA, 
    EMPTY_NOMBRE_ALUMNO,
    EMPTY_AP_PATERNO_ALUMNO,
    EMPTY_AP_MATERNO_ALUMNO,
    EMPTY_EMAIL_ALUMNO,
    EMPTY_NOMBRE_CARRERA,
    EMPTY_BUSCAR,
    EMPTY_DESCRIPCION,
    VALIDATE_ERRORS;
    
    public final String keyErrorEmptyMatricula = "error.empty.matricula";
    public final String keyErrorEmptyNombreAlumno = "error.empty.nombrealumno";
    public final String keyErrorEmptyApPaternoAlumno = "error.empty.appaterno";
    public final String keyErrorEmptyApMaternoAlumno = "error.empty.apmaterno";
    public final String keyErrorEmptyNombreCarrera = "error.empty.nombrecarrea";
    public final String keyErrorEmptyEmail = "error.empty.email";
    public final String keyErrorEmptyBuscar = "error.empty.buscar";
    public final String keyErrorEmptyDescripcion = "error.empty.descripcion";

    KeyErrors() {
    }
    
    public String getMensajeMatriculaRequired() {
        return "Campo matricula requerido.";
    }
    
    public String getMensajeNombreAlumnoRequired() {
        return "Campo nombre alumno requerido.";
    }
    
    public String getMensajeApPaternoAlumnoRequired() {
        return "Campo apellido paterno requerido.";
    }
    
    public String getMensajeApMaternoAlumnoRequired() {
        return "Campo apellido materno requerido.";
    }
    
    public String getMensajeNombreCarreraRequired() {
        return "Campo nombre carrera requerido.";
    }
    
    public String getMensajeEmailRequired() {
        return "Campo correo electronico requerido.";
    }
    
    public String getMensajeBuscarRequired() {
        return "Campo de busqueda requerido.";
    }
    
    public String getMensajeDescripcionRequired() {
        return "Campo descripcion carrera requerido.";
    }
    
};