package mrysi.web.springconbd.control;

import java.util.List;
import mrysi.web.springconbd.entidades.Club;
import mrysi.web.springconbd.oad.ClubOad;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author jaguilar
 */
@RestController
@RequestMapping("/clubs")
public class ClubController {
    
    @Autowired
    private ClubOad clubOad;
    
    @RequestMapping("")
    public List<Club> todos() {
        return clubOad.findAll();
    }
    
    @RequestMapping(value="", method=RequestMethod.POST)
    public Club agregar(@RequestBody Club club) {
        return clubOad.save(club);
    }
    
    @RequestMapping(value="/{id}", method=RequestMethod.DELETE)
    public void borrar(@PathVariable Integer id) {
        clubOad.delete(id);
    }
    
}
