package com.kotenko.data.structure;

import java.util.Arrays;

public class TheArrays {
    public static void main(String[] args) {
        String[]colors = new String[3];
        colors[0] = "white";
        colors[1] = "green";
        colors[1] = "yellow";

        System.out.println(Arrays.toString(colors));
        System.out.println(colors[0]);
        System.out.println(colors[1]);

        int[]numbers = {100, 200};
        System.out.println(Arrays.toString(numbers));

        System.out.println();
        for (int i = 0; i < colors.length; i++) {
            System.out.println(colors[i]);
        }

        System.out.println();
        for (int i = colors.length-1; i >= 0; i--) {
            System.out.println(colors[i]);
        }

        System.out.println();
        for(String color: colors){
            System.out.println(color);
        }

        System.out.println();
        Arrays.stream(colors).forEach(System.out::println);
    }
}
