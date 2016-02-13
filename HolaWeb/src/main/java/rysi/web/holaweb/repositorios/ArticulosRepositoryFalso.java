package rysi.web.holaweb.repositorios;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import org.springframework.stereotype.Repository;
import rysi.web.holaweb.entidades.Articulo;

/**
 *
 * @author jaguilera
 */
@Repository
public class ArticulosRepositoryFalso implements ArticulosRepository {

    List<Articulo> catalogoArticulos;
    
    public ArticulosRepositoryFalso(){
        catalogoArticulos = new ArrayList<Articulo>();
        
        Articulo art = new Articulo();
        art.setClave("001");
        art.setNombre("Articulo de prueba");
        art.setPrecioUnitario(new BigDecimal("123.99"));
        art.setFechaIntroduccion(new Date(115, 9, 12));
        catalogoArticulos.add(art);
        
        art = new Articulo();
        art.setClave("002");
        art.setNombre("Otro");
        art.setPrecioUnitario(new BigDecimal("234.99"));
        art.setFechaIntroduccion(new Date(114, 3, 10));
        catalogoArticulos.add(art);
        
        art = new Articulo();
        art.setClave("003");
        art.setNombre("Otro mas");
        art.setPrecioUnitario(new BigDecimal("342.99"));
        art.setFechaIntroduccion(new Date(114, 10, 7));
        catalogoArticulos.add(art);
        
        
        
    }
    
    @Override
    public Articulo getArticulo(String clave){
        for (Articulo art : catalogoArticulos) {
            if(art.getClave().equals(clave)) return art;
        }
        return null;
    }
    
//    @Override
//    public Articulo getArticulo(String clave){
//        Articulo art = new Articulo();
//        art.setClave(clave);
//        art.setNombre("Articulo de prueba");
//        art.setPrecioUnitario(new BigDecimal("123.99"));
//        art.setFechaIntroduccion(new Date(115, 9, 12));
//        return art;
//    }
    
    @Override
    public List<Articulo> getTodos() {
        return catalogoArticulos;
    }
}
