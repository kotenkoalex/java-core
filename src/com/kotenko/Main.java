package com.kotenko;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello what is your name?");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        System.out.println("Hello: " + input);

        System.out.println("What is your age: ");
        int age = scanner.nextInt();
        if(age < 15){
            System.out.println("Your are a child");
        } else {
            System.out.println("Your are an adult");
        }
    }
}
