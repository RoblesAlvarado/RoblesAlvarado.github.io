package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Personal;
import com.uabc.avanti.store.negocio.delegate.PersonalDelegate;

/**
 *
 * @author Sonia Robles
 */
public class PersonalFacade {
    
    private final PersonalDelegate personalDelegate;
    
    public PersonalFacade() {
        
        personalDelegate=new PersonalDelegate();
    }
    
    
    public Personal buscarPersonal(Integer id){
    
        return  personalDelegate.buscarPorId(id);
    }
}
