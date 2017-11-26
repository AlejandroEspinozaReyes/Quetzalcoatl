package com.automation.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;
 
public class SessionManager {
    
    private static SessionManager instance = new SessionManager();
    private SessionFactory sessionFactory;
    
    public static SessionManager getInstance(){
            return instance;
    }
    
    private SessionManager(){
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder()
                .applySettings(configuration.getProperties()).build();
        sessionFactory = configuration.buildSessionFactory(serviceRegistry);
    }

    public static Session getSession(){
        Session session =  getInstance().sessionFactory.openSession();
        return session;
    }
}