package com.automation.services;

import com.automation.beans.Guest;
import com.automation.beans.User;
import com.automation.dao.GuestDAO;
import com.automation.dao.UserDao;
import java.util.Arrays;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Path("/UserService")
public class UserService {

   UserDao userDao = new UserDao();

   @GET
   @Path("/users")
   @Produces(MediaType.APPLICATION_JSON)
   public List<User> getUsers(){
       System.out.println("Getting users");
       //User users[] = new User[]{new User(1, "Alez", "Developez")};
       return userDao.getAllUsers(); 
   }

   @GET
   @Path("/data")
   @Produces(MediaType.APPLICATION_JSON)
   public List<Guest> getData(){
       System.out.println("Getting data from user");

       List<Guest> guests = new GuestDAO().getGuests();

       System.out.println("Guests: " + ((guests == null)? null : guests.size()));

      return guests;
   }

   
}