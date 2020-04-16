package com.company;

import java.io.IOException;
import java.util.StringTokenizer;

public class Java extends Language{

    public static final String COMMENT = "//";
    public static final String JAVADOC1 = "/**";
    public static final String JAVADOC2 = "*";
    public static final String JAVADOC3 = "*/";
    public static final String IF = "if";
    public static final String ELSE = "else";
    public static final String WHILE = "while";
    public static final String FOR = "for";
    public static final String I_STRUCTURE = "{";
    public static final String F_STRUCTURE = "}";
    public static final String PUBLIC = "public";
    public static final String VOID = "void";
    public static final String INT = "int";
    public static final String STRING = "String";
    public static final String DOUBLE = "double";
    public static final String CHAR = "char";
    public static final String BOOLEAN = "boolean";
    public static final String SEMI = ";";

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
            else if (a.equals(PUBLIC)){
                String next = syntax[1];
                if (next.equals("class")){
                    System.out.println("class " + syntax[2] + "(object):");
                }
                else if (!(next.equals(INT) || next.equals(VOID)
                        || next.equals(DOUBLE) || next.equals(STRING)
                        || next.equals(BOOLEAN))){

                    constructor(a);
                }
                else {
                    method(a);
                }
            }
            else if (first.equals(IF) || first.equals(WHILE) || first.equals(ELSE)){
                ifWhileStatement(a);
            }
            else if (first.equals(FOR)){
                forLoop(a);
            }
            else {
                //body(a);
                System.out.print(a);
            }
            System.out.print(" ");
        }

    }

    @Override
    public void constructor(String str) throws IOException{

        String[] syntax = str.split(" ");
        // public Java(String str, int y) {
        // public Java (String str, int y) { MUST WORK FOR ALL CASES
        // public Java ( String str , int y ) {
        String parameters = "";
        String parameter;
        for (int i = 0; i < syntax.length; i++) {
            parameter = syntax[i];
            if (!(parameter.equals(STRING) || parameter.equals(INT) || parameter.equals(DOUBLE)
                    || parameter.equals("(") || parameter.equals(")"))) {
                parameters+= " " + parameter.replace("(", "").replace(")", "");
            }
        }

        boolean isComment = false;
        StringTokenizer st = new StringTokenizer(str);
        String name = st.nextToken(); //"public"
        name = st.nextToken();
        //String parameters = "";
        //String parameter;
        do {
            parameter = st.nextToken().replace("(", "");
            if (parameter.equals(COMMENT)) {
                isComment = true;
                break;
            } else if (!(parameter.equals(STRING) || parameter.equals(INT) || parameter.equals(DOUBLE))) {
                parameters+= " " + parameter;
            }
        } while(st.hasMoreTokens());
        parameters = parameters.replace(")", "");
        if (toLang.equals("Python")) {
            if (parameters.equals(" ")) {
                System.out.print("def __init__(self):");
            } else {
                System.out.println("def __init__(self," + parameters + "):");
            }
        } else {
            System.out.print("function " + name + " (" + parameters + ")");
        }
        if (isComment) {
            String comment = "";
            String next;
            do {
                next = st.nextToken();
                if (!(next.equals(COMMENT))) {
                    comment+= " " + next;
                }
            } while (st.hasMoreTokens());
            this.lineComment(comment);
        }
    }

    @Override
    public void method(String str) throws IOException{

        //System.out.println("test");
    }

    @Override
    public void body(String str) throws IOException{

        //System.out.println("test");
    }

    @Override
    public void forLoop(String str) throws IOException{

        //System.out.println("test");
    }

    @Override
    public void ifWhileStatement(String str) throws IOException{

        //System.out.println("test");
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
