package com.kotenko.exercises.ex12classes.second.ex1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class Writer implements IWriter {
    @Override
    public void writeData(String data, File file) {
        writeDataToFile(data, file);
    }

    private void writeDataToFile(String data, File file) {
        try (FileWriter fileWriter = new FileWriter(file)) {
            fileWriter.write(data);
            System.out.println("file has been successfully written");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
