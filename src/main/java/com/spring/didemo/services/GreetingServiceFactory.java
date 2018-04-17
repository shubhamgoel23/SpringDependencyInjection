package com.spring.didemo.services;

import org.springframework.beans.factory.annotation.Autowired;

public class GreetingServiceFactory {

    private GreetingRepository greetingRepository;

    @Autowired
    public GreetingServiceFactory(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    public GreetingService createGreetingService(String lang) {

        switch (lang) {
            case "en":
                return new PrimaryGreetingService(greetingRepository);
            case "de":
                return new PrimaryGermanGreetingservice(greetingRepository);
            case "es":
                return new PrimarySpanishGreetingService(greetingRepository);

            default:
                return new PrimaryGreetingService(greetingRepository);

        }
    }
}
