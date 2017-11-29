/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mx.ipn.escom.dao;

import com.mx.ipn.escom.model.Alumno;
import javax.ejb.Local;

/**
 *
 * @author jonathan
 */
@Local
public interface AlumnoDAOLocal {

    void create(Alumno alumno);
    void update(Alumno alumno);
    
}
