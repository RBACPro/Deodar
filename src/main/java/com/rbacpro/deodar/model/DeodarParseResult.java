package com.rbacpro.deodar.model;

import com.google.errorprone.annotations.Immutable;
import com.rbacpro.deodar.parser.generated.deodarParser;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Immutable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class DeodarParseResult {

    private deodarParser.PolicyContext policy;
    private boolean hasError;
}
