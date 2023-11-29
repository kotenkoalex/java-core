package com.kotenko.data.structure;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

public class TheMaps {
    public static void main(String[] args) {
        Map<Integer, Person> map = new HashMap<>();
        map.put(1, new Person("Alex"));
        map.put(1, new Person("Alex 2"));
        map.put(2, new Person("Alexa"));
        map.put(3, new Person("Tom"));
        System.out.println(map);
        System.out.println(map.size());
        System.out.println(map.get(1));
        System.out.println(map.containsKey(5));
        System.out.println(map.entrySet());
        System.out.println(map.keySet());
        System.out.println();
        map.entrySet().forEach(System.out::println);
        System.out.println();
        map.remove(1);
        map.forEach((integer, person)-> System.out.println(integer + " " + person));
        System.out.println(map.getOrDefault(5, new Person("default")));

        System.out.println();
        System.out.println(new Person("Jamila").hashCode());
        System.out.println(new Person("Jamila").hashCode());
        Map<Person, Diamond> map2 = new HashMap<>();
        map2.put(new Person("Jamila"), new Diamond("Expensive diamond"));
        System.out.println(map2.get(new Person("Jamila")));
    }

    static class Person{
        private String name;

        public Person(String name) {
            this.name = name;
        }
        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Person person = (Person) o;
            return Objects.equals(name, person.name);
        }

        @Override
        public int hashCode() {
            return Objects.hash(name);
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    '}';
        }
    }

    record Diamond(String name){}
}
