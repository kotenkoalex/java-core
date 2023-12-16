package com.kotenko.spring;

import com.kotenko.spring.customer.Customer;
import com.kotenko.spring.customer.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class Main {
    public static void main(String[] args) {
        SpringApplication.run(Main.class, args);
    }

    @Bean
    CommandLineRunner runner(CustomerRepository customerRepository) {
        return args -> {
            Customer alex = new Customer("Alex", "alex@gmail.com", 22);
            Customer max = new Customer("Max", "max@gmail.com", 22);
            List<Customer> customers = List.of(alex, max);
            customerRepository.saveAll(customers);
        };
    }

    @Bean
    public Foo getFoo() {
        return new Foo("foo");
    }

    record Foo(String name) {
    }
}
