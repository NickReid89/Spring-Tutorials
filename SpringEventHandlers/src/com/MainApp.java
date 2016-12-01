/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 *
 * @author Nickolas
 */
public class MainApp {

    public static void main(String[] args) {
        ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("Beans.xml");

        // Let us raise a start event.
        context.start();
        // Let us raise a stop event.
        context.stop();
        HelloWorld obj = (HelloWorld) context.getBean("helloWorld");

        obj.getMessage();

    }

}
