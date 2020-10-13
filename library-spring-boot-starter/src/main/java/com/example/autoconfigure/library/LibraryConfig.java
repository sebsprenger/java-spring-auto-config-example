package com.example.autoconfigure.library;

import com.example.handlers.MailHandler;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan
@ConditionalOnClass(MailHandler.class)
public class LibraryConfig {

    @Bean
    @ConditionalOnMissingBean
    MailHandler mailHandler(@Value("${example.server:example.com}") String server,
                            @Value("${example.port:8080}") String port) {
        return new MailHandler(server, port);
    }

}
