package com.automation.services.marshall;

import com.automation.beans.User;
import java.io.IOException;
import java.io.OutputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyWriter;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class MarshallJsonWritter implements MessageBodyWriter<String> {

    public boolean isWriteable(Class<?> type, Type type1, Annotation[] antns, MediaType mt) {
        System.out.println("MarshallJsonWritter -> isWriteable");
        if(type.equals(User.class)){
            return true;
        } else {
            return false;
        }
    }

    public long getSize(String t, Class<?> type, Type type1, Annotation[] antns, MediaType mt) {
        System.out.println("MarshallJsonWritter -> getSize");
        return 1;
    }

    public void writeTo(String t, Class<?> type, Type type1, Annotation[] antns, MediaType mt, MultivaluedMap<String, Object> mm, OutputStream out) throws IOException, WebApplicationException {
        System.out.println("MarshallJsonWritter -> writeTo");
        if(type.equals(User.class) && t != null){
            out.write(t.getBytes());
        }
    }
}
