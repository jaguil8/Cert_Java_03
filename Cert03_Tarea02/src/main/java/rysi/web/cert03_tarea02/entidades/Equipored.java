package rysi.web.cert03_tarea02.entidades;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "EQUIPOSRED")
@NamedQueries({
    @NamedQuery(name = "Equipored.findAll", query = "SELECT e FROM Equipored e")})
public class Equipored implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
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
    @Column(name = "FECHAINSTALACION")
    @Temporal(TemporalType.DATE)
    private Date fechainstalacion;
    @Column(name = "FECHAULTIMOCAMBIO")
    @Temporal(TemporalType.DATE)
    private Date fechaultimocambio;

    public Equipored() {
    }

    public Equipored(Integer idequipo) {
        this.idequipo = idequipo;
    }

    public Equipored(Integer idequipo, String nombreequipo, String ip) {
        this.idequipo = idequipo;
        this.nombreequipo = nombreequipo;
        this.ip = ip;
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
        if (!(object instanceof Equipored)) {
            return false;
        }
        Equipored other = (Equipored) object;
        if ((this.idequipo == null && other.idequipo != null) || (this.idequipo != null && !this.idequipo.equals(other.idequipo))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.web.cert03_tarea02.entidades.Equipored[ idequipo=" + idequipo + " ]";
    }
    
}
