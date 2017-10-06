package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.CajaHasPersonal;
import com.uabc.avanti.store.entidad.Documentos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Caja.class)
public class Caja_ { 

    public static volatile SingularAttribute<Caja, Documentos> fkIdDocumentos;
    public static volatile CollectionAttribute<Caja, CajaHasPersonal> cajaHasPersonalCollection;
    public static volatile SingularAttribute<Caja, Integer> numcaja;
    public static volatile SingularAttribute<Caja, Integer> idCaja;

}