package com.uabc.avanti.store.negocio.integracion;

import com.uabc.avanti.store.negocio.facade.AlmacenFacade;
import com.uabc.avanti.store.negocio.facade.CajaFacade;
import com.uabc.avanti.store.negocio.facade.CajaHasPersonalFacade;
import com.uabc.avanti.store.negocio.facade.ClienteFacade;
import com.uabc.avanti.store.negocio.facade.MovimientosFacade;
import com.uabc.avanti.store.negocio.facade.PersonalFacade;
import com.uabc.avanti.store.negocio.facade.ProductoFacade;
import com.uabc.avanti.store.negocio.facade.ProveedorFacade;

/**
 *
 * @author Sonia Robles
 */
public class ServiceFacadeLocator {

    private static AlmacenFacade            almacenFacade;
    private static CajaFacade               cajaFacade;
    private static CajaHasPersonalFacade    cajaHasPersonalFacade;
    private static ClienteFacade            clienteFacade;
    private static MovimientosFacade        movimientosFacade;
    private static PersonalFacade           personalFacade;
    private static ProductoFacade           productoFacade;
    private static ProveedorFacade          proveedorFacade;

    public static AlmacenFacade getInstanceAlmacenDAO() {
        if (almacenFacade == null) {
            almacenFacade = new AlmacenFacade();
            return almacenFacade;
        } else {
            return almacenFacade;
        }
    }
     public static CajaFacade getInstanceCajaDAO() {
        if (cajaFacade == null) {
            cajaFacade = new CajaFacade();
            return cajaFacade;
        } else {
            return cajaFacade;
        }
    }
     public static CajaHasPersonalFacade getInstanceCajaHasPersonalDAO() {
        if (cajaHasPersonalFacade == null) {
            cajaHasPersonalFacade = new CajaHasPersonalFacade();
            return cajaHasPersonalFacade;
        } else {
            return cajaHasPersonalFacade;
        }
    }
    
     public static ClienteFacade getInstanceClienteDAO() {
        if (clienteFacade == null) {
            clienteFacade = new ClienteFacade();
            return clienteFacade;
        } else {
            return clienteFacade;
        }
    }
     
        public static MovimientosFacade getInstanceMovimientosDAO() {
        if (movimientosFacade == null) {
            movimientosFacade = new MovimientosFacade();
            return movimientosFacade;
        } else {
            return movimientosFacade;
        }
    }
        public static PersonalFacade getInstancePersonalDAO() {
        if (personalFacade == null) {
            personalFacade = new PersonalFacade();
            return personalFacade;
        } else {
            return personalFacade;
        }
    }
           public static ProductoFacade getInstanceProductoDAO() {
        if (productoFacade == null) {
            productoFacade = new ProductoFacade();
            return productoFacade;
        } else {
            return productoFacade;
        }
    }
           public static ProveedorFacade getInstanceProveedorDAO() {
        if (proveedorFacade == null) {
            proveedorFacade = new ProveedorFacade();
            return proveedorFacade;
        } else {
            return proveedorFacade;
        }
    }
           
}
