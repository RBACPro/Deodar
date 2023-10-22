package com.rbacpro.deodar.model;

import com.google.errorprone.annotations.Immutable;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Immutable
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Policy {
    private List<Statement> statements;
}
