package com.example.handlers;

import com.example.events.Event;
import com.example.events.EventListener;

public class SmsHandler implements EventListener {

    private String number;

    public SmsHandler(String number) {
        this.number = number;
    }

    @Override
    public void handle(Event event) {
        if (number.isBlank()) {
            System.out.println("    >> SMS handler disabled as is was not provided with a proper number");
            return;
        }
        System.out.println("    >> Sending SMS with text '" + event.getMessage() + "' to number '" + number + "'");
    }
}
