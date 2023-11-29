package com.kotenko.exercises.ex12classes.second.ex1;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.nio.file.Files;
import java.util.stream.Stream;

public class Reader implements IReader {
    @Override
    public Person[] readData(File file) {
        return readDataFromFile(file);
    }

    private Person[] readDataFromFile(File file) {
        int linesNumber = countFileLines(file) - 1; //first line is title
        Person[] people = new Person[linesNumber];
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
            String title = br.readLine();
            String line;
            int counter = 0;
            while ((line = br.readLine()) != null) {
                String[] data = line.split(",");
                people[counter++] = mapper(data, counter + 1);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        return people;
    }

    private int countFileLines(File file) {
        try (Stream<String> lines = Files.lines(file.toPath())) {
            return (int) lines.count();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    private Person mapper(String[] data, int lineNumber) {
        Person person = new Person();
        try {
            person = new Person(
                    Long.parseLong(data[0]),
                    data[1],
                    data[2],
                    data[3],
                    Gender.valueOf(data[4]));
        } catch (IllegalArgumentException e) {
            System.out.printf("Problem with line: %s%n", lineNumber);
        }
        return person;
    }
}
