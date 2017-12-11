package client.ejb.screens.validations.implement;

import client.ejb.screens.forms.CRUD;
import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.KeyErrors;

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
                    ky.getMensajeNombreCarreraRequired());
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
