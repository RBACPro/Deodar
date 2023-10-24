package com.rbacpro.deodar;

import com.google.common.io.Resources;
import com.rbacpro.deodar.evaluator.DeodarEvaluatorFactory;
import com.rbacpro.deodar.model.DeodarParseResult;
import com.rbacpro.deodar.parser.DeodarParserFactory;

import java.io.IOException;
import java.nio.charset.Charset;

public class TestApp {

    public static void main(String[] args) throws IOException {

        /**
         * Run on good policies
         */

        String policy = Resources.toString(Resources.getResource("good/test_policy.json"), Charset.defaultCharset());

        DeodarParseResult res = DeodarParserFactory.standardDeodarParserBuilder().build().parse(policy);
        if (res.isHasError()) {
            System.out.println("Encounter errors parsing input.");
        }
        DeodarEvaluatorFactory.standardDeodarEvaluatorBuilder().build().evaluate(res.getPolicy());

        /**
         * Run on bad policies
         */

    }
}
