package com.rbacpro.deodar.parser;

import com.google.errorprone.annotations.Immutable;
import com.rbacpro.deodar.model.DeodarParseResult;

/**
 * Public interface for the parsing Deodar expressions.
 */
@Immutable
public interface IDeodarParser {

    /**
     * Parse the input {@code policy} and return a {@code DeodarParseResult}.
     *
     * <p>Parse validates the syntax of a policy.
     */
    default DeodarParseResult parse(String policy) {
        return parse(policy, "<input>");
    }

    /**
     * Parse the input {@code policy} and return a {@code DeodarParseResult}.
     *
     * <p>The {@code description} may be used to help tailor error messages for the location where the
     * {@code policy} originates, e.g. a file name or form UI element.
     *
     * <p>Parse validates the syntax of a policy.
     */
    DeodarParseResult parse(String policy, String description);

}
