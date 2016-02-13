package rysi.web.cert03_tarea02;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 *
 * @author jaguilera
 */
@SpringBootApplication
public class Aplicacion extends SpringBootServletInitializer{

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Aplicacion.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
    
}
