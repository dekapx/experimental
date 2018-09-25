package com.kapx.java.common.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Builder
@Getter
@AllArgsConstructor
public class Person {
    private String firstName;
    private String lastName;
}
