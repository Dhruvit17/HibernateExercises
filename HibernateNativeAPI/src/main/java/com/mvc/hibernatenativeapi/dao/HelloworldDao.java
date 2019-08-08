/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatenativeapi.dao;

import com.mvc.hibernatenativeapi.config.HibernateConfig;
import com.mvc.hibernatenativeapi.model.Helloworld;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author dhruvit
 */
public class HelloworldDao {

    public void saveMessage(Helloworld helloWorld) {
        Transaction transaction = null;
        Session session = HibernateConfig.getSessionFactory().openSession();
        transaction = session.beginTransaction();
        session.save(helloWorld);
        transaction.commit();

    }

    public List<Helloworld> getMessage() {
        Session session = HibernateConfig.getSessionFactory().openSession();
        return session.createQuery("from Helloworld", Helloworld.class).list();
    }
}
