package com.kotenko.oop.solid;

public class Circle implements Shape {
    private final int radios;

    public Circle(int radios) {
        this.radios = radios;
    }

    public int getRadios() {
        return radios;
    }

    @Override
    public double area() {
        return Math.PI * Math.pow(getRadios(), 2);
    }
}
