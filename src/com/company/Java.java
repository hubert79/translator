package com.company;

import java.io.IOException;

public class Java extends Language{

    public static final String COMMENT = "//";
    public static final String JAVADOC1 = "/**";
    public static final String JAVADOC2 = "*";
    public static final String JAVADOC3 = "*/";
    //public static final String IF = "if";
    //public static final String ELSE = "else";
    //public static final String WHILE = "while";
    //public static final String FOR = "for";
    public static final String I_STRUCTURE = "{";
    public static final String F_STRUCTURE = "}";
    //public static final String PUBLIC = "public";
    //public static final String VOID = "void";
    //public static final String INT = "int";
    //public static final String STRING = "String";
    //public static final String DOUBLE = "double";
    //public static final String CHAR = "char";
    //public static final String BOOLEAN = "boolean";
    //public static final String SEMI = ";";

    public Java(String toLang) throws IOException {
        super(toLang);
    }

    @Override
    public void translate(String str) throws IOException {

        String[] syntax = str.split(" ");
        String first = syntax[0];

        for (String a : syntax){

            //System.out.print(a);
            if(a.equals(COMMENT)){
                lineComment(a);
            }
            else if (a.equals(JAVADOC1)){
                System.out.print("\"\"\"");
            }
            else if (a.equals(JAVADOC2)){
                longComment(a);
            }
            else if (a.equals(JAVADOC3)){ ;
                System.out.print("\"\"\"");
            }
            else if (a.equals(I_STRUCTURE)){
                System.out.println();
            }
            else if (a.equals(F_STRUCTURE)){
                System.out.println();
            }
            else {
                System.out.print(a);
            }
            System.out.print(" ");
        }

    }

    @Override
    public void constructor(String str) throws IOException{

        System.out.println("test");
    }

    @Override
    public void method(String str) throws IOException{

        System.out.println("test");
    }

    @Override
    public void body(String str) throws IOException{

        System.out.println("test");
    }

    @Override
    public void forLoop(String str) throws IOException{

        System.out.println("test");
    }

    @Override
    public void ifWhileStatement(String str) throws IOException{

        System.out.println("test");
    }

    @Override
    public void lineComment(String str) throws IOException{

        System.out.print("#" + str.replace(COMMENT, ""));
    }

    @Override
    public void longComment(String str) throws IOException{

        System.out.print(str.replace("* ", ""));
    }
}
