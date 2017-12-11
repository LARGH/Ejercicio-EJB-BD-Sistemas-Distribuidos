package com.ipn.bean;

import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;
import java.util.ArrayList;
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
public class CarreraService implements CarreraServiceRemote {

    @PersistenceContext(unitName = "DemoEE-ejbPU")
    private EntityManager em;

    @Override
    public void create(Carrera carrera) {
        em.persist(carrera);
    }

    @Override
    public Carrera read(Carrera carrera) {
        TypedQuery<Carrera> query = 
            em.createNamedQuery("Carrera.findByIdCarrera", Carrera.class);
        query.setParameter("idCarrera", carrera.getIdCarrera());
        return query.getSingleResult();
    }

    @Override
    public int update(Carrera carrera) {
        Query query = 
            em.createQuery("UPDATE Carrera SET "
                + "nombre =:nombre, "
                + "descripcion =:descripcion, "
                + "status =:status "
                + "WHERE id_carrera =:idCarrera");
        query.setParameter("nombre", carrera.getNombre());
        query.setParameter("descripcion", carrera.getDescripcion());
        query.setParameter("status", carrera.getStatus());
        query.setParameter("idCarrera", carrera.getIdCarrera());
        return query.executeUpdate();
    }

    @Override
    public int delete(Carrera carrera) {
        Query query = 
            em.createQuery("UPDATE Carrera SET "
                + "status =:status "
                + "WHERE id_carrera =:idCarrera");
        query.setParameter("status", carrera.getStatus());
        query.setParameter("idCarrera", carrera.getIdCarrera());
        return query.executeUpdate();
    }

    @Override
    public List<Carrera> readAll() {
        TypedQuery<Carrera> query = 
            em.createNamedQuery("Carrera.findAll", Carrera.class);
        return query.getResultList();
    }

    @Override
    public List<Alumno> obtenerInscritos(Carrera carrera) {
        System.out.println("ID-CARRERA: " + carrera.getIdCarrera());
        List<Carrera> carreras = (List<Carrera>)
            em.createQuery("SELECT c FROM Carrera c JOIN FETCH c.alumnoList "
                    + "WHERE c.idCarrera =:idCarrera")
                    .setParameter("idCarrera", carrera.getIdCarrera())
                    .getResultList();
        for (Carrera carrera1 : carreras) {
            System.out.println("Carrera. " + carrera1.getNombre());
            for (Alumno alumno : carrera1.getAlumnoList()) {
                System.out.println("Alumno. " + alumno.getNombre());
                System.out.println("Alumno. " + alumno.getApellidoPaterno());
                System.out.println("Alumno. " + alumno.getApellidoMaterno());
                System.out.println("Alumno. " + alumno.getEmail());
            }
        }
        return (carreras.isEmpty()) ? 
                    new ArrayList<>(0) : 
                    carreras.get(0).getAlumnoList();
    }

    @Override
    public Carrera getById(Carrera carrera) {
        return em.find(Carrera.class, carrera.getIdCarrera());
    }
    
}
