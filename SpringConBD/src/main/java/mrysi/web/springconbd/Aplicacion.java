package mrysi.web.springconbd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

/**
 *
 * @author jaguilar
 */
@SpringBootApplication
@EnableAutoConfiguration(exclude=DataSourceAutoConfiguration.class)
public class Aplicacion extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder
            configure(SpringApplicationBuilder builder) {
        return builder.sources(Aplicacion.class)
                .sources(ConfiguracionJpa.class);
    }
    
    public static void main(String[] args) {
        SpringApplication.run(Aplicacion.class, args);
    }

}
