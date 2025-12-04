package ma.ws.jaxrs.config;

import org.glassfish.jersey.jackson.JacksonFeature;
import org.glassfish.jersey.moxy.xml.MoxyXmlFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MyConfig {

    @Bean
    public ResourceConfig resourceConfig() {
        ResourceConfig cfg = new ResourceConfig();

        cfg.packages("ma.ws.jaxrs.controllers");

        cfg.register(JacksonFeature.class);
        cfg.register(MoxyXmlFeature.class);

        return cfg;
    }
}

