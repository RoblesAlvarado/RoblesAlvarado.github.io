
package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Producto;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;

/**
 *
 * @author Sonia Robles
 */
public class ProductoDelegate {

    public ProductoDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador a producto
     *
     * @param  Identificador del producto
     * @return El numero de producto
     *
     */
    public Producto buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceProductoDAO().find(id);
        }
        return null;

    }
    
}
