package com.rbacpro.deodar.parser;

import com.google.errorprone.annotations.Immutable;
import com.google.gson.*;
import com.rbacpro.deodar.model.DeodarParseResult;
import com.rbacpro.deodar.parser.generated.deodarLexer;
import com.rbacpro.deodar.parser.generated.deodarParser;
import org.antlr.v4.runtime.ANTLRErrorListener;
import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenStream;
import org.stringtemplate.v4.compiler.Compiler;

import java.util.logging.Logger;


/**
 * Modernized parser implementation for Deodar.
 *
 * <p>CEL Library Internals. Do Not Use. Consumers should use factories, such as {@link
 * DeodarParserFactory} instead to instantiate a parser.
 */
@Immutable
public final class DeodarParserImpl implements IDeodarParser {

    Logger logger = Logger.getLogger(DeodarParserImpl.class.getName());


    @Override
    public DeodarParseResult parse(String policy, String description) {
        Gson gson = new GsonBuilder().create();
        JsonElement el = null;
        try{
            // Try to convert policy into json
            el = JsonParser.parseString(policy);
            System.out.println("Policy is valid json and is version equal to v1? ");
        } catch(JsonSyntaxException e) {
            return new DeodarParseResult(null, true);
        }
        // This will remove space and newline from the original json
        CharStream in = CharStreams.fromString(gson.toJson(el));
        deodarLexer lexer = new deodarLexer(in);
        CommonTokenStream tokens = new CommonTokenStream(lexer);
        deodarParser t = new deodarParser(tokens);
        // Try to walk the parsed object, this will handle the syntax error.
        t.policy();
        // How to detect whether there are errors when parsing input tokens?
        System.out.println("Number of syntax errors in parser is "+ t.getNumberOfSyntaxErrors());
        if(t.getNumberOfSyntaxErrors()==0){
            System.out.println("Successfully parsing the input.");
            return new DeodarParseResult(t.policy(), false);
        } else {
            System.out.println("There are errors parsing input.");
            return new DeodarParseResult(null, true);
        }

    }

    /** Creates a new {@link Builder}. */
    public static Builder newBuilder() {
        return new Builder();
    }


    /** Builder for {@link DeodarParserImpl}. */
    public static final class Builder implements IDeodarParserBuilder {

        private Builder() {
        }

        @Override
        public IDeodarParser build() {
            return new DeodarParserImpl();
        }
    }

    private DeodarParserImpl() {

    }
}
