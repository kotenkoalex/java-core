package com.kotenko.oop.practice.garage;

import com.kotenko.oop.practice.car.Car;

public class GarageService {
    public boolean addCarToGarage(Car car, Garage garage) {
        if (car == null) {
            throw new IllegalArgumentException("Car cannot be null");
        }
        int count = 0;
        for (com.kotenko.exercises.ex12classes.first.Car c : garage.getCars()) {
            if (c != null) {
                count++;
            }
        }
        return garage.getCapacity() > count;
    }
}
