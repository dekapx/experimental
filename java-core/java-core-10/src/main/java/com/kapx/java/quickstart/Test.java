package com.kapx.java.quickstart;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Test {
    public static void main(String[] args) {
        final Stream<String> languages = Stream.of("Java", "Scala", "Kotlin", "Python", "Closure");

        languages.forEach(toUpperCase.andThen(printLength));
    }

    private static Consumer<String> toUpperCase = (language) -> System.out.print(language.toUpperCase());

    private static Consumer<String> printLength = (language) -> System.out.println(" - " + language.length());
}

