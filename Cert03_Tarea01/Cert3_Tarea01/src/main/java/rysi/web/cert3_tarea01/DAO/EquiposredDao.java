/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package rysi.web.cert3_tarea01.DAO;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import org.springframework.transaction.annotation.Transactional;
import rysi.web.cert3_tarea01.entidades.Equiposred;

/**
 *
 * @author jaguilera
 */
public class EquiposredDao {
    @PersistenceContext private EntityManager em;
    
    @Transactional
    public void persist(Equiposred er){
        em.persist(er);
    }
    
    public List<Equiposred> getAllEquiposred(){
        TypedQuery<Equiposred> query = em.createQuery("SELECT g FROM Equiposred g ORDER BY g.idequipo", Equiposred.class);
        return query.getResultList();
    }
}
