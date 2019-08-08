/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatecompositekey.config;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

/**
 *
 * @author dhruvit
 */
public class HibernateConfig {
    
    private static EntityManagerFactory entityManagerFactory;
  
            
       
     public static EntityManager getEntityManager() {
        entityManagerFactory = Persistence.createEntityManagerFactory("PERSISTENCE");
        return entityManagerFactory.createEntityManager();
    }
    
}
