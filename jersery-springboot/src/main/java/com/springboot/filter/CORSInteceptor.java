package com.springboot.filter;

import javax.annotation.Priority;
import javax.ws.rs.Priorities;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.ext.WriterInterceptor;
import javax.ws.rs.ext.WriterInterceptorContext;
import java.io.IOException;

/**
 * Created by zbz on 2017/2/28.
 */
@Priority(Priorities.ENTITY_CODER)
public class CORSInteceptor implements WriterInterceptor {

    @Override
    public void aroundWriteTo(WriterInterceptorContext context) throws IOException, WebApplicationException {
        // CORS的核心 --响应头里得有Access-Control-Allow-Origin
        context.getHeaders().add("Access-Control-Allow-Origin", "*");
        context.getHeaders().add("Access-Control-Allow-Headers", "Content-Type,X-Requested-By");
        context.getHeaders().add("Access-Control-Allow-Methods", "GET, POST, DELETE, PUT");
        context.proceed();
    }
}
