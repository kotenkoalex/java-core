package com.kotenko;

import java.util.Arrays;
import java.util.Objects;

//address, car, house
public class Person {
    private String firstName;
    private String lastName;
    private Gender gender;
    private Cat[] cats;

    public Person(String firstName, String lastName, Gender gender, Cat[] cats) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
        this.cats = cats;
    }

    public Person(String firstName, String lastName, Gender gender) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", gender=" + gender +
                ", cats=" + Arrays.toString(cats) +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Person person = (Person) o;
        return Objects.equals(firstName, person.firstName) && Objects.equals(lastName, person.lastName) && gender == person.gender && Arrays.equals(cats, person.cats);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(firstName, lastName, gender);
        result = 31 * result + Arrays.hashCode(cats);
        return result;
    }
}
