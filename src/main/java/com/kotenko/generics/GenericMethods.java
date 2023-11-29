package com.kotenko.generics;

public class GenericMethods {
    public static void main(String[] args) {
        String[] names = {"Alex", "Jamila"};
        print(names);
        System.out.println();
        Character[] letters = {'a', 'b'};
        print(letters);
    }

    static <T> void print(T[] array) {
        for (T e : array) {
            System.out.println(e.getClass().getName() + " - " + e);
        }
    }
}
