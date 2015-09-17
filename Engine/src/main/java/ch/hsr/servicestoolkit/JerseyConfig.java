package ch.hsr.servicestoolkit;

import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.stereotype.Component;

@Component
public class JerseyConfig extends ResourceConfig {

	public JerseyConfig() {
		register(Endpoint.class);
		register(new ObjectMapperContextResolver());
	}

}
