package carrerasejbcliente.screens.validations.implement;

import carrerasejbcliente.screens.forms.VFormAgregarCarreras;
import carrerasejbcliente.screens.validations.ActionErrors;
import carrerasejbcliente.screens.validations.ActionValidDelegate;
import carrerasejbcliente.screens.validations.KeyErrors;

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
