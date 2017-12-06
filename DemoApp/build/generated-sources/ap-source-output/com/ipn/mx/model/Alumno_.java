package com.ipn.mx.model;

import com.ipn.mx.model.Carrera;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-05T21:57:20")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> apellidoPaterno;
    public static volatile SingularAttribute<Alumno, Carrera> idCarrera;
    public static volatile SingularAttribute<Alumno, String> matricula;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, String> apellidoMaterno;

}