package com.kotenko.exercises.email;

public class EmailValidator {
    public static boolean validate(String email) {
        return email != null && email.contains("@");
    }
}
