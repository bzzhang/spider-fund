package com.springboot.config;

import com.springboot.filter.CORSInteceptor;
import com.springboot.filter.CsrfFilter;
import com.springboot.listener.BootApplicationEventListener;
import org.glassfish.jersey.media.multipart.MultiPartFeature;
import org.glassfish.jersey.server.ResourceConfig;
import org.glassfish.jersey.server.internal.process.Endpoint;
import org.springframework.stereotype.Component;

/**
 * Created by zbz on 2017/2/28.
 */
@Component
public class JerseyConfig extends ResourceConfig {

    public JerseyConfig() {
        register(Endpoint.class);
        register(MultiPartFeature.class);
        packages(true, "com.springboot");
        register(CsrfFilter.class);
        register(CORSInteceptor.class);
        register(BootApplicationEventListener.class);
    }

}
