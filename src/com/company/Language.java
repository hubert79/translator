package com.company;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public abstract class Language {

public String toLang;

public Language(String toLang) throws IOException {}

public void read() throws  IOException{

        InputStreamReader reader = new InputStreamReader (System.in);
        BufferedReader input = new BufferedReader (reader);
        System.out.println("Enter the name of the text file imported: ");
        FileReader readFile = new FileReader(input.readLine());
        BufferedReader inFile = new BufferedReader(readFile);
        System.out.println();
        System.out.println("Reading file...");
        String inputString = inFile.readLine();

        while (inputString != null) {

        //System.out.println(inputString);
        System.out.println();
        this.translate(inputString);
        inputString = inFile.readLine();
        }

        System.out.println();
        System.out.println("Reading completed.");

        inFile.close();
        }

    public abstract void translate(String str) throws IOException;

}
