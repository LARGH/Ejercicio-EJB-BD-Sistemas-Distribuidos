package client.ejb.screens.validations;

import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Rafael Landa
 */
public class ActionErrors {
    
    private Map<KeyErrors, String> errors;

    public ActionErrors() {
        this.errors = new HashMap<>();
    }
    
    public void addError(KeyErrors key, String error) {
        this.errors.put(key, error);
    }

    public Map<KeyErrors, String> getErrors() {
        return errors;
    }

    public void setErrors(Map<KeyErrors, String> errors) {
        this.errors = errors;
    }
    
    public static String getErrors(ActionErrors errors) {
        StringBuilder mensaje = new StringBuilder("");
        errors.getErrors().entrySet().stream().forEach((entry) -> {
            KeyErrors key = entry.getKey();
            String value = entry.getValue();
            if (key == KeyErrors.EMPTY_BUSCAR) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_MATRICULA) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_NOMBRE_ALUMNO) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_AP_PATERNO_ALUMNO) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_AP_MATERNO_ALUMNO) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_EMAIL_ALUMNO) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_NOMBRE_CARRERA) {
                mensaje.append(value).append("\n");
            }
            if (key == KeyErrors.EMPTY_DESCRIPCION) {
                mensaje.append(value).append("\n");
            }
        });
        return mensaje.toString();
    }
    
}
