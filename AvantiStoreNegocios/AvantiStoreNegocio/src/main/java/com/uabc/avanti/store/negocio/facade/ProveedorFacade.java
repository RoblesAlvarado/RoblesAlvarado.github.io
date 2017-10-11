package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Proveedor;
import com.uabc.avanti.store.negocio.delegate.ProveedorDelegate;

/**
 *
 * @author Sonia Robles
 */
public class ProveedorFacade {
    
    private final ProveedorDelegate proveedorDelegate;
    
    public ProveedorFacade() {
        
        proveedorDelegate=new ProveedorDelegate();
    }
    
    
    public Proveedor buscarProveedor(Integer id){
    
        return  proveedorDelegate.buscarPorId(id);
    }
}
