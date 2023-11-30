package com.kotenko.exercises.ex14streams;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        printFemale(PEOPLE);
        printPeople(Gender.FEMALE, 16, ".com", DATA);
    }

    private static void printPeople(Gender gender, Integer age, String emailContains, String data) {
        mapData(DATA).stream()
                .filter(it -> it.gender().equals(gender))
                .filter(it -> it.age() < age)
                .filter(it -> it.email().contains(emailContains))
                .forEach(System.out::println);
    }

    private static List<Person> mapData(String data) {
        List<Person> people = new ArrayList<>();
        String[] lines = data.split("\n");
        for (String line : lines) {
            String[] state = line.trim().split(",");
            int age = Integer.parseInt(state[0]);
            String firstName = String.valueOf(state[1]);
            String lastName = String.valueOf(state[2]);
            String email = String.valueOf(state[3]);
            Gender gender = Gender.valueOf(setGender(state[4]));
            people.add(new Person(age, firstName, lastName, email, gender));
        }
        return people;
    }

    private static String setGender(String gender) {
        return gender.equals("M") ? "MALE" : "FEMALE";
    }

    private static void printFemale(List<Person> people) {
        people.stream()
                .filter(it -> it.gender().equals(Gender.FEMALE))
                .toList()
                .forEach(System.out::println);
    }

    private final static List<Person> PEOPLE = List.of(
            new Person("Smith", Gender.FEMALE),
            new Person("Anna", Gender.FEMALE),
            new Person("Alex", Gender.MALE),
            new Person("Oliver", Gender.MALE)
    );

    private final static String DATA = """ 
                16,Fanchette,Williamson,fwilliamson0@github.com,F
                26,Aleksandr,Matts,amatts1@webs.com,M
                3,Maurie,Cordero,mcordero2@google.co.jp,M
                45,Donnajean,Crowson,dcrowson3@google.com.hk,F
                5,Ricardo,Gofton,rgofton4@nytimes.com,M
                65,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                37,Marjorie,Blumsom,mblumsom6@joomla.org,F
                18,Lester,Huyghe,lhuyghe7@jugem.jp,M
                39,Merrily,Stangoe,mstangoe8@tiny.cc,F
                10,Reider,Karel,rkarel9@github.io,M
                11,Dory,Jolliff,djolliffa@wufoo.com,F
                32,Homerus,Averay,haverayb@skyrock.com,M
                13,Alyda,Muglestone,amuglestonec@is.gd,F
                14,Pinchas,Louca,ploucad@google.es,M
                11,Cherin,Eltringham,celtringhame@parallels.com,F
                2,Mufi,Rothert,mrothertf@dropbox.com,F
                17,Jordana,Everex,jeverexg@ucla.edu,F
                18,Belle,Rother,brotherh@gov.uk,F
                19,Clevie,Sifflett,csiffletti@furl.net,M
                20,Gretchen,Abell,gabellj@1688.com,F
            """;
}
