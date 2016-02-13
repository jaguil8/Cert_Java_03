package rysi.web.holaweb.entidades;

import java.io.Serializable;
import java.util.Collection;
import javax.persistence.Basic;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Size;

/**
 *
 * @author jaguilera
 */
@Entity
@Table(name = "CLUBS")
@NamedQueries({
    @NamedQuery(name = "Club.findAll", query = "SELECT c FROM Club c")})
public class Club implements Serializable {

    @OneToMany(cascade = CascadeType.ALL, mappedBy = "id")
    private Collection<Membresia> membresiaCollection;

    private static final long serialVersionUID = 1L;
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Basic(optional = false)
    @Column(name = "ID")
    private Integer id;
    @Size(max = 20)
    @Column(name = "NOMBRE")
    private String nombre;
    @Size(max = 1000)
    @Column(name = "DESCRIPCION")
    private String descripcion;

    public Club() {
    }

    public Club(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof Club)) {
            return false;
        }
        Club other = (Club) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "rysi.web.holaweb.entidades.Club[ id=" + id + " ]";
    }

    public Collection<Membresia> getMembresiaCollection() {
        return membresiaCollection;
    }

    public void setMembresiaCollection(Collection<Membresia> membresiaCollection) {
        this.membresiaCollection = membresiaCollection;
    }
    
}
