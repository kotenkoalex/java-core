package com.kotenko.oop.practice;

import com.kotenko.oop.practice.car.Car;
import com.kotenko.oop.practice.car.CarService;
import com.kotenko.oop.practice.car.Engine;

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
