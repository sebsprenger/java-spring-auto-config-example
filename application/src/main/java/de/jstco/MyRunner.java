package de.jstco;

import com.example.events.Event;
import com.example.events.EventPublisher;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class MyRunner implements CommandLineRunner {

    private EventPublisher pub;

    public MyRunner(EventPublisher pub) {
        this.pub = pub;
    }

    @Override
    public void run(String... args) throws Exception {
        System.out.println("doing really important business stuff over here");

        pub.publish(new Event("HelloWorld!"));

        System.out.println("more business logic");
    }

}
