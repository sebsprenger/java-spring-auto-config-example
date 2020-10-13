package com.example.autoconfigure.springwrapper;

import com.example.handlers.SmsHandler;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.ApplicationListener;
import org.springframework.stereotype.Component;

@Component
@ConditionalOnClass(SmsHandler.class)
public class SpringEventListenerSms implements ApplicationListener<SpringEvent> {

    private SmsHandler handler;

    public SpringEventListenerSms(SmsHandler handler) {
        this.handler = handler;
    }

    @Override
    public void onApplicationEvent(SpringEvent event) {
        handler.handle(event.getEvent());
    }
}
