package com.ipn.mx.model;

import com.ipn.mx.model.Alumno;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-11T14:20:24")
@StaticMetamodel(Carrera.class)
public class Carrera_ { 

    public static volatile SingularAttribute<Carrera, String> descripcion;
    public static volatile SingularAttribute<Carrera, Integer> idCarrera;
    public static volatile ListAttribute<Carrera, Alumno> alumnoList;
    public static volatile SingularAttribute<Carrera, String> nombre;
    public static volatile SingularAttribute<Carrera, Boolean> status;

}