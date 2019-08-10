/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetoone.dao;

import com.mvc.demoonetoone.config.HibernateConfig;
import com.mvc.demoonetoone.model.Student;
import javax.persistence.EntityManager;

/**
 *
 * @author dhruvit
 */
public class StudentDao {

    private EntityManager entityManager = HibernateConfig.getEntityManager();

    public void addStudent(Student student) {

        entityManager.getTransaction().begin();
        entityManager.persist(student);
        entityManager.getTransaction().commit();
        entityManager.close();

    }
}
