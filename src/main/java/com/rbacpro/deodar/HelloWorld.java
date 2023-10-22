package com.rbacpro.deodar;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.rbacpro.deodar.parser.generated.deodarLexer;
import com.rbacpro.deodar.parser.generated.deodarParser;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;

public class HelloWorld {

    public static void main(String[] args){
        String policy = "{\"Version\":\"v1\",\"Statement\":[{\"principal\":\"*\",\"action\":\"bbb\",\"resource\":\"ccc\"}," +
                "{\"principal\":\"A \",\"action\":\"B\",\"resource\":\"C\"}, {\"principal\":\"ABc\",\"action\":\"B\",\"resource\":\"C\"}]}";
        CharStream in = CharStreams.fromString(policy);
        // Try to convert policy into json
        JsonObject jsonObject = JsonParser.parseString(policy).getAsJsonObject();

        System.out.println("Policy is valid json and is version equal to v1? " + jsonObject.get("Version").getAsString().equals("v1"));

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
