package com.spring.didemo.controller;

import com.spring.didemo.services.GreetingServiceImpl;

import static org.testng.Assert.*;

public class PropertyInjectedControllerTest {

    private PropertyInjectedController propertyInjectedController;

    @org.testng.annotations.BeforeMethod
    public void setUp(){
        this.propertyInjectedController = new PropertyInjectedController();
        this.propertyInjectedController.greetingService = new GreetingServiceImpl();
    }

    @org.testng.annotations.Test
    public void testSayHello(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,propertyInjectedController.sayHello());
    }
}