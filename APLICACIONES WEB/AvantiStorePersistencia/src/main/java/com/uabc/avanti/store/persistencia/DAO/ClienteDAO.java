/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.persistencia.DAO;

import com.uabc.avanti.store.entidad.Cliente;
import com.uabc.avanti.store.persistencia.BaseDAO;

/**
 *
 * @author Sonia Robles
 */
public class ClienteDAO extends BaseDAO<Cliente>{
    public ClienteDAO(){
        super(Cliente.class);
    }
}