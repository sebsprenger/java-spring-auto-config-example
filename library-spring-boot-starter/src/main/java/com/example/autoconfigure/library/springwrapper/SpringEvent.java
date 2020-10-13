package com.example.autoconfigure.library.springwrapper;

import com.example.events.Event;
import org.springframework.context.ApplicationEvent;

public class SpringEvent extends ApplicationEvent {

    public SpringEvent(Event source) {
        super(source);
    }

    public Event getEvent() {
        return (Event) getSource();
    }
}