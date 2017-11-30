package ejb.modules.sessions;

import javax.ejb.Remote;

/**
 *
 * @author Rafael Landa
 */
@Remote
public interface NewSessionBeanRemote {

    String getSayHello(String saludo);

}
