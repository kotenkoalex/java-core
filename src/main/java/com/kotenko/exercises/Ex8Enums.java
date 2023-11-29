package com.kotenko.exercises;

import java.util.Arrays;

public class Ex8Enums {
    enum ThirstSize {
        S, M, L, XL, XXL, XXXL;
    }

    public static void main(String[] args) {
        Arrays.stream(ThirstSize.values())
                .forEach(item -> System.out.println(item.name().toLowerCase()));
    }
}
