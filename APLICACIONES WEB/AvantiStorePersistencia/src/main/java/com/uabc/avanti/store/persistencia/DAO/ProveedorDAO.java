/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.persistencia.DAO;

import com.uabc.avanti.store.entidad.Proveedor;
import com.uabc.avanti.store.persistencia.BaseDAO;

/**
 *
 * @author Sonia Robles
 */
public class ProveedorDAO extends BaseDAO<Proveedor>{
    public ProveedorDAO(){
        super(Proveedor.class);
    }
}