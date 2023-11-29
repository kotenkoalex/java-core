package com.kotenko.exercises.ex12classes.second.ex2;

public class Main {
    public static void main(String[] args) {
        System.out.println(new Person(
                "Liam",
                "Nisson",
                "M",
                "liam.nisson@gmail.com"
        ));

        System.out.println(new Person(
                "Lisa",
                "Cudrow",
                "F",
                "lisa.cudrow@gmail.com"
        ));
    }

    record Person(
            String firstName,
            String lastName,
            String gender,
            String email) {
    }
}
