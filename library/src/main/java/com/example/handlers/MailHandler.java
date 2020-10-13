package com.example.handlers;

import com.example.events.Event;
import com.example.events.EventListener;

public class MailHandler implements EventListener {

    private String server;
    private String port;

    public MailHandler(String server, String port) {
        this.server = server;
        this.port = port;
    }

    @Override
    public void handle(Event event) {
        System.out.println("    >> Sending E-Mail with text '" + event.getMessage() + "' to server '" + server + ":" + port + "'");
    }
}
