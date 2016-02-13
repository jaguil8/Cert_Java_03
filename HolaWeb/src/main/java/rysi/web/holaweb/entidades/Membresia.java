package rysi.web.holaweb.entidades;

import java.io.Serializable;
import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "MEMBRESIAS")
public class Membresia implements Serializable {

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "IDMEMBRESIA")
    private Integer idmembresia;
    @JoinColumn(name = "IDALUMNO", referencedColumnName = "IDALUMNO")
    @ManyToOne(optional = false)
    private Alumno idalumno;
    @JoinColumn(name = "ID", referencedColumnName = "ID")
    @ManyToOne(optional = false)
    private Club id;

    public Membresia() {
    }

    public Membresia(Integer idmembresia) {
        this.idmembresia = idmembresia;
    }

    public Integer getIdmembresia() {
        return idmembresia;
    }

    public void setIdmembresia(Integer idmembresia) {
        this.idmembresia = idmembresia;
    }

    public Alumno getIdalumno() {
        return idalumno;
    }

    public void setIdalumno(Alumno idalumno) {
        this.idalumno = idalumno;
    }

    public Club getId() {
        return id;
    }

    public void setId(Club id) {
        this.id = id;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (idmembresia != null ? idmembresia.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Membresia)) {
            return false;
        }
        Membresia other = (Membresia) object;
        if ((this.idmembresia == null && other.idmembresia != null) || (this.idmembresia != null && !this.idmembresia.equals(other.idmembresia))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.web.holaweb.entidades.Membresia[ idmembresia=" + idmembresia + " ]";
    }
    
}
