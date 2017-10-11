/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.CajaHasPersonal;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;
import java.util.List;

public class CajaHasPersonalDelegate {

    public CajaHasPersonalDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a caja
     *
     * @param  Identificador del caja
     * @return El numero de caja
     *
     */
    public CajaHasPersonal buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceCajaHasPersonalDAO().find(id);
        }
        return null;

    }

 


}
