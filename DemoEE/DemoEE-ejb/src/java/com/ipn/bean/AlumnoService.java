package com.ipn.bean;

import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

/**
 *
 * @author Rafael Landa
 */
@Stateless
public class AlumnoService implements AlumnoServiceRemote {

    @PersistenceContext(unitName = "DemoEE-ejbPU")
    private EntityManager em;

    @Override
    public void create(Alumno alumno) {
        em.persist(alumno);
    }

    @Override
    public Alumno read(Alumno alumno) {
        TypedQuery<Alumno> query = 
            em.createQuery("SELECT a FROM Alumno a"
                    + "WHERE a.matricula =:matricula", Alumno.class);
        query.setParameter("matricula", alumno.getMatricula());
        return query.getSingleResult();
    }

    @Override
    public int update(Alumno alumno) {
        Query query = em.createQuery("UPDATE Alumno SET "
                + "ALUMNO.nombre =:nombre, "
                + "ALUMNO.apellidoPaterno =:apPaterno, "
                + "ALUMNO.apellidoMaterno =:apMaterno, "
                + "ALUMNO.email =:email "
                + "WHERE ALUMNO.matricula =:matricula");
        query.setParameter("nombre", alumno.getNombre());
        query.setParameter("apPaterno", alumno.getApellidoPaterno());
        query.setParameter("apMaterno", alumno.getApellidoMaterno());
        query.setParameter("email", alumno.getEmail());
        query.setParameter("matricula", alumno.getMatricula());
        return query.executeUpdate();
    }

    @Override
    public int delete(Alumno alumno) {
        Query query = em.createQuery("DELETE FROM Alumno a "
                + "WHERE a.matricula =:matricula");
        query.setParameter("matricula", alumno.getMatricula());
        return query.executeUpdate();
    }

    @Override
    public List<Alumno> readAll() {
        TypedQuery<Alumno> query = 
            em.createQuery("SELECT a FROM Alumno a", Alumno.class);
        return query.getResultList();
    }

    @Override
    public int darDeBajaAlumno(Alumno alumno) {
        Carrera carrera = null;
        if (alumno.getCarreraList().size() == 1)
            carrera = alumno.getCarreraList().get(0);
        else return (-2);
        Query query = em.createNativeQuery("DELETE FROM inscritos "
                + "WHERE matricula =:matricula "
                + "AND id_carrera =:idCarrera");
        query.setParameter("matricula", alumno.getMatricula());
        query.setParameter("idCarrera", carrera.getIdCarrera());
        return query.executeUpdate();
    }

    @Override
    public int inscribirAlumno(Alumno alumno, Carrera carrera) {
        em.persist(alumno);
        Query query = 
            em.createNativeQuery("INSERT INTO inscritos VALUES (?, ?)");
        query.setParameter(1, alumno.getMatricula());
        query.setParameter(2, carrera.getIdCarrera());
        return query.executeUpdate();
    }
    
}
