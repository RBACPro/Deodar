package com.rbacpro.deodar.model;

import com.google.errorprone.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Immutable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public final class DeodarEvaluateResult {

    private boolean allowed;
}
