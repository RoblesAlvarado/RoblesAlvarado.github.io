package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.CajaHasPersonal;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Personal.class)
public class Personal_ { 

    public static volatile SingularAttribute<Personal, String> apellidoPaterno;
    public static volatile SingularAttribute<Personal, Integer> idPersonal;
    public static volatile CollectionAttribute<Personal, CajaHasPersonal> cajaHasPersonalCollection;
    public static volatile SingularAttribute<Personal, String> turno;
    public static volatile SingularAttribute<Personal, String> nombre;
    public static volatile SingularAttribute<Personal, String> apellidoMaterno;

}