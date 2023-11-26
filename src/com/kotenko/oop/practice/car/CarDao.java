package com.kotenko.oop.practice.car;

public class CarDao {
    private static Car[] cars;
    private static int nextAvailableSlot = 0;

    public static final int CAPACITY = 5;

    static {
        cars = new Car[CAPACITY];
    }

    public void saveCar(Car car) {
        if (nextAvailableSlot + 1 >= 100) {
            //
        }
        cars[nextAvailableSlot] = car;
        ++nextAvailableSlot;
    }

    public Car[] selectAllCars() {
        return cars;
    }
}
