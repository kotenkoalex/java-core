package com.kotenko;

import com.kotenko.oop.polymorphism.*;

public class Main {
    public static void main(String[] args) {
        Car car = new Car();
        Bicycle bicycle = new Bicycle();
        Scooter scooter = new Scooter();
        Vehicle[]vehicles = {car, bicycle, scooter};
        Person person = new Person("Alex", vehicles);
    }
}
