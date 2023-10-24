package com.rbacpro.deodar.evaluator;


import com.google.errorprone.annotations.CheckReturnValue;

/**
 * Interface for building an instance of CelParser
 */
public interface IDeodarEvaluatorBuilder {


    /**
     * Build a new instance of the {@code CelParser}.
     */
    @CheckReturnValue
    IDeodarEvaluator build();
}