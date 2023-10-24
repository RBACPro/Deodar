package com.rbacpro.deodar.parser;


import com.google.errorprone.annotations.CheckReturnValue;

/**
 * Interface for building an instance of CelParser
 */
public interface IDeodarParserBuilder {


    /**
     * Build a new instance of the {@code CelParser}.
     */
    @CheckReturnValue
    IDeodarParser build();
}