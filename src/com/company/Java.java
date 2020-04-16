package com.company;

import java.io.IOException;
import java.util.NoSuchElementException;
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
    public static final String INPUT = "input.readLine()";

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

        boolean isComment = false;
        StringTokenizer st = new StringTokenizer(str);
        String name = st.nextToken(); //"public"
        name = st.nextToken(); //return type
        name = st.nextToken();
        String parameters = "";
        String parameter;
        do {
            parameter = st.nextToken().replace("(", "");
            if (parameter.equals(COMMENT)) {
                isComment = true;
                break;
            } else if (!(parameter.equals(CHAR) || parameter.equals(INT) || parameter.equals(BOOLEAN)
                    || parameter.equals(DOUBLE) || parameter.equals(STRING))) {
                parameters+= " " + parameter;
            }
        } while (st.hasMoreTokens());
        parameters = parameters.replace(")", "");
        if (toLang.equals("Python")) {
            System.out.println();
            System.out.print("def " + name);
            if (parameters.equals(" ")) {
                System.out.print("(self):");
            } else {
                System.out.print("(self, " + parameters.replace(" ", "") + "):");
            }
        } else {
            System.out.print("this." + name + " = function (" + parameters + ")");
        }
        if (isComment) {
            String comment = "";
            String nextField;
            do {
                nextField = st.nextToken();
                comment+= " " + nextField;
            } while (st.hasMoreTokens());
            this.lineComment(comment);
        }
    }

    @Override
    public void body(String str) throws IOException{

        boolean isComment = false;
        StringTokenizer st = new StringTokenizer(str);
        String first = st.nextToken();
        if (first.equals("System.out.println") || first.equals("return") || str.indexOf("this.") >= 0) {
            String rest = "";
            String next;
            while (st.hasMoreTokens()) {
                next = st.nextToken();
                if (next.equals(COMMENT)) {
                    isComment = true;
                    break;
                }
                rest+= " " + next;
            }
            if (first.equals("System.out.println")) { // print line
                if (toLang.equals("Python")) {
                    System.out.print("print" + rest.replace(SEMI, ""));
                } else {
                    System.out.print("console.log" + rest);
                }
            } else if (first.equals("return")) { // return statement
                if (toLang.equals("Python")) {
                    System.out.print(first + rest.replace(SEMI, ""));
                } else {
                    System.out.print(first + rest);
                }
            } else { // method call
                if (toLang.equals("Python")) {
                    System.out.print(first.replace("this.", "self.") + rest.replace(SEMI, ""));
                } else {
                    System.out.print(first.replace("this.", "") + rest);
                }
            }
            System.out.println();
        }
        else if (str.indexOf("=") > 0) { // variable declaration
            String equals = st.nextToken(); //"="
            String value;
            if (!(equals.equals("="))) { // presence of a different variable type
                first = equals;
                value = st.nextToken();
                value = st.nextToken();
            } else {
                value = st.nextToken();
                if (str.indexOf(INPUT) >= 0) { // input statement
                    String rest = "";
                    String next;
                    while (st.hasMoreTokens()) {
                        next = st.nextToken();
                        if (next.equals(COMMENT)) {
                            isComment = true;
                            break;
                        }
                        rest+= " " + next;
                    }
                    if (toLang.equals("Python")) {
                        System.out.println("input(" + rest);
                    } else {
                        System.out.println("prompt(" + rest + ");");
                    }
                    System.out.println();
                }
            }
            if (toLang.equals("Python")) {
                System.out.print("self." + first + " = " + value.replace(";", ""));
            } else {
                System.out.print("this." + first + " = " + value);
            }
            System.out.println();
        } else if (first.equals("private")) {
            // write nothing and do not add a new line
        } else {
            String rest = "";
            String next = st.nextToken();
            while (st.hasMoreTokens()) {
                if (next.equals(COMMENT)) {
                    isComment = true;
                    break;
                }
                rest+= next;
                next = st.nextToken();
            }
            if (toLang.equals("Python")) {
                System.out.print(rest.replace(";", ""));
            } else {
                System.out.print(rest); //write whatever is contained.
            }
            System.out.println();
        }
        try {
            if (isComment || st.nextToken().equals(COMMENT)) {
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
        catch (NoSuchElementException e) {
            // no comment
        }
    }

    @Override
    public void forLoop(String str) throws IOException{

        StringTokenizer st = new StringTokenizer(str);
        try {
            String tFor = st.nextToken(); // "for"
            String name = st.nextToken(); // "(int"
            name = st.nextToken(); //"x"
            String determine = st.nextToken(); // ":" or "="
            if (determine.equals(":")) { // check for a for-each loop.
                String object = st.nextToken();
                if (toLang.equals("Python")) {
                    object = object.replace(")", "");
                    System.out.print(tFor + " " + name + " in " + object + ":");
                } else {
                    System.out.print(tFor + "(var " + name + " in " + object);
                }
            } else { // regular for loop.
                String start = st.nextToken(); // starting integer
                name = st.nextToken(); // "x"
                String operator = st.nextToken(); // "<"
                String stop = st.nextToken(); // ending integer
                String step = st.nextToken();
                if (step.indexOf("++") > 0 || step.indexOf("--") > 0) {
                    if (toLang.equals("Python")) {
                        start = start.replace(SEMI, "");
                        stop = stop.replace(SEMI, "");
                        System.out.print(tFor + " " + name + " in range(" + start + ", " + stop + "):");
                    } else {
                        System.out.print(tFor + " (var " + name + " " + determine + " " + start + " "
                                + name + " " + operator + " " + stop + " " + step);
                    }
                } else {
                    if (toLang.equals("Python")) {
                        String increment = st.nextToken();
                        increment = st.nextToken();
                        increment = st.nextToken();
                        increment = st.nextToken();
                        start = start.replace(SEMI, "");
                        stop = stop.replace(SEMI, "");
                        System.out.print(tFor + " " + name + " in range(" + start + ", " + stop + ", "
                                + increment + ":");
                    } else {
                        String increment = st.nextToken();
                        increment = st.nextToken();
                        increment = st.nextToken();
                        String arithmetic = increment;
                        increment = st.nextToken();
                        System.out.print(tFor + " (var " + name + " " + determine + " " + start + " "
                                + name + " " + operator + " " + stop + " " + name + " " + determine
                                + " " + name + " " + arithmetic + " " + increment);
                    }
                }
            }
        }
        catch (NoSuchElementException e) {
            System.out.print("Error in 'for'-loop.");
        }
        try {
            if (st.nextToken().equals(COMMENT)) {
                String comment = "";
                while(st.hasMoreTokens()) {
                    comment+= " " + st.nextToken();
                }
                this.lineComment(comment);
            }
        }
        catch (NoSuchElementException e) {
            // No comment.
        }
    }

    @Override
    public void ifWhileStatement(String str) throws IOException{

        boolean isComment = false;
        StringTokenizer st = new StringTokenizer(str);
        String first = st.nextToken();
        if (first.equals(ELSE)) {
            System.out.print(ELSE);
        } else {
            System.out.print(first + " "); // "if" or "while"
            String syntax;
            do {
                syntax = st.nextToken();
                if (syntax.equals(COMMENT)) {
                    isComment = true;
                    break;
                }
                if (toLang.equals("Python")) {
                    if (syntax.equals("||")) {
                        System.out.print(" or ");
                    } else if (syntax.equals("&&")) {
                        System.out.print(" and ");
                    } else if (syntax.equals("!")) {
                        System.out.print(" not ");
                    } else {
                        System.out.print(syntax.replace(")", "").replace("(", "")); // Write whatever is being
                        // compared or inequalities.
                    }
                } else {
                    System.out.print(" " + syntax + " "); // Same syntax as Java.
                }
            } while (st.hasMoreTokens());
            if (toLang.equals("Python")) {
                System.out.print(":");
            }
        }
        if (isComment) {
            String comment = "";
            while (st.hasMoreTokens()) {
                comment+= " " + st.nextToken();
            }
            this.lineComment(comment);
        }
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
