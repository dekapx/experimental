package com.kapx.java.datastructures.sort;

import java.util.Arrays;
import java.util.function.Consumer;

public class InsertionSort {
    public static void main(String[] args) {
        final int[] elements = {8, 3, 4, 6, 1, 7, 5, 2, 9, 11, 12};
        sort(elements);
    }

    private static void sort(final int[] elements) {
        print(elements);

        for (int i = 0; i < elements.length - 1; i ++) {
        }
        print(elements);
    }

    private static void print(final int[] elements) {
        Arrays.stream(elements).forEach(i -> printConsumer.accept(i));
        System.out.println("");
    }

    private static Consumer<Integer> printConsumer = (element) -> {
        System.out.print(element + " ");
    };
}
