package client.ejb.screens.validations.implement;

import client.ejb.screens.forms.VFormAgregarAlumnos;
import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.KeyErrors;

/**
 *
 * @author Rafael Landa
 */
public class ActionAgregarAlumnoForm implements ActionValidDelegate {

    @Override
    public ActionErrors validateForm(Object form) {
        ActionErrors errors = new ActionErrors();
        KeyErrors ky = KeyErrors.VALIDATE_ERRORS;
        if (form instanceof VFormAgregarAlumnos) {
            if (((VFormAgregarAlumnos) form).getTxtMatricula()== null ||
                ((VFormAgregarAlumnos) form).getTxtMatricula().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_MATRICULA, 
                    ky.getMensajeMatriculaRequired());
            }
            if (((VFormAgregarAlumnos) form).getTxtNombreAlumno()== null ||
                ((VFormAgregarAlumnos) form).getTxtNombreAlumno().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_NOMBRE_ALUMNO, 
                    ky.getMensajeNombreAlumnoRequired());
            }
            if (((VFormAgregarAlumnos) form).getTxtApPaterno()== null ||
                ((VFormAgregarAlumnos) form).getTxtApPaterno().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_AP_PATERNO_ALUMNO, 
                    ky.getMensajeApPaternoAlumnoRequired());
            }
            if (((VFormAgregarAlumnos) form).getTxtApMaterno()== null ||
                ((VFormAgregarAlumnos) form).getTxtApMaterno().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_AP_MATERNO_ALUMNO, 
                    ky.getMensajeApMaternoAlumnoRequired());
            }
            if (((VFormAgregarAlumnos) form).getTxtEmail()== null ||
                ((VFormAgregarAlumnos) form).getTxtEmail().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_EMAIL_ALUMNO, 
                    ky.getMensajeEmailRequired());
            }
        }
        return errors;
    }
    
}
