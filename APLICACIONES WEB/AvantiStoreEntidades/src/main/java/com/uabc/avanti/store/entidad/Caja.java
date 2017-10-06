/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.uabc.avanti.store.entidad;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

/**
 *
 * @author xhendor
 */
@Entity
@Table(name = "caja")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Caja.findAll", query = "SELECT c FROM Caja c")})
public class Caja implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "id_caja")
    private Integer idCaja;
    @Column(name = "numcaja")
    private Integer numcaja;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "caja")
    private Collection<CajaHasPersonal> cajaHasPersonalCollection;
    @JoinColumn(name = "fk_id_documentos", referencedColumnName = "id_documentos")
    @ManyToOne(optional = false)
    private Documentos fkIdDocumentos;

    public Caja() {
    }

    public Caja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getIdCaja() {
        return idCaja;
    }

    public void setIdCaja(Integer idCaja) {
        this.idCaja = idCaja;
    }

    public Integer getNumcaja() {
        return numcaja;
    }

    public void setNumcaja(Integer numcaja) {
        this.numcaja = numcaja;
    }

    @XmlTransient
    public Collection<CajaHasPersonal> getCajaHasPersonalCollection() {
        return cajaHasPersonalCollection;
    }

    public void setCajaHasPersonalCollection(Collection<CajaHasPersonal> cajaHasPersonalCollection) {
        this.cajaHasPersonalCollection = cajaHasPersonalCollection;
    }

    public Documentos getFkIdDocumentos() {
        return fkIdDocumentos;
    }

    public void setFkIdDocumentos(Documentos fkIdDocumentos) {
        this.fkIdDocumentos = fkIdDocumentos;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idCaja != null ? idCaja.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Caja)) {
            return false;
        }
        Caja other = (Caja) object;
        if ((this.idCaja == null && other.idCaja != null) || (this.idCaja != null && !this.idCaja.equals(other.idCaja))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "com.uabc.avanti.store.entidad.Caja[ idCaja=" + idCaja + " ]";
    }
    
}
