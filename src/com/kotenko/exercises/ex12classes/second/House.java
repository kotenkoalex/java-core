package com.kotenko.exercises.ex12classes.second;

public class House {
    private String type;

    private double price;

    public House(String type, double price) {
        this.type = type;
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "House{" +
                "type='" + type + '\'' +
                ", price=" + price +
                '}';
    }
}
