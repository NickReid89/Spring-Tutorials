package com.hellospring;

import org.springframework.beans.factory.DisposableBean;

public class HelloWorld implements DisposableBean {

    private String message;
    private int number;

    public void setMessage(String message) {
        this.message = message;
    }

    public void getMessage() {
        System.out.println("Your Message : " + message);
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public void getNumber() {
        System.out.println("Your Number : " + number);
    }

    public void init() {
        System.out.println("Initialized");
    }

    @Override
    public void destroy() {
        System.out.println("Destroyed");
    }

}
