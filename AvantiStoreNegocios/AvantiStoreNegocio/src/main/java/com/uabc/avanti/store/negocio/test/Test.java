/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.negocio.test;

import com.uabc.avanti.store.entidad.Almacen;
import com.uabc.avanti.store.entidad.Caja;
import com.uabc.avanti.store.entidad.CajaHasPersonal;
import com.uabc.avanti.store.entidad.Cliente;
import com.uabc.avanti.store.entidad.Movimientos;
import com.uabc.avanti.store.entidad.Personal;
import com.uabc.avanti.store.entidad.Producto;
import com.uabc.avanti.store.entidad.Proveedor;
import com.uabc.avanti.store.negocio.delegate.AlmacenDelegate;
import com.uabc.avanti.store.negocio.delegate.CajaDelegate;
import com.uabc.avanti.store.negocio.delegate.CajaHasPersonalDelegate;
import com.uabc.avanti.store.negocio.delegate.ClienteDelegate;
import com.uabc.avanti.store.negocio.delegate.MovimientosDelegate;
import com.uabc.avanti.store.negocio.delegate.PersonalDelegate;
import com.uabc.avanti.store.negocio.delegate.ProductoDelegate;
import com.uabc.avanti.store.negocio.delegate.ProveedorDelegate;
import org.hibernate.id.SequenceIdentityGenerator.Delegate;


/**
 *
 * @author Sonia Robles
 */
public class Test {
    
    public static void main(String[] args) {

        AlmacenDelegate almacenDelegate                 = new AlmacenDelegate();
        CajaDelegate cajaDelegate                       = new CajaDelegate();
        CajaHasPersonalDelegate cajaHasPersonalDelegate = new CajaHasPersonalDelegate();
        ClienteDelegate clienteDelegate                 = new ClienteDelegate();
        MovimientosDelegate movimientosDelegate         = new MovimientosDelegate();
        PersonalDelegate personalDelegate               = new PersonalDelegate();
        ProductoDelegate productoDelegate               = new ProductoDelegate();
        ProveedorDelegate proveedorDelegate             = new ProveedorDelegate();
        
       Almacen almacen= almacenDelegate.buscarPorId(147);
       
       if(almacen!=null){
           System.err.println("NOMBRE:"+almacen.getNumalm());
       }
       Caja caja = cajaDelegate.buscarPorId(147);
       if(caja!=null){
           System.err.println("NOMBRE:"+caja.getIdCaja());
       }
       CajaHasPersonal cajaHasPersonal = cajaHasPersonalDelegate.buscarPorId(147);
       if(cajaHasPersonal!=null){
           System.err.println("NOMBRE:"+cajaHasPersonal.getCaja());
       }
       Cliente cliente = clienteDelegate.buscarPorId(1);
       if(cliente!=null){
           System.err.println("NOMBRE:"+cliente.getNomcliente());
       }
       Movimientos movimientos = movimientosDelegate.buscarPorId(1);
       if(movimientos!=null){
           System.err.println("NOMBRE:"+movimientos.getCantidad());
       }
       Personal personal = personalDelegate.buscarPorId(1);
       if(personal !=null){
           System.err.println("NOMBRE:"+personal.getNombre());
       }
        Producto producto = productoDelegate.buscarPorId(1);
       if(producto !=null){
           System.err.println("NOMBRE:"+producto.getClave());
       }
       Proveedor proveedor = proveedorDelegate.buscarPorId(1);
       if(proveedor !=null){
           System.err.println("NOMBRE:"+proveedor.getNombreProveedor());
       }
    }
    
}
