package com.kotenko.generics;

import java.util.ArrayList;
import java.util.List;

public class Example {
    public static void main(String[] args) {
        List<Integer> numbers = new ArrayList();
        numbers.add(1);
//        numbers.add("2");
        for (Object number : numbers) {
            System.out.println((Integer) number);
        }

//        Comparable number = 10;
//        number.compareTo("10");
        Comparable<Integer> number = 10;
        System.out.println(number.compareTo(10));
    }
}
