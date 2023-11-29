package com.kotenko.exercises.ex12classes.second.ex3.garage;

import com.kotenko.exercises.ex12classes.second.ex3.car.Car;

import java.util.Arrays;
import java.util.Objects;

public class GarageDao implements IGarageDao {
    private final Garage garage;

    public GarageDao(Garage garage) {
        this.garage = garage;
    }

    @Override
    public void putCarToGarage(Long garageId, Car car) {
        if (Objects.equals(garage.id(), garageId)) {
            Car[] cars = garage.cars();
            cars[0] = car;
            System.out.println("Added");
            System.out.println(Arrays.toString(cars));
        } else {
            throw new IllegalArgumentException("Wrong garage id");
        }
    }
}
