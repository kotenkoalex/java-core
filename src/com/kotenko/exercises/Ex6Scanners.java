package com.kotenko.exercises;

import java.util.Random;
import java.util.Scanner;

public class Ex6Scanners {
    public static void main(String[] args) {
//        System.out.println(capitalizeInput());

//        int argumentNumber;
//        for (String arg : args) {
//            argumentNumber = Integer.parseInt(arg);
//            if (argumentNumber % 2 == 0) {
//                System.out.println(arg + " is Even");
//            } else {
//                System.out.println(arg + " is Odd");
//            }
//        }

//        System.out.println(checkInputNumberIsPrime());

//        displayRandomJoke();
    }

    private static void displayRandomJoke() {
        String[] jokes = {
                "Why did the scarecrow win an award? Because he was outstanding in his field!",
                "How does a penguin build its house? Igloos it together!",
                "Parallel lines have so much in common. It's a shame they'll never meet.",
                "What do you call a bear with no teeth? A gummy bear!",
                "Why don't scientists trust atoms? Because they make up everything!"
        };
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNext()) {
            int randomNumber = random.nextInt(jokes.length);
            if (scanner.nextLine().equals("yes")) {
                System.out.println(jokes[randomNumber]);
            } else {
                break;
            }
        }
        scanner.close();
    }


    private static String checkInputNumberIsPrime() {
        String result = new String();
        Scanner scanner = new Scanner(System.in);
        int parsedNumber = Integer.parseInt(scanner.nextLine());
        if (parsedNumber <= 1) {
            return "Is not prime";
        }
        //use i <= Math.sqrt(num) it simplify code in 2 times
        for (int i = 2; i <= parsedNumber; i++) {
            if (parsedNumber % i == 0 && parsedNumber != i) {
                return "Is not prime";
            }
        }
        scanner.close();
        return "Is prime";
    }

    private static String capitalizeInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().toUpperCase();
    }
}
