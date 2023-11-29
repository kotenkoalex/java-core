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

    public static void main(String[] args) {
        File file = createFile("src/com/kotenko/exercises/data.csv");
        writeFile(file, DATA, false);
//        System.out.println(readFile(file));
        readFileAndSkipFirstLine(file);
    }

    private static void readFileAndSkipFirstLine(File file) {
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(file))) {
            String header = bufferedReader.readLine();//skip first line
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static String readFile(File file) {
        StringBuilder result = new StringBuilder();
        try (Scanner scanner = new Scanner(file)) {
            while (scanner.hasNext()) {
                result.append(scanner.nextLine().trim()).append("\n");
            }
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
        return result.toString();
    }

    private static void writeFile(File file, String data, boolean appendable) {
        try (FileWriter fileWriter = new FileWriter(file, appendable)) {
            fileWriter.write(data);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }

    private static File createFile(String path) {
        try {
            File file = new File(path);
            if (!file.exists()) {
                file.createNewFile();
            }
            return file;
        } catch (IOException e) {
            System.out.println(e.getMessage());
            throw new IllegalArgumentException(e);
        }
    }
}
