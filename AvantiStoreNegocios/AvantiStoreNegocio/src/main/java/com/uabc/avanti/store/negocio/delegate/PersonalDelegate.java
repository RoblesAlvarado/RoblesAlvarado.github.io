package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Personal;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;

/**
 *
 * @author Sonia Robles
 */
public class PersonalDelegate {

    public PersonalDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a caja
     *
     * @param  Identificador del caja
     * @return El numero de caja
     *
     */
    public Personal buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstancePersonalDAO().find(id);
        }
        return null;

    }
}
