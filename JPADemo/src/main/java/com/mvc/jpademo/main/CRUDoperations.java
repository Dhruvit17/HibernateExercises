/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.jpademo.main;

import com.mvc.jpademo.model.Helloworld;
import com.sun.jndi.toolkit.ctx.HeadTail;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

/**
 *
 * @author dhruvit
 */
public class CRUDoperations {

    public void insertEntity(String msg) {
        EntityManager entityManager = JPAUtil.getEntityManagerFactory().createEntityManager();
        EntityTransaction entityTransaction = entityManager.getTransaction();
        entityTransaction.begin();
        Helloworld helloworld = new Helloworld(msg);

        entityManager.persist(helloworld);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
