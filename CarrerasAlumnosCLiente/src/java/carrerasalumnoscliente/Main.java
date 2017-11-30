package carrerasalumnoscliente;

import ejb.modules.sessions.NewSessionBeanRemote;
import javax.ejb.EJB;

/**
 *
 * @author Rafael Landa
 */
public class Main {

    @EJB
    private static NewSessionBeanRemote newSessionBean;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Object: " + newSessionBean.getSayHello("Hola msjdfjdfkdjfksdjfkdj"));
    }
    
}
