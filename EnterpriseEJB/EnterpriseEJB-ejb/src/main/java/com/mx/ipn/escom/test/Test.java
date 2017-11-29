/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.escom.test;

import com.mx.ipn.escom.dao.AlumnoDAOLocal;
import com.mx.ipn.escom.model.Alumno;
import javax.ejb.EJB;

/**
 *
 * @author jonathan
 */
public class Test {
    
    @EJB
    private AlumnoDAOLocal dao;

    public AlumnoDAOLocal getDao() {
        return dao;
    }

    public void setDao(AlumnoDAOLocal dao) {
        this.dao = dao;
    }
    
    public static void main(String[] args) {
        Test obj = new Test();
        Alumno alumno = new Alumno("2016630383","Jonathan");
        obj.getDao().create(alumno);
    }
    
}
