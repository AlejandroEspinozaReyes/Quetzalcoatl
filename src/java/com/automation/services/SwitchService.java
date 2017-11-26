package com.automation.services;

import com.automation.dao.SwitchDAO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/SwitchService")
public class SwitchService {
    
    SwitchDAO dao = new SwitchDAO();
    
    @GET
    @Path("/state")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean getState(){
        System.out.println("Getting switch state");
        return dao.getSwitchState(); 
    }

    @GET
    @Path("/state/{state}")
    @Produces(MediaType.APPLICATION_JSON)
    public Boolean setState(@PathParam("state") Boolean state){
        dao.setSwitchState(state); 
        return state;
    }
}