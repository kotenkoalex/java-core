package com.kotenko.data.structure;

import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Queue;

public class TheQueues {
    public static void main(String[] args) {
//        queues();
        LinkedList<Person> linkedList = new LinkedList<>();
        linkedList.add(new Person("A", 1));
        linkedList.add(new Person("B", 2));
        ListIterator<Person> personListIterator = linkedList.listIterator();
        while (personListIterator.hasNext()){
            System.out.println(personListIterator.next());
        }
        System.out.println();
        while (personListIterator.hasPrevious()){
            System.out.println(personListIterator.previous());
        }
    }

    private static void queues() {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex", 21));
        supermarket.add(new Person("Sofiya", 18));
        supermarket.add(new Person("Tom", 30));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
    }

    static record Person(String name, int age){}
}
