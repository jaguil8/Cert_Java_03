package rysi.web.holaweb;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;

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
    
//    @Bean(name ="entityManagerFactory")
//    public EntityManagerFactory construirEMF(){
//        return Persistence.createEntityManagerFactory("HolaWebPU");
//    }
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }
    
}
