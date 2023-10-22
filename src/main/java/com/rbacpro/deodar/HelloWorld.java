package com.rbacpro.deodar;

import com.rbacpro.deodar.evaluator.DeodarEvaluatorFactory;
import com.rbacpro.deodar.parser.DeodarParserFactory;
import com.rbacpro.deodar.parser.generated.deodarParser;

public class HelloWorld {

    public static void main(String[] args){
        String policy = "{\"Version\":\"v1\",\"Statement\":[{\"principal\":\"*\",\"action\":\"bbb\",\"resource\":\"ccc\"}," +
                "{\"principal\":\"A \",\"action\":\"B\",\"resource\":\"C\"}, {\"principal\":\"ABc\",\"action\":\"B\",\"resource\":\"C\"}]}";
        deodarParser.PolicyContext pc = DeodarParserFactory.standardDeodarParserBuilder().build().parse(policy).getP();
        DeodarEvaluatorFactory.standardDeodarEvaluatorBuilder().build().evaluate(pc);
    }
}
