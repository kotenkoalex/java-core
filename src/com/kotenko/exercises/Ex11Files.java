package com.kotenko.exercises;

import java.io.*;
import java.util.Scanner;

public class Ex11Files {

    private final static String DATA = """
                id,first_name,last_name,email,gender
                1,Fanchette,Williamson,fwilliamson0@github.com,F
                2,Aleksandr,Matts,amatts1@webs.com,M
                3,Maurie,Cordero,mcordero2@google.co.jp,M
                4,Donnajean,Crowson,dcrowson3@google.com.hk,F
                5,Ricardo,Gofton,rgofton4@nytimes.com,M
                6,Gabie,Tregenna,gtregenna5@guardian.co.uk,F
                7,Marjorie,Blumsom,mblumsom6@joomla.org,F
                8,Lester,Huyghe,lhuyghe7@jugem.jp,M
                9,Merrily,Stangoe,mstangoe8@tiny.cc,F
                10,Reider,Karel,rkarel9@github.io,M
                11,Dory,Jolliff,djolliffa@wufoo.com,F
                12,Homerus,Averay,haverayb@skyrock.com,M
                13,Alyda,Muglestone,amuglestonec@is.gd,F
                14,Pinchas,Louca,ploucad@google.es,M
                15,Cherin,Eltringham,celtringhame@parallels.com,F
                16,Mufi,Rothert,mrothertf@dropbox.com,F
                17,Jordana,Everex,jeverexg@ucla.edu,F
                18,Belle,Rother,brotherh@auda.org.au,F
                19,Clevie,Sifflett,csiffletti@furl.net,M
                20,Gretchen,Abell,gabellj@1688.com,F
            """.trim();

    private final static String PATH = "src/com/kotenko/exercises/files/";
    private final static String FILE_NAME = "data.csv";

    public static void main(String[] args) {
//        createFile(PATH, FILE_NAME);
//        writeFile(PATH, FILE_NAME, DATA);
        System.out.println(readFile(PATH, FILE_NAME));
    }

    private static String readFile(String path, String fileName) {
        StringBuilder result = new StringBuilder(new String());
        File file = new File(path + fileName);
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()){
                result.append(scanner.nextLine());
            }
        } catch (Exception e) {
            System.out.println("File has not been read");
        }
        return result.toString();
    }

    private static void writeFile(String path, String fileName, String data) {
        try (FileWriter fileWriter = new FileWriter(path + fileName)) {
            fileWriter.write(data);
            System.out.println("File has been written");
        } catch (IOException e) {
            System.out.println("File has not been written");
        }
    }

    private static void createFile(String path, String fileName) {
        try {
            File file = new File(PATH + FILE_NAME);
            if (file.createNewFile()) {
                System.out.println("File has been created");
            }
        } catch (IOException ioException) {
            System.out.println("File has not been created");
        }
    }
}
