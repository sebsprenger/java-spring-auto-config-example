package com.example.autoconfigure.springwrapper;

import com.example.events.Event;
import com.example.events.EventPublisher;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Component;

@Component
public class SpringEventPublisher implements EventPublisher {

    private ApplicationEventPublisher applicationEventPublisher;

    public SpringEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    @Override
    public void publish(Event e) {
        SpringEvent springEvent = new SpringEvent(e);
        applicationEventPublisher.publishEvent(springEvent);
    }
}
