/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatecompositekey.dao;

import com.mvc.hibernatecompositekey.config.HibernateConfig;
import com.mvc.hibernatecompositekey.model.UserDetails;
import java.util.ArrayList;
import java.util.List;
import javax.persistence.EntityManager;

/**
 *
 * @author dhruvit
 */
public class UserDetailsDaoImpl implements UserDetailsDao {

    private EntityManager entityManager = HibernateConfig.getEntityManager();

    @Override
    public void addUser(UserDetails user) {

        entityManager.getTransaction().begin();
        entityManager.persist(user);
        
        entityManager.getTransaction().commit();

    }

    @Override
    public List<UserDetails> getUsers() {
        List<UserDetails> list = new ArrayList<>();

        list = entityManager.createQuery("from UserDetails ", UserDetails.class).getResultList();

        return list;

    }

}
