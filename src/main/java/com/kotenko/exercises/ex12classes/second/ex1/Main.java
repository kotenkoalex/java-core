package com.kotenko.exercises.ex12classes.second.ex1;

import java.io.*;
public class Main {
    public static void main(String[] args) {
        File file = new File(PATH);
        IWriter writer = new Writer();
        writer.writeData(DATA, file);
        IReader reader = new Reader();
        Person[] people = reader.readData(file);
        for (Person person : people) {
            System.out.println(person);
        }
    }

    private static final String PATH = "src/com/kotenko/exercises/ex12classes/third/data.csv";
    private static final String DATA = """
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
}
