package com.kapx.java.functions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class StringArrayToListFunction {
    public static void main(String[] args) {
        final String[] elements = {"Java", "Scala", "Kotlin"};

        var list = toList.apply(elements);
        System.out.println(list);
    }

    private static Function<String[], List<String>> toList = (elements) -> {
        var list = new ArrayList<>();
        Arrays.stream(elements).forEach(list::add);
        return list;
    };

}
