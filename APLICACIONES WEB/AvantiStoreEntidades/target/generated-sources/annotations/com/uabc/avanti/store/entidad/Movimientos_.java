package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.Documentos;
import com.uabc.avanti.store.entidad.Producto;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Movimientos.class)
public class Movimientos_ { 

    public static volatile SingularAttribute<Movimientos, Documentos> fkIdDocumentos;
    public static volatile SingularAttribute<Movimientos, Producto> fkIdProducto;
    public static volatile SingularAttribute<Movimientos, Integer> idMovimientos;
    public static volatile SingularAttribute<Movimientos, Integer> cantidad;

}