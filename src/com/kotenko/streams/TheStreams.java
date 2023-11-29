package com.kotenko.streams;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class TheStreams {
    public static void main(String[] args) {
        List<String> names = List.of("Alex", "Tom", "Marta");
        Stream<String> stream1 = names.stream();
        Stream<String> stream2 = Stream.of("Alex", "Tom", "Marta");

        List<Person> people = List.of(
                new Person("Alex", 20),
                new Person("Tom", 22),
                new Person("Marta", 18),
                new Person("John", 17),
                new Person("Lex", 16)
        );

        //declarative
        List<Person> collect = people.stream()
                .filter(it -> it.age >= 18)
                .limit(2)
                .toList();
        collect.forEach(System.out::println);
        System.out.println();

        //imperative
        int counter = 0;
        int limit = 2;
        List<Person> result = new ArrayList<>();
        for (Person person : people) {
            if (person.age >= 18 && counter < limit) {
                result.add(person);
                counter++;
                if (counter == limit) {
                    break;
                }
            }
        }
        result.forEach(System.out::println);
    }

    record Person(String name, Integer age) {
    }

    ;
}
