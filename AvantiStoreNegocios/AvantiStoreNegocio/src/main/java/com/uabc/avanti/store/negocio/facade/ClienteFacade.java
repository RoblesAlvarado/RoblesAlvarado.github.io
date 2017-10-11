
package com.uabc.avanti.store.negocio.facade;

import com.uabc.avanti.store.entidad.Cliente;
import com.uabc.avanti.store.negocio.delegate.ClienteDelegate;

/**
 *
 * @author Sonia Robles
 */
public class ClienteFacade {
   
    private final ClienteDelegate clienteDelegate;
    
    public ClienteFacade() {
        
        clienteDelegate=new ClienteDelegate();
    }
    
    
    public Cliente buscarCliente(Integer id){
    
        return clienteDelegate.buscarPorId(id);
    }
    
   
     
}
