package com.example.autoconfigure.library.springwrapper;

import com.example.handlers.MailHandler;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
public class SpringEventListenerMail implements ApplicationListener<SpringEvent> {

    private final MailHandler mailHandler;

    public SpringEventListenerMail(MailHandler mailHandler) {
        this.mailHandler = mailHandler;
    }

    @Override
    public void onApplicationEvent(SpringEvent event) {
        mailHandler.handle(event.getEvent());
    }
}
