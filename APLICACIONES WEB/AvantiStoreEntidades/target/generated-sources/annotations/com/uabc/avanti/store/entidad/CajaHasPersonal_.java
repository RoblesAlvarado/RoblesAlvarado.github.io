package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.Caja;
import com.uabc.avanti.store.entidad.CajaHasPersonalPK;
import com.uabc.avanti.store.entidad.Personal;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(CajaHasPersonal.class)
public class CajaHasPersonal_ { 

    public static volatile SingularAttribute<CajaHasPersonal, Date> fecha;
    public static volatile SingularAttribute<CajaHasPersonal, CajaHasPersonalPK> cajaHasPersonalPK;
    public static volatile SingularAttribute<CajaHasPersonal, Personal> personal;
    public static volatile SingularAttribute<CajaHasPersonal, Caja> caja;

}