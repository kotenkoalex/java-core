package com.kotenko.oop.polymorphism;

public interface Vehicle {
    double PURCHASE_RATE = 1.1;
    void move(int amount);

    void applyBreaks(int amount);

    int getCurrentSpeed();

    default double milesToKm(int speed){
        return getCurrentSpeed() * 1.609;
    }
}
