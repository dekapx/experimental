package com.kapx.java.quickstart;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class JoinArrayElements {
    public static void main(String[] args) {
        var languages = List.of("Java", "Scala", "Kotlin");
        var output = toCommaSeparatedValues.apply(languages);
        System.out.println(output);
    }

    /**
     * Accept List and convert to command separated String
     */
    private static Function<List<String>, String> toCommaSeparatedValues = (elements) ->
            elements.stream()
                    .collect(Collectors.joining(","));

}
