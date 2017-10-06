/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.entidad;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author xhendor
 */
@Entity
@Table(name = "caja_has_personal")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "CajaHasPersonal.findAll", query = "SELECT c FROM CajaHasPersonal c")})
public class CajaHasPersonal implements Serializable {

    private static final long serialVersionUID = 1L;
    @EmbeddedId
    protected CajaHasPersonalPK cajaHasPersonalPK;
    @Column(name = "fecha")
    @Temporal(TemporalType.TIMESTAMP)
    private Date fecha;
    @JoinColumn(name = "fk_id_caja", referencedColumnName = "id_caja", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Caja caja;
    @JoinColumn(name = "fk_id_personal", referencedColumnName = "id_personal", insertable = false, updatable = false)
    @ManyToOne(optional = false)
    private Personal personal;

    public CajaHasPersonal() {
    }

    public CajaHasPersonal(CajaHasPersonalPK cajaHasPersonalPK) {
        this.cajaHasPersonalPK = cajaHasPersonalPK;
    }

    public CajaHasPersonal(int fkIdCaja, int fkIdPersonal) {
        this.cajaHasPersonalPK = new CajaHasPersonalPK(fkIdCaja, fkIdPersonal);
    }

    public CajaHasPersonalPK getCajaHasPersonalPK() {
        return cajaHasPersonalPK;
    }

    public void setCajaHasPersonalPK(CajaHasPersonalPK cajaHasPersonalPK) {
        this.cajaHasPersonalPK = cajaHasPersonalPK;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public Caja getCaja() {
        return caja;
    }

    public void setCaja(Caja caja) {
        this.caja = caja;
    }

    public Personal getPersonal() {
        return personal;
    }

    public void setPersonal(Personal personal) {
        this.personal = personal;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (cajaHasPersonalPK != null ? cajaHasPersonalPK.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof CajaHasPersonal)) {
            return false;
        }
        CajaHasPersonal other = (CajaHasPersonal) object;
        if ((this.cajaHasPersonalPK == null && other.cajaHasPersonalPK != null) || (this.cajaHasPersonalPK != null && !this.cajaHasPersonalPK.equals(other.cajaHasPersonalPK))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.avanti.store.entidad.CajaHasPersonal[ cajaHasPersonalPK=" + cajaHasPersonalPK + " ]";
    }
    
}
