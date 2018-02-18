package com.spring.didemo.controller;

import com.spring.didemo.services.GreetingServiceImpl;

import static org.junit.jupiter.api.Assertions.*;


class ConstructorInjectedControllerTest {
    private ConstructorInjectedController constructorInjectedController;

    @org.junit.jupiter.api.BeforeEach
    void setUp() {
        this.constructorInjectedController = new ConstructorInjectedController(new GreetingServiceImpl());
    }

    @org.junit.jupiter.api.Test
    void sayHello() {
        assertEquals(GreetingServiceImpl.HELLO_GURUS,constructorInjectedController.sayHello());
    }
}