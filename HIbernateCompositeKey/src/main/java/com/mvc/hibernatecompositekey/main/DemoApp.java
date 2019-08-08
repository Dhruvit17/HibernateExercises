/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatecompositekey.main;

import com.mvc.hibernatecompositekey.dao.UserDetailsDao;
import com.mvc.hibernatecompositekey.dao.UserDetailsDaoImpl;
import com.mvc.hibernatecompositekey.model.UserDetails;

/**
 *
 * @author dhruvit
 */
public class DemoApp {
    public static void main(String[] args) {
        UserDetailsDao repository = new UserDetailsDaoImpl();
        
        
        
        UserDetails user = new UserDetails("Dhruvit", "dhruvit@gmail.com", "1234567890");
        repository.addUser(user);
        
        System.out.println("\n\n"+repository.getUsers()+"\n\n");
    }
}
