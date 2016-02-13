package rysi.web.holaweb.control;

import java.math.BigDecimal;
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
import rysi.web.holaweb.repositorios.ArticulosRepository;
import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilera
 */
@Controller
public class HolaController {
    
    @Autowired
    ArticulosRepository repArticulos;
    
    @RequestMapping("/hola")
    public ModelAndView decirHola(){
        ModelAndView mav = new ModelAndView("saludo.jsp");
        mav.addObject("mensaje", "Hola mundo en Spring MVC");
        mav.addObject("articulo", repArticulos.getArticulo("001"));
        return mav;
    }
//    @RequestMapping("/hola")
//    public ModelAndView decirHola(){
//        ModelAndView mav = new ModelAndView("saludo.jsp");
//        mav.addObject("mensaje", "Hola mundo en Spring MVC");
//        Articulo art = new Articulo();
//        art.setClave("ABCD0001");
//        art.setNombre("Articulo de prueba");
//        art.setPrecioUnitario(new BigDecimal("123.99"));
//        art.setFechaIntroduccion(new Date(115, 9, 12));
//        mav.addObject("articulo", art);
//        return mav;
//    }
    
    @RequestMapping(value = "/agregarArticulo",
            method = RequestMethod.POST)
    public ModelAndView agregarArticulo(
            @RequestParam("clave") String clave,
            @RequestParam("nombre") String nombre,
            @RequestParam("precio") BigDecimal precioUnitario,
            @DateTimeFormat(pattern = "dd/MM/yyyy")
            @RequestParam("fechaIntroduccion") Date fechaIntroduccion){
        ModelAndView mav = new ModelAndView("resultado.jsp");
        Articulo art = new Articulo();
        art.setClave(clave);
        art.setNombre(nombre);
        art.setPrecioUnitario(precioUnitario);
        art.setFechaIntroduccion(fechaIntroduccion);
        art.setExistencia(0);
        mav.addObject("articulo", art);
        return mav;
    }
    
    
    //Metodos usando etiquetas sf
    @RequestMapping("/formaArticuloObj")
    public ModelAndView mostrarFormaArticulo(){
        ModelAndView mav = new ModelAndView("formaArticuloSpring.jsp");
        mav.addObject("articulo", new Articulo());
        return mav;
    }
    
    @RequestMapping(value = "/agregarArticuloObj",
            method = RequestMethod.POST)
    public ModelAndView agregarObjetoArticulo(
            @Valid
            @ModelAttribute("articulo") Articulo articulo,
            BindingResult resultado){
        if(resultado.hasErrors()){
            ModelAndView mav = new ModelAndView("formaArticuloSpring.jsp");
            return mav;
        }
        
        ModelAndView mav = new ModelAndView("resultado.jsp");
        mav.addObject("articulo", articulo);
        return mav;
    }
    
    @RequestMapping("/articulos/{clave}")
    public ModelAndView consultarArticulo(@PathVariable String clave){
        ModelAndView mav = new ModelAndView("/resultado.jsp");
        mav.addObject("articulo", repArticulos.getArticulo(clave));
        return mav;
    }
}
