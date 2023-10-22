package com.rbacpro.deodar.evaluator;

import com.rbacpro.deodar.model.DeodarEvaluateResult;
import com.rbacpro.deodar.model.DeodarParseResult;
import com.rbacpro.deodar.parser.DeodarParserImpl;
import com.rbacpro.deodar.parser.generated.deodarParser;

import java.util.Map;

public class DeodarEvaluatorImpl implements IDeodarEvaluator {

    @Override
    public DeodarEvaluateResult evaluate(deodarParser.PolicyContext policy, Map<String, ?> context) {
        return DeodarEvaluateResult.builder().allowed(false).build();
    }


    /** Creates a new {@link DeodarParserImpl.Builder}. */
    public static DeodarEvaluatorImpl.Builder newBuilder() {
        return new DeodarEvaluatorImpl.Builder();
    }

    /** Builder for {@link DeodarParserImpl}. */
    public static final class Builder implements IDeodarEvaluatorBuilder {

        private Builder() {
        }

        @Override
        public IDeodarEvaluator build() {
            return new DeodarEvaluatorImpl();
        }
    }

    private DeodarEvaluatorImpl() {

    }
}
