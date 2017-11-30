package ejb.modules.sessions;

import javax.ejb.Stateless;

/**
 *
 * @author Rafael Landa
 */
@Stateless
public class NewSessionBean implements NewSessionBeanRemote {

    @Override
    public String getSayHello(String saludo) {
        return saludo;
    }

    

    
}
