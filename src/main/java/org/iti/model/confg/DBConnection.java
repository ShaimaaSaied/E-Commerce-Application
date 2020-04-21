package org.iti.model.confg;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DBConnection {


    private static Session session = null;

    private DBConnection() {
    }

    public static synchronized Session getInstance() {
        if (session == null) {
            session = new Configuration().configure("hibernate.cfg.xml").buildSessionFactory().openSession();
        }
        return session;
    }

}