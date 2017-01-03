package com.dwk.sample.user.ws.service;

import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.dwk.sample.user.ws.AppUserWS;

@ApplicationPath("webresources")
public class RestAppConfig extends Application {

    @Override
    public Set<Class<?>> getClasses() {
        final Set<Class<?>> resources = new java.util.HashSet<>();
        resources.add(AppUserWS.class);
        return resources;
    }

}
