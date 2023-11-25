package com.kotenko;

import java.util.Optional;

public class Main {
    public static void main(String[] args) {
        String brand = null;
        Optional<String> brandOptional = Optional.ofNullable(brand);
        System.out.println(brandOptional.isEmpty());
    }
}
