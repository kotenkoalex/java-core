package com.kotenko.exercises;

public class Ex5Methods {
    public static void main(String[] args) {
        System.out.println(calculateSum(1, 2));
        System.out.println(negateInt(1));
        System.out.println(checkEquals(1, 1));
        System.out.println(compareNumbers(1, 1));
        System.out.println(capitalizedFirstLetter("hello"));
        System.out.println(calculateAmountInArray(new String[]{"", "hello"}));
        System.out.println(calculateWords("hello  java"));
    }

    private static String calculateWords(String sentence) {
        return "The sentence contains %s words".formatted(sentence.split("\\s+").length);
    }

    private static int calculateAmountInArray(String[] strings) {
        return strings.length;
    }

    private static String capitalizedFirstLetter(String string) {
        if (string == null || string.isEmpty()) {
            return "";
        }
        return Character.toUpperCase(string.charAt(0)) + string.substring(1);
    }

    private static String compareNumbers(int n1, int n2) {
        if (n1 > n2) {
            return "The first number is larger";
        } else if (n1 < n2) {
            return "The second number is larger";
        } else {
            return "The numbers are equal";
        }
    }

    private static boolean checkEquals(int n1, int n2) {
        return n1 == n2;
    }

    private static int negateInt(int n) {
        return -n;
    }

    private static int calculateSum(int n1, int n2) {
        return n1 + n2;
    }
}
