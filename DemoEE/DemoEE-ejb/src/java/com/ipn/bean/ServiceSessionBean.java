package com.ipn.bean;

import com.ipn.mx.model.Carrera;
import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

/**
 *
 * @author Rafael Landa
 */
@Stateless
public class ServiceSessionBean implements ServiceSessionBeanRemote {

    @PersistenceContext(unitName = "DemoEE-ejbPU")
    private EntityManager em;
    
    @Override
    public void createCarrera(Carrera carrera) {
        em.persist(carrera);
    }
    
    public void persist(Object object) {
        em.persist(object);
    }

    @Override
    public List<Carrera> findAllCarreras() {
        TypedQuery<Carrera> query = 
            em.createQuery("SELECT c FROM Carrera c", Carrera.class);
        List<Carrera> carreras = query.getResultList();
        return carreras;
    }

    
    
}
