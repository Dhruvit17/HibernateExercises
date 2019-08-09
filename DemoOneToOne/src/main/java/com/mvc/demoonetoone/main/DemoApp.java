/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.demoonetoone.main;

import com.mvc.demoonetoone.dao.StudentDao;
import com.mvc.demoonetoone.model.Address;
import com.mvc.demoonetoone.model.Education;
import com.mvc.demoonetoone.model.Student;
import java.util.logging.Logger;

/**
 *
 * @author dhruvit
 */
public class DemoApp {

    public static Logger logger = Logger.getLogger(DemoApp.class.getName());

    public static void main(String[] args) {

        StudentDao studentDao = new StudentDao();

        Education education = new Education("B.Tech", "this is b.tech degree", 2019L, "DDU");
        Address address = new Address("street1", "street2", "city", "state", "country");
        Student student = new Student("Dhruvit", "R.", "Parekh", "Mr.", "B.Tech", "dhruvit@gmail.com", 1234567890L, address, education);

        studentDao.addStudent(student);

        logger.info("Student : "+student);
    }
}
