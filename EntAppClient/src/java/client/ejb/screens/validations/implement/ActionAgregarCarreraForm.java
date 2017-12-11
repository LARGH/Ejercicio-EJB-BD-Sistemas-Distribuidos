package client.ejb.screens.validations.implement;

import client.ejb.screens.forms.VFormAgregarCarreras;
import client.ejb.screens.validations.ActionErrors;
import client.ejb.screens.validations.ActionValidDelegate;
import client.ejb.screens.validations.KeyErrors;

/**
 *
 * @author Rafael Landa
 */
public class ActionAgregarCarreraForm implements ActionValidDelegate {

    @Override
    public ActionErrors validateForm(Object form) {
        ActionErrors errors = new ActionErrors();
        KeyErrors ky = KeyErrors.VALIDATE_ERRORS;
        if (form instanceof VFormAgregarCarreras) {
            if (((VFormAgregarCarreras) form).getTxtNombreCarrera()== null ||
                ((VFormAgregarCarreras) form).getTxtNombreCarrera().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_NOMBRE_CARRERA, 
                    ky.getMensajeMatriculaRequired());
            }
            if (((VFormAgregarCarreras) form).getTxtDescripcion()== null ||
                ((VFormAgregarCarreras) form).getTxtDescripcion().isEmpty()) {
                errors.addError(KeyErrors.EMPTY_DESCRIPCION, 
                    ky.getMensajeDescripcionRequired());
            }
        }
        return errors;
    }
}
