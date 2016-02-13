package rysi.web.cert03_tarea02.control;

import java.util.List;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import rysi.web.cert03_tarea02.entidades.Equipored;
import rysi.web.cert03_tarea02.oad.EquiporedOad;

/**
 *
 * @author jaguilera
 */
@RestController
@RequestMapping("/equiposred")
public class EquiposredController {
    
    private static final Logger logger = LoggerFactory.getLogger(EquiposredController.class);
    @Autowired
    EquiporedOad equiporedOad;
    
    @RequestMapping("")
    public List<Equipored> todos(){
        return equiporedOad.findAll(new Sort("nombreequipo"));
    }
    
    @RequestMapping(value = "", method = RequestMethod.POST)
    public Equipored agregar(@RequestBody Equipored equipored){
        logger.debug("agregar()");
        return equiporedOad.save(equipored);
    }
    
    @RequestMapping(value = "", method = RequestMethod.PUT)
    public Equipored actualizar(@RequestBody Equipored equipored){
        return equiporedOad.save(equipored);
    }
    
    @RequestMapping(value = "", method = RequestMethod.DELETE)
    public void borrar(@RequestBody Equipored equipored){
        equiporedOad.delete(equipored);
    }
}
