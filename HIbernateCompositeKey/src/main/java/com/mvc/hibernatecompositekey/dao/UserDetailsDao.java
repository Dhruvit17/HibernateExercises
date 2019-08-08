/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatecompositekey.dao;

import com.mvc.hibernatecompositekey.model.UserDetails;
import java.util.List;

/**
 *
 * @author dhruvit
 */
public interface UserDetailsDao {
    
    public void addUser(UserDetails user);
    public List<UserDetails> getUsers();
    
    
}
