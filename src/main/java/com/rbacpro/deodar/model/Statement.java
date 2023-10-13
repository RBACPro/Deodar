package com.rbacpro.deodar.model;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Statement {

    private Principal principal;
    private Resource resource;
    private Action action;
}
