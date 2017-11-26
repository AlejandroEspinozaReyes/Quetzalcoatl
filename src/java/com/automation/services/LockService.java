package com.automation.services;

import com.automation.dao.LockDAO;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/LockService")
public class LockService {
    
    LockDAO dao = new LockDAO();

    @GET
    @Path("/state")
    @Produces(MediaType.APPLICATION_JSON)
    public Integer getState(){
        System.out.println("Getting lock state: " + dao.getLockState());
        return dao.getLockState(); 
    }

    @GET
    @Path("/state/{state}")
    @Produces(MediaType.APPLICATION_JSON)
    public Integer setState(@PathParam("state") Integer state){
        dao.setLockState(state); 
        System.out.println("Setting lock state: " + dao.getLockState());
        return dao.getLockState();
    }
}
