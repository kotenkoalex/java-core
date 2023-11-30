package com.kotenko.exercises.ex14streams;

public record Person(
        Integer age,
        String firstName,
                     String lastName,
                     String email,
                     Gender gender) {
    public Person {
    }

    public Person(String firstName, Gender gender) {
        this(null, firstName, null, null, gender);
    }
}
