package com.rbacpro.deodar;

import com.rbacpro.deodar.parser.deodarLexer;
import com.rbacpro.deodar.parser.deodarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class HelloWorld {

    public static void main(String[] args){
        CharStream in = CharStreams.fromString("{\"Statement\":[{\"principal\":\"aaa\",\"action\":\"bbb\",\"resource\":\"ccc\"}," +
                "{\"principal\":\"A\",\"action\":\"B\",\"resource\":\"C\"}, {\"principal\":\"A\",\"action\":\"B\",\"resource\":\"C\"}]}");

       deodarLexer lexer = new deodarLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        deodarParser t = new deodarParser(tokens);
        // TODO: how to get error?
        // testParser.PolicyContext p = t.policy();

        //testParser.StmtContext a = t.stmt();
        t.policy();
        //System.out.println("Got first id from the context: " );


    }
}
