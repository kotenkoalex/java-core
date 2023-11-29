package com.kotenko.generics;
public class GenericsClasses {
    public static void main(String[] args) {
        Box<Phone> box1 = new Box<>();
        box1.set(new Phone("iPhone"));
        System.out.println(box1.get());

        Box<Letter> box2 = new Box<>();
        box2.set(new Letter("Letter"));
        System.out.println(box2.get());
    }
}
