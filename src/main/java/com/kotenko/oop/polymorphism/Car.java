package com.kotenko.oop.polymorphism;

public class Car implements Vehicle {

    private int currentSpeed;

    @Override
    public void move(int amount) {
        this.currentSpeed += amount;
    }

    @Override
    public void applyBreaks(int amount) {
        this.currentSpeed -= amount;
    }

    @Override
    public int getCurrentSpeed() {
        return this.currentSpeed;
    }
}
