
package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Movimientos;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;

/**
 *
 * @author Sonia Robles
 */
public class MovimientosDelegate {

    public MovimientosDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a movimientos
     *
     * @param  Identificador del movimiento
     * @return El numero de movimiento
     *
     */
    public Movimientos buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceMovimientosDAO().find(id);
        }
        return null;

    }    }