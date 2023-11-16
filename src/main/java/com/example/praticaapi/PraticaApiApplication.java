package com.example.praticaapi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class PraticaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(PraticaApiApplication.class, args);
    }
}
