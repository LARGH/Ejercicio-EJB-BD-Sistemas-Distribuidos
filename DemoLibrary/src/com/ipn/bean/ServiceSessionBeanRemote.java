package com.ipn.bean;

import com.ipn.mx.model.Carrera;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Rafael Landa
 */
@Remote
public interface ServiceSessionBeanRemote {

    void createCarrera(Carrera carrera);

    List<Carrera> findAllCarreras();
    
}
