package com.ipn.bean;

import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;
import java.util.List;
import javax.ejb.Remote;

/**
 *
 * @author Rafael Landa
 */
@Remote
public interface CarreraServiceRemote {

    void create(Carrera carrera);

    Carrera read(Carrera carrera);

    int update(Carrera carrera);

    int delete(Carrera carrera);

    List<Carrera> readAll();

    List<Alumno> obtenerInscritos(Carrera carrera);

    Carrera getById(Carrera carrera);
    
}
