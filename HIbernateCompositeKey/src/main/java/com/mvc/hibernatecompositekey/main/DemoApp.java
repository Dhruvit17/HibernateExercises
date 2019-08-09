/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatecompositekey.main;

import com.mvc.hibernatecompositekey.dao.UserDetailsDao;
import com.mvc.hibernatecompositekey.dao.UserDetailsDaoImpl;
import com.mvc.hibernatecompositekey.model.UserDetails;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author dhruvit
 */
public class DemoApp {
    public static void main(String[] args) {
        UserDetailsDao repository = new UserDetailsDaoImpl();
        
        
        
        UserDetails user = new UserDetails("Janam", "janam@gmail.com", "1234567890");
        repository.addUser(user);
        
        List<UserDetails> getUsers = new ArrayList<UserDetails>();
        getUsers=repository.getUsers();
    }
}
