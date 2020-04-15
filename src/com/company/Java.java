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

        for (String a : syntax){

            //System.out.print(a);
            if(a.equals("public")){
                System.out.print("xxx");
            }
            else {
                System.out.print(a);
            }
            System.out.print(" ");
        }

    }
}
