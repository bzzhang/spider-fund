package com.springboot.filter;

import javax.annotation.Priority;
import javax.ws.rs.BadRequestException;
import javax.ws.rs.Priorities;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import java.io.IOException;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/**
 * Created by zbz on 2017/2/28.
 */
@Priority(Priorities.AUTHENTICATION)
public class CsrfFilter implements ContainerRequestFilter {

    public static final String HEADER_NAME = "X-Requested-Boot";

    private static final Set<String> METHODS_TO_IGNORE;
    private static final Set<String> FUNCTION_TO_IGNORE;
    static {
        HashSet<String> mti = new HashSet<>();
        mti.add("GET");
        mti.add("OPTIONS");
        mti.add("HEAD");
        METHODS_TO_IGNORE = Collections.unmodifiableSet(mti);

        HashSet<String> fti = new HashSet<>();


        FUNCTION_TO_IGNORE = Collections.unmodifiableSet(fti);
    }

    @Override
    public void filter(ContainerRequestContext rc) throws IOException {
        if (!METHODS_TO_IGNORE.contains(rc.getMethod())
                && !rc.getHeaders().containsKey(HEADER_NAME)
                && !FUNCTION_TO_IGNORE.contains(rc.getUriInfo().getPath())) {
            throw new BadRequestException("CSRF Exception!");
        }
    }
}
