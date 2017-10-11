
package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Proveedor;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;

/**
 *
 * @author Sonia Robles
 */
public class ProveedorDelegate {

    public ProveedorDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a proveedor
     *
     * @param  Identificador del proveedor
     * @return El numero de proveedor
     *
     */
    public Proveedor buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceProveedorDAO().find(id);
        }
        return null;

    }
}
