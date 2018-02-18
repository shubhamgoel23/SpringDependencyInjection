package com.spring.didemo.controller;

import com.spring.didemo.services.GreetingServiceImpl;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class SetterInjectedControllerTest {
    private SetterInjectedController setterInjectedController;

    @BeforeMethod
    public void setUp(){
        this.setterInjectedController = new SetterInjectedController();
        this.setterInjectedController.setGreetingService(new GreetingServiceImpl());
    }

    @Test
    public void testSayHello(){
        assertEquals(GreetingServiceImpl.HELLO_GURUS,setterInjectedController.sayHello());
    }
}