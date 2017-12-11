package client.ejb.interfaces.implement;

import client.ejb.interfaces.ServiceCarreras;

import com.ipn.bean.CarreraServiceRemote;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;


/**
 *
 * @author Rafael Landa
 */
public class ServiceCarrerasImplement implements ServiceCarreras {

    @Override
    public CarreraServiceRemote getCarreraService() {
        try {
            Context c = new InitialContext();
            return (CarreraServiceRemote) 
                c.lookup(CarreraServiceRemote.class.getName());
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName())
                .log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }
    
}
