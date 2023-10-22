package com.rbacpro.deodar.model;

import com.google.errorprone.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Immutable
@Data
@AllArgsConstructor
@NoArgsConstructor
public final class DeodarParseResult {

    private Policy p;
}
