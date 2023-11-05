package com.kotenko.exercises;

import com.kotenko.exercises.email.EmailValidator;

public class Ex9Packages {
    public static void main(String[] args) {
        System.out.println(EmailValidator.validate("alex@gmail.com"));
        System.out.println(EmailValidator.validate("alexgmail.com"));
        System.out.println(EmailValidator.validate(null));
        System.out.println(EmailValidator.validate(""));
    }
}
