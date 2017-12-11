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
public interface AlumnoServiceRemote {

    void create(Alumno alumno);

    Alumno read(Alumno alumno);

    int update(Alumno alumno);

    int delete(Alumno alumno);

    List<Alumno> readAll();

    int darDeBajaAlumno(Alumno alumno);

    int inscribirAlumno(Alumno alumno, Carrera carrera);
    
}
