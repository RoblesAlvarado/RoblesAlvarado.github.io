
package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Almacen;
import com.uabc.avanti.store.negocio.delegate.AlmacenDelegate;
import java.util.List;

/**
 *
 * @author xhendor
 */
public class AlmacenFacade {

    private final AlmacenDelegate almacenDelegate;
    
    public AlmacenFacade() {
        
        almacenDelegate=new AlmacenDelegate();
    }
    
    
    public Almacen buscarAlmacen(Integer id){
    
        return almacenDelegate.buscarPorId(id);
    }
    
    public List<Almacen> obtenerTodos(){
    
        return almacenDelegate.obtenerTodos();
    }
    
}
