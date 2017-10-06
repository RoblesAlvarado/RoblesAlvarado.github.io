/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.persistencia.test;

import com.uabc.avanti.store.entidad.Almacen;
import com.uabc.avanti.store.entidad.Producto;
import com.uabc.avanti.store.persistencia.BaseDAO;
import com.uabc.avanti.store.persistencia.DAO.AlmacenDAO;
import com.uabc.avanti.store.persistencia.integracion.ServiceLocator;
import java.util.List;

/**
 *
 * @author xhendor
 */
public class Prueba {
    
    
    
    public static void main(String[] args) {
//        
//        BaseDAO<Producto> baseDAO=new BaseDAO<>(Producto.class);
//        
//         List<Producto> productoLista=  baseDAO.findAll();
//        
//      
//         productoLista.forEach((producto) -> {
//             System.err.println("RESULTADO:["+producto.getNomprod()+"]");
//        });
//   }
    AlmacenDAO almacenDAO = new AlmacenDAO();
    List<Almacen> list = almacenDAO.findAll();
    for(Almacen almacen :list){
    
    System.err.println("Producto: " + almacen.getFkIdProducto().getNomprod());
    System.err.println("EXISTENCIA:" + almacen.getExistencia());
    
}
    List<Almacen> listaAlmacen = ServiceLocator.getInstanceAlmacenDAO().findAll();
    for(Almacen almacen : listaAlmacen){
        
    System.err.println("Producto: " + almacen.getFkIdProducto().getNomprod());
    
    System.err.println("EXISTENCIA:" + almacen.getExistencia());
    }
}
}
