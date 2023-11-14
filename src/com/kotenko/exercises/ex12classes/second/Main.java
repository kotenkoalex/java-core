package com.kotenko.exercises.ex12classes.second;

import com.kotenko.exercises.ex12classes.second.car.Car;
import com.kotenko.exercises.ex12classes.second.car.CarService;
import com.kotenko.exercises.ex12classes.second.car.Engine;
import com.kotenko.exercises.ex12classes.second.person.Person;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        carsExample();
    }

    private static void carsExample() {
        Car car = new Car("1234", 100000.0, Engine.GASOLINE);

        CarService carService = new CarService();
        carService.registerNewCar(car);

        System.out.println(Arrays.toString(carService.getCars()));
    }
}
