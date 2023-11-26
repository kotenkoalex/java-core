package com.kotenko.exercises.ex12classes.second.ex3;

import com.kotenko.exercises.ex12classes.second.ex3.car.Car;
import com.kotenko.exercises.ex12classes.second.ex3.garage.Garage;
import com.kotenko.exercises.ex12classes.second.ex3.garage.GarageDao;
import com.kotenko.exercises.ex12classes.second.ex3.garage.GarageService;
import com.kotenko.exercises.ex12classes.second.ex3.garage.IGarageDao;

public class Main {
    public static void main(String[] args) {
        Car[] cars = new Car[1];
        Garage garage = new Garage(1L, cars);
        IGarageDao garageDao = new GarageDao(garage);
        GarageService garageService = new GarageService(garageDao);
        garageService.putCarToGarage(1L, new Car(1L, "Ferrari"));
    }
}
