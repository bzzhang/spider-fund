package com.springboot.listener;

import org.glassfish.jersey.server.monitoring.ApplicationEvent;
import org.glassfish.jersey.server.monitoring.ApplicationEventListener;
import org.glassfish.jersey.server.monitoring.RequestEvent;
import org.glassfish.jersey.server.monitoring.RequestEventListener;

/**
 * Created by zbz on 2017/2/28.
 * 监听上下文的变动
 */
public class BootApplicationEventListener implements ApplicationEventListener {
    @Override
    public void onEvent(ApplicationEvent applicationEvent) {

    }

    @Override
    public RequestEventListener onRequest(RequestEvent requestEvent) {
        return null;
    }
}
