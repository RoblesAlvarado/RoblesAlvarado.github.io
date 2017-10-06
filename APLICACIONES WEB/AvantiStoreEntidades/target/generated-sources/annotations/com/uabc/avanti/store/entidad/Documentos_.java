package com.uabc.avanti.store.entidad;

import com.uabc.avanti.store.entidad.Caja;
import com.uabc.avanti.store.entidad.Cliente;
import com.uabc.avanti.store.entidad.Movimientos;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.CollectionAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.5.2.v20140319-rNA", date="2017-09-29T19:49:14")
@StaticMetamodel(Documentos.class)
public class Documentos_ { 

    public static volatile SingularAttribute<Documentos, Date> fecha;
    public static volatile SingularAttribute<Documentos, Cliente> fkIdCliente;
    public static volatile SingularAttribute<Documentos, Double> iva;
    public static volatile SingularAttribute<Documentos, Short> cancelado;
    public static volatile CollectionAttribute<Documentos, Movimientos> movimientosCollection;
    public static volatile SingularAttribute<Documentos, Double> descuento;
    public static volatile SingularAttribute<Documentos, String> numdoc;
    public static volatile SingularAttribute<Documentos, Integer> idDocumentos;
    public static volatile CollectionAttribute<Documentos, Caja> cajaCollection;
    public static volatile SingularAttribute<Documentos, Double> importe;

}