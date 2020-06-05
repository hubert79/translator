package com.company;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;

public class Main {

    public static void answer() throws IOException {
        InputStreamReader reader = new InputStreamReader(System.in);
        BufferedReader input = new BufferedReader(reader);
        System.out.println("Enter what language you want translated to which language (ex: 'j2p'): ");
        String answer = input.readLine().toLowerCase();
        while (!answer.equals("j2p")) {
            System.out.println("!!! j2p !!!");
            answer = input.readLine().toLowerCase();
        }
        if (answer.equals("j2p")) {
            Language j = new Java("Python");
            j.read();
        }
    }
    public static void main(String[] args) throws IOException{
        // answer();


    }
}
