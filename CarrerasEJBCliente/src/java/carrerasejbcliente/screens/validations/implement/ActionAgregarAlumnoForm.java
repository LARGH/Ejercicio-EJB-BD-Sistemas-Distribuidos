package carrerasejbcliente.screens.validations.implement;

import carrerasejbcliente.screens.forms.VFormAgregarAlumnos;
import carrerasejbcliente.screens.validations.ActionErrors;
import carrerasejbcliente.screens.validations.ActionValidDelegate;
import carrerasejbcliente.screens.validations.KeyErrors;

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
        }
        return errors;
    }
    
}
