
package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Producto;
import com.uabc.avanti.store.negocio.delegate.ProductoDelegate;

/**
 *
 * @author Sonia Robles
 */
public class ProductoFacade {
    
    private final ProductoDelegate productoDelegate;
    
    public ProductoFacade() {
        
        productoDelegate=new ProductoDelegate();
    }
    
    
    public Producto buscarProducto(Integer id){
    
        return  productoDelegate.buscarPorId(id);
    }
}
