package com.rbacpro.deodar.parser;

/**
 * Factory class for producing {@link IDeodarParser} instances and builders.
 */
public class DeodarParserFactory {
    private DeodarParserFactory() {
    }

    /**
     * Configure a builder to construct a current {@code DeodarParser} instance.
     */
    public static IDeodarParserBuilder standardDeodarParserBuilder() {
        return DeodarParserImpl.newBuilder();
    }
}
