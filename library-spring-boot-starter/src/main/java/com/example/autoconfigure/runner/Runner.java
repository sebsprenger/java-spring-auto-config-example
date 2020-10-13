package com.example.autoconfigure.runner;

import org.springframework.boot.CommandLineRunner;

public class Runner implements CommandLineRunner {
    @Override
    public void run(String... args) throws Exception {
        System.out.println("doing awesome stuff under the hood");
    }
}
