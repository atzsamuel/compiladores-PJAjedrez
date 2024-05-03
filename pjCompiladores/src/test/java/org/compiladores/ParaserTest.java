package org.compiladores;

import org.junit.jupiter.api.Test;

import java.io.StringReader;

public class ParaserTest {
    @Test
    public void parserAnalysis() throws Exception {
        String expresion = "a7";
        IDLexer lexer = new IDLexer(new StringReader(expresion));
        Parser p = new Parser(lexer);
        String resultado = (String) p.parse().value;
    }
}