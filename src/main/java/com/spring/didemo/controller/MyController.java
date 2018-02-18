package com.spring.didemo.controller;

import com.spring.didemo.services.GreetingService;
import org.springframework.stereotype.Controller;

@Controller
public class MyController {

    private GreetingService greetingService;

    public MyController(GreetingService greetingService) {
        this.greetingService = greetingService;
    }

    public void hello(){
        System.out.println(greetingService.sayGreeting());
    }

}
