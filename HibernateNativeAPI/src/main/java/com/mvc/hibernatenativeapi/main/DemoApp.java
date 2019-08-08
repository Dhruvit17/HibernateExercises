/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mvc.hibernatenativeapi.main;

import com.mvc.hibernatenativeapi.dao.HelloworldDao;
import com.mvc.hibernatenativeapi.model.Helloworld;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author dhruvit
 */
public class DemoApp {

    public static void main(String[] args) {
        
        HelloworldDao helloWorldDao = new HelloworldDao();

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter message:");
        String msg = sc.next();

        Helloworld helloWorld = new Helloworld(msg);
        helloWorldDao.saveMessage(helloWorld);
        System.out.println("Message added..");

        List<Helloworld> messages = helloWorldDao.getMessage();
        messages.forEach(s -> System.out.println(s.getMessage()));

    }
}
