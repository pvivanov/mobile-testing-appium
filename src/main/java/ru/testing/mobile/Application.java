package ru.testing.mobile;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        new SpringApplication(ru.testing.mobile.Application.class).run(args);
    }
}