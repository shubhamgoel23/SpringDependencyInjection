package com.spring.didemo.services;

/**
 * Created by jt on 5/24/17.
 */
public class PrimaryGermanGreetingservice implements GreetingService {

    private GreetingRepository greetingRepository;

    public PrimaryGermanGreetingservice(GreetingRepository greetingRepository) {
        this.greetingRepository = greetingRepository;
    }

    @Override
    public String sayGreeting() {
        return greetingRepository.getGermanGreeting();
    }
}
