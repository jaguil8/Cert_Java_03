package rysi.web.cert3_tarea01.control;



import java.util.Date;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import rysi.web.cert3_tarea01.DAO.EquiposredDao;
import rysi.web.cert3_tarea01.entidades.Equiposred;
//import rysi.web.cert3_tarea01.DAO.EquiposRedDao;
//import rysi.web.holaweb.repositorios.ArticulosRepository;
//import rysi.web.cert3_tarea01.entidades.EquipoRed;
//import rysi.web.cert3_tarea01.entidades.EquiposRed;

/**
 *
 * @author jaguilera
 */
@Controller
public class TareaController {
    @Autowired
    private EquiposredDao equiposRedDao;
    String ConexionBD = "localhost;1527;Tarea01;root;lania";
    //@Autowired
    //ArticulosRepository repArticulos;
    
//    @RequestMapping("/hola")
//    public ModelAndView decirHola(){
//        ModelAndView mav = new ModelAndView("saludo.jsp");
//        mav.addObject("mensaje", "Hola mundo en Spring MVC");
//        mav.addObject("articulo", repArticulos.getArticulo("001"));
//        return mav;
//    }
//    @RequestMapping("/hola")
//    public ModelAndView decirHola(){
//        ModelAndView mav = new ModelAndView("saludo.jsp");
//        mav.addObject("mensaje", "Hola mundo en Spring MVC");
//        EquipoRed art = new EquipoRed();
//        art.setIdEquipo("ABCD0001");
//        art.setNombreEquipo("EquipoRed de prueba");
//        art.setIp(new BigDecimal("123.99"));
//        art.setFechaInstalacion(new Date(115, 9, 12));
//        mav.addObject("articulo", art);
//        return mav;
//    }
    
    @RequestMapping(value = "/agregarEquipo",
            method = RequestMethod.POST)
    public ModelAndView agregarEquipo(
            @RequestParam("idEquipo") Integer idEquipo,
            @RequestParam("nombreEquipo") String nombreEquipo,
            @RequestParam("ip") String ip,
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            @RequestParam("fechaInstalacion") Date fechaInstalacion,
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            @RequestParam("fechaUltimoCambio") Date fechaUltimoCambio){
        ModelAndView mav = new ModelAndView("resultado.jsp");
        Equiposred Eq = new Equiposred();
        Eq.setIdequipo(idEquipo);
        Eq.setNombreequipo(nombreEquipo);
        Eq.setIp(ip);
        Eq.setFechainstalacion(fechaInstalacion);
        Eq.setFechaultimocambio(fechaUltimoCambio);
        mav.addObject("equipoRed", Eq);
        //EquipoRed.guardarEquipoRed(ConexionBD, idEquipo, nombreEquipo, ip, fechaInstalacion, fechaUltimoCambio);
        equiposRedDao.persist(Eq);
        return mav;
    }
    
    
    //Metodos usando etiquetas sf
    @RequestMapping("/formaArticuloObj")
    public ModelAndView mostrarFormaArticulo(){
        ModelAndView mav = new ModelAndView("formaArticuloSpring.jsp");
        mav.addObject("articulo", new Equiposred());
        return mav;
    }
    
    @RequestMapping(value = "/agregarArticuloObj",
            method = RequestMethod.POST)
    public ModelAndView agregarObjetoArticulo(
            @Valid
            @ModelAttribute("articulo") Equiposred articulo,
            BindingResult resultado){
        if(resultado.hasErrors()){
            ModelAndView mav = new ModelAndView("formaArticuloSpring.jsp");
            return mav;
        }
        
        ModelAndView mav = new ModelAndView("resultado.jsp");
        mav.addObject("articulo", articulo);
        return mav;
    }
    
//    @RequestMapping("/articulos/{clave}")
//    public ModelAndView consultarArticulo(@PathVariable String clave){
//        ModelAndView mav = new ModelAndView("/resultado.jsp");
//        mav.addObject("articulo", repArticulos.getArticulo(clave));
//        return mav;
//    }
}
