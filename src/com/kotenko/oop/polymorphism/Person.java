package com.kotenko.oop.polymorphism;

public class Person {
    private String name;
    private Vehicle[] vehicle;

    public Person() {
    }

    public Person(String name, Vehicle[] vehicle) {
        this.name = name;
        this.vehicle = vehicle;
    }
}
