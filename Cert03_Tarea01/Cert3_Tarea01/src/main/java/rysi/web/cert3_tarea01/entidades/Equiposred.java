/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.web.cert3_tarea01.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "EQUIPOSRED")
@XmlRootElement
@NamedQueries({
    @NamedQuery(name = "Equiposred.findAll", query = "SELECT e FROM Equiposred e"),
    @NamedQuery(name = "Equiposred.findByIdequipo", query = "SELECT e FROM Equiposred e WHERE e.idequipo = :idequipo"),
    @NamedQuery(name = "Equiposred.findByNombreequipo", query = "SELECT e FROM Equiposred e WHERE e.nombreequipo = :nombreequipo"),
    @NamedQuery(name = "Equiposred.findByIp", query = "SELECT e FROM Equiposred e WHERE e.ip = :ip"),
    @NamedQuery(name = "Equiposred.findByFechainstalacion", query = "SELECT e FROM Equiposred e WHERE e.fechainstalacion = :fechainstalacion"),
    @NamedQuery(name = "Equiposred.findByFechaultimocambio", query = "SELECT e FROM Equiposred e WHERE e.fechaultimocambio = :fechaultimocambio")})
public class Equiposred implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @Basic(optional = false)
    @NotNull
    @Column(name = "IDEQUIPO")
    private Integer idequipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 20)
    @Column(name = "NOMBREEQUIPO")
    private String nombreequipo;
    @Basic(optional = false)
    @NotNull
    @Size(min = 1, max = 15)
    @Column(name = "IP")
    private String ip;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAINSTALACION")
    @Temporal(TemporalType.DATE)
    private Date fechainstalacion;
    @Basic(optional = false)
    @NotNull
    @Column(name = "FECHAULTIMOCAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechaultimocambio;

    public Equiposred() {
    }

    public Equiposred(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public Equiposred(Integer idequipo, String nombreequipo, String ip, Date fechainstalacion, Date fechaultimocambio) {
        this.idequipo = idequipo;
        this.nombreequipo = nombreequipo;
        this.ip = ip;
        this.fechainstalacion = fechainstalacion;
        this.fechaultimocambio = fechaultimocambio;
    }

    public Integer getIdequipo() {
        return idequipo;
    }

    public void setIdequipo(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public String getNombreequipo() {
        return nombreequipo;
    }

    public void setNombreequipo(String nombreequipo) {
        this.nombreequipo = nombreequipo;
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public Date getFechainstalacion() {
        return fechainstalacion;
    }

    public void setFechainstalacion(Date fechainstalacion) {
        this.fechainstalacion = fechainstalacion;
    }

    public Date getFechaultimocambio() {
        return fechaultimocambio;
    }

    public void setFechaultimocambio(Date fechaultimocambio) {
        this.fechaultimocambio = fechaultimocambio;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idequipo != null ? idequipo.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Equiposred)) {
            return false;
        }
        Equiposred other = (Equiposred) object;
        if ((this.idequipo == null && other.idequipo != null) || (this.idequipo != null && !this.idequipo.equals(other.idequipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.web.cert3_tarea01.Equiposred[ idequipo=" + idequipo + " ]";
    }
    
}
