package com.kapx.java.quickstart;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JoinArrayElements {
    public static void main(String[] args) {
        final String[] languages = {"Java", "Scala", "Kotlin"};
        var output = arrayAsCommaSeperatedString(languages);
        System.out.println(output);
    }

    private static String arrayAsCommaSeperatedString(final String[] elements) {
        return Arrays
                .stream(elements)
                .collect(Collectors.joining(","));
    }
}
