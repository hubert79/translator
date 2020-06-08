package com.company;


import com.company.antlr4gen.Java8Lexer;

import java.util.HashMap;
import java.util.Map;

public class JavaToPythonVocabulary {

    private static Map<Integer, String> javaYoPythonVocabulary = new HashMap<>();

    public static Map<Integer, String> getJavaYoPythonVocabulary() {
        return javaYoPythonVocabulary;
    }



    public static void setJavaYoPythonVocabulary(Map<Integer, String> javaYoPythonVocabulary) {
        javaYoPythonVocabulary.put(Java8Lexer.CLASS,  "class");

        javaYoPythonVocabulary.put(Java8Lexer.PUBLIC, "public");

        javaYoPythonVocabulary.put(Java8Lexer.VOID, "void");

        //typy
        javaYoPythonVocabulary.put(Java8Lexer.BOOLEAN, "bool");
        javaYoPythonVocabulary.put(Java8Lexer.CHAR, "str");
        javaYoPythonVocabulary.put(Java8Lexer.BYTE, "int");
        javaYoPythonVocabulary.put(Java8Lexer.SHORT, "int");
        javaYoPythonVocabulary.put(Java8Lexer.INT, "int");
        javaYoPythonVocabulary.put(Java8Lexer.FLOAT, "float");
        javaYoPythonVocabulary.put(Java8Lexer.DOUBLE, "double");

        javaYoPythonVocabulary.put(Java8Lexer.IF, "if");
        javaYoPythonVocabulary.put(Java8Lexer.ELSE, "else");

        javaYoPythonVocabulary.put(Java8Lexer.RETURN, "return");

        javaYoPythonVocabulary.put(Java8Lexer.LBRACE, "{");
        javaYoPythonVocabulary.put(Java8Lexer.RBRACE, "}");
        javaYoPythonVocabulary.put(Java8Lexer.LBRACK, "[");
        javaYoPythonVocabulary.put(Java8Lexer.RBRACK, "]");
        javaYoPythonVocabulary.put(Java8Lexer.LPAREN, "(");
        javaYoPythonVocabulary.put(Java8Lexer.RPAREN, ")");

        javaYoPythonVocabulary.put(Java8Lexer.SEMI, ";");
        javaYoPythonVocabulary.put(Java8Lexer.COMMA, ",");
        javaYoPythonVocabulary.put(Java8Lexer.DOT, ".");



    }
}
