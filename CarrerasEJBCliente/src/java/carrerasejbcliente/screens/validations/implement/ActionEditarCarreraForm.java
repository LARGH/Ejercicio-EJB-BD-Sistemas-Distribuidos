package carrerasejbcliente.screens.validations.implement;

import carrerasejbcliente.screens.forms.CRUD;
import carrerasejbcliente.screens.validations.ActionErrors;
import carrerasejbcliente.screens.validations.ActionValidDelegate;
import carrerasejbcliente.screens.validations.KeyErrors;

/**
 *
 * @author Rafael Landa
 */
public class ActionEditarCarreraForm implements ActionValidDelegate {

    @Override
    public ActionErrors validateForm(Object form) {
        ActionErrors errors = new ActionErrors();
        KeyErrors ky = KeyErrors.VALIDATE_ERRORS;
        if (form instanceof CRUD) {
            if (((CRUD) form).getTxtNombreCarrera()== null ||
                ((CRUD) form).getTxtNombreCarrera().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_NOMBRE_CARRERA, 
                    ky.getMensajeMatriculaRequired());
            }
            if (((CRUD) form).getTxtDescripcion()== null ||
                ((CRUD) form).getTxtDescripcion().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_DESCRIPCION, 
                    ky.getMensajeDescripcionRequired());
            }
        }
        return errors;
    }

    
}
