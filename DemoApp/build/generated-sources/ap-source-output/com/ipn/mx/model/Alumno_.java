package com.ipn.mx.model;

import com.ipn.mx.model.Carrera;
import javax.annotation.Generated;
import javax.persistence.metamodel.ListAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-12-11T14:20:24")
@StaticMetamodel(Alumno.class)
public class Alumno_ { 

    public static volatile SingularAttribute<Alumno, String> apellidoPaterno;
    public static volatile SingularAttribute<Alumno, String> matricula;
    public static volatile ListAttribute<Alumno, Carrera> carreraList;
    public static volatile SingularAttribute<Alumno, String> nombre;
    public static volatile SingularAttribute<Alumno, String> email;
    public static volatile SingularAttribute<Alumno, String> apellidoMaterno;

}