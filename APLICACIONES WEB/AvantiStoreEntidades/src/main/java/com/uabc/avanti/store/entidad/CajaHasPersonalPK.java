/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.entidad;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author xhendor
 */
@Embeddable
public class CajaHasPersonalPK implements Serializable {

    @Basic(optional = false)
    @Column(name = "fk_id_caja")
    private int fkIdCaja;
    @Basic(optional = false)
    @Column(name = "fk_id_personal")
    private int fkIdPersonal;

    public CajaHasPersonalPK() {
    }

    public CajaHasPersonalPK(int fkIdCaja, int fkIdPersonal) {
        this.fkIdCaja = fkIdCaja;
        this.fkIdPersonal = fkIdPersonal;
    }

    public int getFkIdCaja() {
        return fkIdCaja;
    }

    public void setFkIdCaja(int fkIdCaja) {
        this.fkIdCaja = fkIdCaja;
    }

    public int getFkIdPersonal() {
        return fkIdPersonal;
    }

    public void setFkIdPersonal(int fkIdPersonal) {
        this.fkIdPersonal = fkIdPersonal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (int) fkIdCaja;
        hash += (int) fkIdPersonal;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajaHasPersonalPK)) {
            return false;
        }
        CajaHasPersonalPK other = (CajaHasPersonalPK) object;
        if (this.fkIdCaja != other.fkIdCaja) {
            return false;
        }
        if (this.fkIdPersonal != other.fkIdPersonal) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.avanti.store.entidad.CajaHasPersonalPK[ fkIdCaja=" + fkIdCaja + ", fkIdPersonal=" + fkIdPersonal + " ]";
    }
    
}
