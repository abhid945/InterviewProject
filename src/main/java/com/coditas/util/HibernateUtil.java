package com.coditas.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

     SessionFactory sessionFactory = (SessionFactory) new Configuration().configure("hibernate.cfg.xml");


   public Session getSession(){
        Session session = sessionFactory.openSession();
        return session;
    }

    public void closeSession(){
        sessionFactory.close();
    }

}
