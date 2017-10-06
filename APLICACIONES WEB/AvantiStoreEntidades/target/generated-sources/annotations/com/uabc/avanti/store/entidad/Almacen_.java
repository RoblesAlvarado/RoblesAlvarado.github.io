package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.Producto;
import com.uabc.avanti.store.entidad.Proveedor;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Almacen.class)
public class Almacen_ { 

    public static volatile SingularAttribute<Almacen, Double> existencia;
    public static volatile SingularAttribute<Almacen, Producto> fkIdProducto;
    public static volatile SingularAttribute<Almacen, Integer> numalm;
    public static volatile SingularAttribute<Almacen, Integer> idAlmacen;
    public static volatile SingularAttribute<Almacen, Proveedor> fkIdProveedor;

}