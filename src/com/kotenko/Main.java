package com.kotenko;

public class Main {
    public static void main(String[] args) {
        Cat rose1 = new Cat("Rose", 2, "Blue");
        System.out.println(rose1);

        Cat rose2 = new Cat("Rose", 1, "Blue");
        System.out.println(rose2);

        System.out.println(rose1.equals(rose2));

        Cat[] cats = {rose1, rose2};

        Person alex = new Person("Alex", "Montana", Gender.MALE, cats);
        System.out.println(alex);
    }
}
