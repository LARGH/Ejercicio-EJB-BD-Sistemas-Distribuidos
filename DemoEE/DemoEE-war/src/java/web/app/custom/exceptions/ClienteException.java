package web.app.custom.exceptions;

/**
 *
 * @author Rafael Landa
 */
public class ClienteException extends Exception {
    
    private String mensaje;
    
    public ClienteException(String mensaje) {
        this.mensaje = mensaje;
    }

    /**
     * @return the mensaje
     */
    public String getMensaje() {
        return mensaje;
    }

    /**
     * @param mensaje the mensaje to set
     */
    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }
    
}