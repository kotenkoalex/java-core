package com.kotenko.generics;

import java.util.Arrays;
import java.util.List;

public class Wildcards {
    public static void main(String[] args) {
        List<Object> list1 = Arrays.asList(1, 2);
        List<Integer> list2 = Arrays.asList(1, 2);
        List<String> list3 = Arrays.asList("1", "2");
        printUnBounded(list1);
        printUpperBounded(list2);
        printLowerBounded(list3);
    }

    //Unbounded Wildcard
    static void printUnBounded(List<?> list) {
        list.forEach(e -> {
            System.out.println(e.getClass());
            System.out.println(e);
        });
    }

    //Upper Bounded Wildcard
    static void printUpperBounded(List<? extends Number> list) {
        list.forEach(e -> {
            System.out.println(e.getClass());
            System.out.println(e);
        });
    }

    //Lower Bounded Wildcard
    static void printLowerBounded(List<? super String> list) {
        list.forEach(e -> {
            System.out.println(e.getClass());
            System.out.println(e);
        });
    }
}
