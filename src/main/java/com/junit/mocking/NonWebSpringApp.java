package com.junit.mocking;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;


//https://www.amitph.com/non-web-application-spring-boot/

@SpringBootApplication
public class NonWebSpringApp implements CommandLineRunner {

    @Autowired NonWebService service;

    public static void main(String[] args) {
        SpringApplication.run(NonWebSpringApp.class, args);
    }


    @Override
    public void run(String... args) throws Exception {
        service.printMessage(args);
    }
}
