package com.company;


import com.company.antlr4gen.Java8Lexer;

import java.util.HashMap;
import java.util.Map;

public class JavaToPythonVocabulary {

    private static Map<Integer, String> javaToPythonVocabulary = new HashMap<>();

    public JavaToPythonVocabulary() {
        javaToPythonVocabulary.put(Java8Lexer.CLASS,  "class");

        javaToPythonVocabulary.put(Java8Lexer.PUBLIC, "public");

        javaToPythonVocabulary.put(Java8Lexer.VOID, "void");

        //typy
        javaToPythonVocabulary.put(Java8Lexer.BOOLEAN, "bool");
        javaToPythonVocabulary.put(Java8Lexer.CHAR, "str");
        javaToPythonVocabulary.put(Java8Lexer.BYTE, "int");
        javaToPythonVocabulary.put(Java8Lexer.SHORT, "int");
        javaToPythonVocabulary.put(Java8Lexer.INT, "int");
        javaToPythonVocabulary.put(Java8Lexer.FLOAT, "float");
        javaToPythonVocabulary.put(Java8Lexer.DOUBLE, "double");

        javaToPythonVocabulary.put(Java8Lexer.IF, "if");
        javaToPythonVocabulary.put(Java8Lexer.ELSE, "else");

        javaToPythonVocabulary.put(Java8Lexer.RETURN, "return");

        javaToPythonVocabulary.put(Java8Lexer.LBRACE, "{");
        javaToPythonVocabulary.put(Java8Lexer.RBRACE, "}");
        javaToPythonVocabulary.put(Java8Lexer.LBRACK, "[");
        javaToPythonVocabulary.put(Java8Lexer.RBRACK, "]");
        javaToPythonVocabulary.put(Java8Lexer.LPAREN, "(");
        javaToPythonVocabulary.put(Java8Lexer.RPAREN, ")");

        javaToPythonVocabulary.put(Java8Lexer.SEMI, ";");
        javaToPythonVocabulary.put(Java8Lexer.COMMA, ",");
        javaToPythonVocabulary.put(Java8Lexer.DOT, ".");

    }

    public static String getPythonTranslation(Integer tokenIndex) {
        return javaToPythonVocabulary.get(tokenIndex);
    }
}
