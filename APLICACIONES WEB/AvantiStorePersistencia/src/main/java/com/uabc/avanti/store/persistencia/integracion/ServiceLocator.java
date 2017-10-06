
package com.uabc.avanti.store.persistencia.integracion;

import com.uabc.avanti.store.persistencia.DAO.AlmacenDAO;
import com.uabc.avanti.store.persistencia.DAO.CajaDAO;
import com.uabc.avanti.store.persistencia.DAO.CajaHasPersonalDAO;
import com.uabc.avanti.store.persistencia.DAO.CajaHasPersonalPKDAO;
import com.uabc.avanti.store.persistencia.DAO.ClienteDAO;
import com.uabc.avanti.store.persistencia.DAO.DocumentosDAO;
import com.uabc.avanti.store.persistencia.DAO.MovimientosDAO;
import com.uabc.avanti.store.persistencia.DAO.PersonalDAO;
import com.uabc.avanti.store.persistencia.DAO.ProductoDAO;
import com.uabc.avanti.store.persistencia.DAO.ProveedorDAO;

/**
 *
 * @author Sonia Robles
 */
public class ServiceLocator {

    private static AlmacenDAO almacenDAO;
    
    public static AlmacenDAO getInstanceAlmacenDAO(){
        if(almacenDAO == null){
        
            almacenDAO = new AlmacenDAO();
            return almacenDAO;
        }else{
                    return almacenDAO;
                    }
        }  
    
    private static CajaDAO cajaDAO;
    
    public static CajaDAO getInstanceCajaDAO(){
        if(cajaDAO == null){
        
            cajaDAO = new CajaDAO();
            return cajaDAO;
        }else{
                    return cajaDAO;
                    }
        }  
    
     private static CajaHasPersonalDAO cajaHasPersonalDAO;
    
    public static CajaHasPersonalDAO getInstanceCajaHasPersonalDAO(){
        if(cajaHasPersonalDAO == null){
        
            cajaHasPersonalDAO = new CajaHasPersonalDAO();
            return cajaHasPersonalDAO;
        }else{
                    return cajaHasPersonalDAO;
                    }
        }  

     private static CajaHasPersonalPKDAO cajaHasPersonalPKDAO;
    
    public static CajaHasPersonalPKDAO getInstanceCajaHasPersonalPKDAO(){
        if(cajaHasPersonalPKDAO == null){
        
            cajaHasPersonalPKDAO = new CajaHasPersonalPKDAO();
            return cajaHasPersonalPKDAO;
        }else{
                    return cajaHasPersonalPKDAO;
                    }
        } 
    
     private static ClienteDAO clienteDAO;
    
    public static ClienteDAO getInstanceClienteDAO(){
        if(clienteDAO == null){
        
            clienteDAO = new ClienteDAO();
            return clienteDAO;
        }else{
                    return clienteDAO;
                    }
        } 
    private static DocumentosDAO documentosDAO;
    
    public static DocumentosDAO getInstanceDocumentosDAO(){
        if(documentosDAO == null){
        
            documentosDAO = new DocumentosDAO();
            return documentosDAO;
        }else{
                    return documentosDAO;
                    }
        } 
    
    private static MovimientosDAO movimientosDAO;
    
    public static MovimientosDAO getInstanceMovimientosDAO(){
        if(movimientosDAO == null){
        
            movimientosDAO = new MovimientosDAO();
            return movimientosDAO;
        }else{
                    return movimientosDAO;
                    }
        } 
    
     private static PersonalDAO personalDAO;
    
    public static PersonalDAO getInstancePersonalDAO(){
        if(personalDAO == null){
        
            personalDAO = new PersonalDAO();
            return personalDAO;
        }else{
                    return personalDAO;
                    }
        } 
    private static ProductoDAO productoDAO;
    
    public static ProductoDAO getInstanceProductoDAO(){
        if(productoDAO == null){
        
            productoDAO = new ProductoDAO();
            return productoDAO;
        }else{
                    return productoDAO;
                    }
        } 
    
    private static ProveedorDAO proveedorDAO;
    
    public static ProveedorDAO getInstanceProveedorDAO(){
        if(proveedorDAO == null){
        
            proveedorDAO = new ProveedorDAO();
            return proveedorDAO;
        }else{
                    return proveedorDAO;
                    }
        } 
    
}
