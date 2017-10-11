package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.CajaHasPersonal;
import com.uabc.avanti.store.negocio.delegate.CajaHasPersonalDelegate;

/**
 *
 * @author Sonia Robles
 */
public class CajaHasPersonalFacade {
    
    private final CajaHasPersonalDelegate cajaHasPersonalDelegate;
    
    public CajaHasPersonalFacade() {
        
        cajaHasPersonalDelegate=new CajaHasPersonalDelegate();
    }
    
    
    public CajaHasPersonal buscarCajaHasPersonal(Integer id){
    
        return cajaHasPersonalDelegate.buscarPorId(id);
    }
    
   
    
}
