package com.kapx.java.functions;

import java.util.function.Function;

public class FunctionAndThanDemo {

    public static void main(String[] args) {
        System.out.println(sayHello.andThen(toUpperCase).apply("DeKapx"));
    }

    private static Function<String, String> sayHello = (arg) -> "Hello ! " + arg;

    private static Function<String, String> toUpperCase = (arg) -> arg.toUpperCase();
}
