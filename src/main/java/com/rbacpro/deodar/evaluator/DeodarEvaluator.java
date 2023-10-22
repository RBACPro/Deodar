package com.rbacpro.deodar.evaluator;


import com.google.errorprone.annotations.Immutable;
import com.rbacpro.deodar.model.DeodarParseResult;

import java.util.Collections;
import java.util.Map;

@Immutable
public interface DeodarEvaluator {

    default DeodarParseResult evaluate(String policy) {
        return evaluate(policy, Collections.EMPTY_MAP);
    }

    DeodarParseResult evaluate(String policy, Map<String, ?> context);

}
