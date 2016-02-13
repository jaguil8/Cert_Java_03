package rysi.web.holaweb.oad;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import rysi.web.holaweb.entidades.Club;

/**
 *
 * @author jaguilera
 */
public interface ClubOad extends JpaRepository<Club, Integer>{
    
    public List<Club> findByNomnbreContaining(String cadena);
}
