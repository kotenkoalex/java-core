package com.kotenko.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@SpringBootApplication
@RestController
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @GetMapping("/greet")
    public GreetResponse hello(@RequestParam(value = "name", required = false) String name) {
        String greetMessage = name == null || name.isBlank() ? "Hello" : "Hello " + name;
        return new GreetResponse(greetMessage, List.of("list"), new Person("name"));
    }

    record GreetResponse(String greet, List<String> lang, Person person) {
    }

    record Person(String name) {
    }
}
