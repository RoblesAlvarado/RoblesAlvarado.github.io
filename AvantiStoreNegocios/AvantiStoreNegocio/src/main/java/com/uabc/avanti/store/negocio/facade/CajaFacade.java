/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Caja;
import com.uabc.avanti.store.negocio.delegate.CajaDelegate;

/**
 *
 * @author Sonia Robles
 */
public class CajaFacade {

    private final CajaDelegate cajaDelegate;
    
    public CajaFacade() {
        
        cajaDelegate=new CajaDelegate();
    }
    
    
    public Caja buscarCaja(Integer id){
    
        return cajaDelegate.buscarPorId(id);
    }
    
   
    
}