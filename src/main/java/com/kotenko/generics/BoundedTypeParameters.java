package com.kotenko.generics;

public class BoundedTypeParameters {
    public static void main(String[] args) {
        Double[] numbers1 = {1.0, 2.0, 3.0};
        System.out.println(countGreaterThan(numbers1, 0.5));

        Integer[] numbers2 = {1, 2, 3};
        System.out.println(countGreaterThan(numbers2, 0));
    }

    interface A{}
    interface B{}
    static <T extends Comparable<T>> int countGreaterThan(T[] numbers, T number) {
        int count = 0;
        for (T n : numbers) {
            if (n.compareTo(number) > 0) {
                count++;
            }
        }
        return count;
    }
}
