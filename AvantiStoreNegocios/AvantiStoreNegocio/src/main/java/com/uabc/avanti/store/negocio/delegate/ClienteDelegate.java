package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Cliente;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;

/**
 *
 * @author Sonia Robles
 */
public class ClienteDelegate {

    public ClienteDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a cliente
     *
     * @param  Identificador del cliente
     * @return El numero de cliente
     *
     */
    public Cliente buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceClienteDAO().find(id);
        }
        return null;

    }
}