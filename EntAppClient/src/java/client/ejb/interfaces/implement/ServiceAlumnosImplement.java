package client.ejb.interfaces.implement;


import client.ejb.interfaces.ServiceAlumnos;
import com.ipn.bean.AlumnoServiceRemote;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;

/**
 *
 * @author Rafael Landa
 */
public class ServiceAlumnosImplement implements ServiceAlumnos {

    @Override
    public AlumnoServiceRemote getAlumnoService() {
        try {
            Context c = new InitialContext();
            return (AlumnoServiceRemote) 
                c.lookup(AlumnoServiceRemote.class.getName());
        } catch (NamingException ne) {
            Logger.getLogger(getClass().getName())
                .log(Level.SEVERE, "exception caught", ne);
            throw new RuntimeException(ne);
        }
    }

}
