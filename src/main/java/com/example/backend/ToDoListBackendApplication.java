package com.example.backend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

@SpringBootApplication
@EnableAsync
public class ToDoListBackendApplication {

    public static void main(String[] args) {
        SpringApplication.run(ToDoListBackendApplication.class, args);
    }

}
