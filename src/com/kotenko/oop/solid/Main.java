package com.kotenko.oop.solid;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Shape> shapes = List.of(
                new Circle(10),
                new Square(10),
                new Cube(),
                new Rectangle());
        ShapesPrinter printer = new ShapesPrinter();
        System.out.println(printer.json(shapes));
        System.out.println(printer.csv(shapes));
    }
}
