package com.kotenko.exercises.ex12classes.first;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Dealership dealership = new Dealership("MuAuto", 2);

        dealership.addCarToStock(new Car("Mazda", 10000, Engine.PETROL));
        dealership.addCarToStock(new Car("BMW", 12000, Engine.PETROL));

        Arrays.stream(dealership.getCarsInStock()).forEach(System.out::println);
    }
}
