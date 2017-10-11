
package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Movimientos;
import com.uabc.avanti.store.negocio.delegate.MovimientosDelegate;

/**
 *
 * @author Sonia Robles
 */
public class MovimientosFacade {
    
    private final MovimientosDelegate movimientosDelegate;
    
    public MovimientosFacade() {
        
        movimientosDelegate=new MovimientosDelegate();
    }
    
    
    public Movimientos buscarMovimientos(Integer id){
    
        return  movimientosDelegate.buscarPorId(id);
    }
    
   
    
}
