package rysi.web.holaweb.control;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rysi.web.holaweb.entidades.Club;
import rysi.web.holaweb.oad.ClubOad;

/**
 *
 * @author jaguilera
 */
@RestController
@RequestMapping("/clubs")
public class ClubController {
    
    private static final Logger logger = LoggerFactory.getLogger(ClubController.class);
    @Autowired
    ClubOad clubOad;
    
    @RequestMapping("")
    public List<Club> todos(){
    return clubOad.findAll(new Sort("nombre"));
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Club agregar(@RequestBody Club club){
        logger.debug("agregar()");
        return clubOad.save(club);
    }

    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Club actualizar(@RequestBody Club club){
        return clubOad.save(club);
    }
    
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void borrar(@RequestBody Club club){
        clubOad.delete(club);
    }
    
}
