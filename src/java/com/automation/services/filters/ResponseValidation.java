package com.automation.services.filters;

import java.io.IOException;
import javax.ws.rs.container.ContainerRequestContext;
import javax.ws.rs.container.ContainerResponseContext;
import javax.ws.rs.container.ContainerResponseFilter;
import javax.ws.rs.ext.Provider;

@Provider
public class ResponseValidation implements ContainerResponseFilter {
    @Override
    public void filter(ContainerRequestContext crc, ContainerResponseContext crc1) throws IOException {
        System.out.println("ResponseValidation --- --- --- --- --- --- --- --- --- ---");
    }
}