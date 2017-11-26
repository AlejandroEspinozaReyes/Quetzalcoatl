package com.automation.services.marshall;

import com.automation.beans.User;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.annotation.Annotation;
import java.lang.reflect.Type;
import javax.ws.rs.Produces;
import javax.ws.rs.WebApplicationException;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.MultivaluedMap;
import javax.ws.rs.ext.MessageBodyReader;
import javax.ws.rs.ext.Provider;

@Provider
@Produces(MediaType.APPLICATION_JSON)
public class MarshallJsonReader implements MessageBodyReader<String> {

    public boolean isReadable(Class type, Type type1, Annotation[] antns, MediaType mt) {
        System.out.println("MarshallJsonWritter -> isReadable");
        if(type.equals(User.class) || type.equals(String.class)){
            return true;
        } else {
            return false;
        }
    }

    public String readFrom(Class type, Type type1, Annotation[] antns, MediaType mt, MultivaluedMap mm, InputStream in) throws IOException, WebApplicationException {
        System.out.println("MarshallJsonWritter -> readFrom");
        ByteArrayOutputStream result = new ByteArrayOutputStream();
        byte[] buffer = new byte[1024];
        int length;
        while ((length = in.read(buffer)) != -1) {
            result.write(buffer, 0, length);
        }
        return result.toString();
    }
    
}
