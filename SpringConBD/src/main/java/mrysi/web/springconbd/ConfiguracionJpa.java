package mrysi.web.springconbd;

import java.util.HashMap;
import java.util.Map;
import org.springframework.boot.autoconfigure.orm.jpa.JpaBaseConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.orm.jpa.vendor.AbstractJpaVendorAdapter;
import org.springframework.orm.jpa.vendor.EclipseLinkJpaVendorAdapter;

/**
 *
 * @author jaguilar
 */
@Configuration
@EnableJpaRepositories
public class ConfiguracionJpa  extends JpaBaseConfiguration {

	@Override
	protected AbstractJpaVendorAdapter createJpaVendorAdapter() {
		EclipseLinkJpaVendorAdapter adapter = new EclipseLinkJpaVendorAdapter();
		return adapter;
	}

	@Override
	protected Map<String, Object> getVendorProperties() {
		HashMap<String, Object> map = new HashMap<String, Object>();
		return map;
	}
    
}
