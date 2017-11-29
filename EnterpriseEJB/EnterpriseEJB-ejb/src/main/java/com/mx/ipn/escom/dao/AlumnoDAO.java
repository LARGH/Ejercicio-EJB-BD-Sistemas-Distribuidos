/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.escom.dao;

import com.mx.ipn.escom.model.Alumno;
import javax.ejb.EJB;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

/**
 *
 * @author jonathan
 */
@Stateless
public class AlumnoDAO implements AlumnoDAOLocal {
    
    @PersistenceContext(unitName = "jdbc/session")
    private EntityManager em;
    
    
    @Override
    public void create(Alumno alumno) {
        em.persist(alumno);
    }
    
    @Override
    public void update(Alumno alumno) {
        em.merge(alumno);
    }
    
   
}
