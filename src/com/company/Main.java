package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {

    public static void answer() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter what language you want translated to which language (ex: 'Python to Java'): ");
        String answer = input.readLine().toLowerCase();
        while (!(answer.equals("python to java") || answer.equals("python to javascript") ||
                answer.equals("java to python") || answer.equals("java to javascript") ||
                answer.equals("javascript to java") || answer.equals("javascript to python"))) {
            System.out.println("Invalid command. Re-enter: ");
            answer = input.readLine().toLowerCase();
        }
        if (answer.equals("java to python")) {
            Language j = new Java("Python");
            j.read();
        }
    }
    public static void main(String[] args) throws IOException{
        answer();
    }
}
