package com.kotenko.exercises.ex12classes;

public class Car {
    private String manufacturer;
    private double price;
    private Engine engine;

    public Car(String manufacturer, double price, Engine engine) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.engine = engine;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    @Override
    public String toString() {
        return "Car{" +
                "manufacturer='" + manufacturer + '\'' +
                ", price=" + price +
                ", engine=" + engine +
                '}';
    }
}
