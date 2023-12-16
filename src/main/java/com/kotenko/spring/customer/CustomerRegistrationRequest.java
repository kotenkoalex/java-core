package com.kotenko.spring.customer;

public record CustomerRegistrationRequest(String name, String email, Integer age) {
}
