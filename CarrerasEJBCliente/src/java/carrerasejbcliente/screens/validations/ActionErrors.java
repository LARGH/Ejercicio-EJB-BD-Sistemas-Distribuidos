package carrerasejbcliente.screens.validations;

import java.util.Map;
import java.util.Objects;

/**
 *
 * @author Rafael Landa
 */
public class ActionErrors {
    private Map<String, String> errors;

    public ActionErrors() {
    }

    @Override
    public int hashCode() {
        return super.hashCode(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final ActionErrors other = (ActionErrors) obj;
        if (!Objects.equals(this.errors, other.errors)) {
            return false;
        }
        return true;
    }
    
    
    
}
