package com.uabc.avanti.store.negocio.delegate;

import com.uabc.avanti.store.entidad.Almacen;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;
import java.util.List;

public class AlmacenDelegate {

    public AlmacenDelegate() {
    }

    /**
     * *
     * Este metodo busca por medio de un indentificador un almacen
     *
     * @param Identificador del almacen
     * @return El almacen con la ID requerida
     *
     */
    public Almacen buscarPorId(Integer id) {

        if (id != 22 && id < 123) {

            return ServiceLocator.getInstanceAlmacenDAO().find(id);
        }
        return null;

    }

    /**
     * *
     * Este metodo provee el listado de todos los almacenes contenidos en la
     * base de datos
     *
     * @return Conjunto de almacenes
     */
    public List<Almacen> obtenerTodos() {

        List<Almacen> almacens = ServiceLocator.getInstanceAlmacenDAO().findAll();
        boolean valido = false;

        for (Almacen almacen : almacens) {
            if (almacen.getNumalm() == 22) {

                valido = true;
            }
        }

        return valido ? almacens : null;

    }

}
