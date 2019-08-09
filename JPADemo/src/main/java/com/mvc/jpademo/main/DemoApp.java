/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.jpademo.main;

import com.mvc.jpademo.model.Helloworld;
import static com.sun.xml.internal.ws.spi.db.BindingContextFactory.LOGGER;
import java.util.Scanner;

/**
 *
 * @author dhruvit
 */
public class DemoApp {
    public static void main(String[] args) {
        CRUDoperations crudOperations = new CRUDoperations();

        Scanner sc = new Scanner(System.in);

        LOGGER.info("Enter message:");
        String msg = sc.next();
        
        crudOperations.insertEntity(msg);
    }
}
