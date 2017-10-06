package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.Almacen;
import com.uabc.avanti.store.entidad.Movimientos;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Producto.class)
public class Producto_ { 

    public static volatile SingularAttribute<Producto, String> descripcion;
    public static volatile CollectionAttribute<Producto, Almacen> almacenCollection;
    public static volatile SingularAttribute<Producto, String> clave;
    public static volatile SingularAttribute<Producto, Short> expira;
    public static volatile CollectionAttribute<Producto, Movimientos> movimientosCollection;
    public static volatile SingularAttribute<Producto, Integer> idProducto;
    public static volatile SingularAttribute<Producto, String> nomprod;

}