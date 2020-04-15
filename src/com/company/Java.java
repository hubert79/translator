package com.company;

import java.io.IOException;

public class Java extends Language{

    public Java(String toLang) throws IOException {
        super(toLang);
    }

    @Override
    public void translate(String str) throws IOException {
        String[] syntax = str.split(" ");
        String first = syntax[0];

        if(first.equals("public")){
            System.out.println("xxx");
        }

    }
}
