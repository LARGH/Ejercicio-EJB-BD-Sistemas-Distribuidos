/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package client.ejb.screens;

import com.ipn.bean.CarreraServiceRemote;
import com.ipn.mx.model.Alumno;
import com.ipn.mx.model.Carrera;
import java.util.List;
import javax.ejb.EJB;

/**
 *
 * @author rafal
 */
public class Test {

    @EJB
    private static CarreraServiceRemote carreraService;
    
    public static void main(String[] args) {
        Carrera carrera = new Carrera(1);
        List<Alumno> c = carreraService.obtenerInscritos(carrera);
        System.out.println("Alumnos obtenidos.");
        for (Alumno alumno : c) {
            System.out.println("Alumno. " + alumno.getNombre());
            System.out.println("Alumno. " + alumno.getApellidoPaterno());
            System.out.println("Alumno. " + alumno.getApellidoMaterno());
            System.out.println("Alumno. " + alumno.getEmail());
        }
    }
}
