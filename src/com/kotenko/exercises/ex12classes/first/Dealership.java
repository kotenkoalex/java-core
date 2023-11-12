package com.kotenko.exercises.ex12classes.first;

public class Dealership {
    private String name;

    private int maxCarsOnDisplay;

    private Car[] carsInStock;

    public Dealership(String name, int maxCarsOnDisplay) {
        this.name = name;
        this.maxCarsOnDisplay = maxCarsOnDisplay;
        this.carsInStock = new Car[maxCarsOnDisplay];
    }

    public String getName() {
        return name;
    }

    public int getMaxCarsOnDisplay() {
        return maxCarsOnDisplay;
    }

    public Car[] getCarsInStock() {
        return carsInStock;
    }

    public void addCarToStock(Car car) {
        int currentStockSize = getCarsInStockCount();
        if (currentStockSize < maxCarsOnDisplay) {
            carsInStock[currentStockSize] = car;
            System.out.println("Car added");
        } else {
            System.out.println("Maximum capacity has been reached");
        }
    }

    private int getCarsInStockCount() {
        int count = 0;
        for (Car car : carsInStock) {
            if (car != null) {
                count++;
            }
        }
        return count;
    }
}
