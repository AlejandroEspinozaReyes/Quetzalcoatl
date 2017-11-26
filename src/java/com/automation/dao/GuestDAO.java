package com.automation.dao;

import com.automation.beans.Guest;
import java.sql.Connection;
import java.util.List;
import org.hibernate.Query;
import org.hibernate.Session;

public class GuestDAO {

    public List<Guest> getGuests(){
        Session session = SessionManager.getSession();    
        Query query = session.createQuery("from " + Guest.class.getSimpleName());
        List<Guest> employees =  query.list();
        session.close();

        return employees;
    }    
}
