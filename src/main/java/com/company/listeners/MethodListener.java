package com.company.listeners;

import com.company.antlr4gen.Java8BaseListener;
import com.company.antlr4gen.Java8Parser;
import org.antlr.v4.runtime.tree.TerminalNode;

public class MethodListener  extends Java8BaseListener {

    @Override
    public void enterMethodDeclarator(Java8Parser.MethodDeclaratorContext context) {
        TerminalNode node = context.Identifier();
        String methodName = node.getText();
    }
}
