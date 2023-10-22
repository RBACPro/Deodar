package com.rbacpro.deodar.evaluator;


/** Factory class for producing {@link IDeodarEvaluator} instances and builders. */
public class DeodarEvaluatorFactory {
    /**
     * Configure a builder to construct a current {@code DeodarEvaluator} instance.
     */
    public static IDeodarEvaluatorBuilder standardDeodarEvaluatorBuilder() {
        return DeodarEvaluatorImpl.newBuilder();
    }

    private DeodarEvaluatorFactory() {}
}
