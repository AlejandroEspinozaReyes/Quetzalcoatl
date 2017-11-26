package com.automation.services.filters;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerRequestFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class RequestValidation implements ContainerRequestFilter {
    @Override
    public void filter(ContainerRequestContext crc) throws IOException {
        System.out.println("RequestValidation --- --- --- --- --- --- --- --- --- ---");
    }
}