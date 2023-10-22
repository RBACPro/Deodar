package com.rbacpro.deodar.evaluator;


import com.google.errorprone.annotations.Immutable;
import com.rbacpro.deodar.model.DeodarEvaluateResult;
import com.rbacpro.deodar.parser.generated.deodarParser;

import java.util.Collections;
import java.util.Map;

@Immutable
public interface IDeodarEvaluator {

    default DeodarEvaluateResult evaluate(deodarParser.PolicyContext policy) {
        return evaluate(policy, Collections.EMPTY_MAP);
    }

    DeodarEvaluateResult evaluate(deodarParser.PolicyContext policy, Map<String, ?> context);

}
