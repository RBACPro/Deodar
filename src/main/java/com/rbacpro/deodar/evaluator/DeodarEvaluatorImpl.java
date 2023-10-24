package com.rbacpro.deodar.evaluator;

import com.rbacpro.deodar.model.DeodarEvaluateResult;
import com.rbacpro.deodar.parser.DeodarParserImpl;
import com.rbacpro.deodar.parser.generated.deodarParser;

import java.util.Map;

public class DeodarEvaluatorImpl implements IDeodarEvaluator {

    private DeodarEvaluatorImpl() {

    }

    /**
     * Creates a new {@link DeodarParserImpl.Builder}.
     */
    public static DeodarEvaluatorImpl.Builder newBuilder() {
        return new DeodarEvaluatorImpl.Builder();
    }

    @Override
    public DeodarEvaluateResult evaluate(deodarParser.PolicyContext policy, Map<String, ?> context) {
        return DeodarEvaluateResult.builder().allowed(false).build();
    }

    /**
     * Builder for {@link DeodarParserImpl}.
     */
    public static final class Builder implements IDeodarEvaluatorBuilder {

        private Builder() {
        }

        @Override
        public IDeodarEvaluator build() {
            return new DeodarEvaluatorImpl();
        }
    }
}
