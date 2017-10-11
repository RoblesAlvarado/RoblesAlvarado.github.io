
package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Caja;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;
import java.util.List;

public class CajaDelegate {

    public CajaDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a caja
     *
     * @param  Identificador del caja
     * @return El numero de caja
     *
     */
    public Caja buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceCajaDAO().find(id);
        }
        return null;

    }

    /**
     * *
     * Este metodo provee el listado de todos las cajas contenidas en la
     * base de datos
     *
     * @return Conjunto de cajas
     */
    public List<Caja> obtenerTodos() {

        List<Caja> cajas = ServiceLocator.getInstanceCajaDAO().findAll();
        boolean valido = false;

        for (Caja caja : cajas) {
            if (caja.getIdCaja() == 22) {

                valido = true;
            }
        }

        return valido ?  cajas : null;

    }

}
