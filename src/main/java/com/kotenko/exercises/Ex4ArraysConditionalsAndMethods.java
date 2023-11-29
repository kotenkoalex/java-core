package com.kotenko.exercises;

import java.util.Arrays;
import java.util.Comparator;

public class Ex4ArraysConditionalsAndMethods {
    public static void main(String[] args) {
        System.out.println(findTheLongestString(new String[]{"", "one", "java", "hello"}));
        System.out.println(reverseString("hello"));
        System.out.println(transformedString("   amig os cod e  "));

    }

    private static String findTheLongestString(String[] strings) {
        if (strings == null || strings.length == 0) {
            return "";
        }
        return Arrays.stream(strings).max(Comparator.comparing(String::length)).orElse("");
    }

    private static String transformedString(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        StringBuilder transformedString = new StringBuilder();
        char letter;
        for (int i = 0; i < string.length(); i++) {
            letter = string.charAt(i);
            if (letter != ' ') {
                transformedString.append(letter);
            }
        }
        return transformedString.substring(0, 1).toUpperCase() + transformedString.substring(1);
    }

    private static String reverseString(String string) {
        if (string == null || string.isEmpty()) {
            return string;
        }
        StringBuilder reversed = new StringBuilder();
        for (int i = string.length() - 1; i >= 0; i--) {
            reversed.append(string.charAt(i));
        }
        return reversed.toString();
    }
}
