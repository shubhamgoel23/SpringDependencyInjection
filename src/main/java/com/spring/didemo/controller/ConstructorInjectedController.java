package com.spring.didemo.controller;

import com.spring.didemo.services.GreetingService;

public class ConstructorInjectedController {

    private GreetingService greetingService;

    private ConstructorInjectedController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public String sayHello(){
        return greetingService.sayGreeting();
    }
}
