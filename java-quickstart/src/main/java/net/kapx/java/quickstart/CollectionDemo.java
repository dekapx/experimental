package net.kapx.java.quickstart;

import java.util.Arrays;
import java.util.List;

public class CollectionDemo {
    public static void main(String[] args) {
        final List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5);
        for (Integer number : numbers) {
            System.out.println(number);
        }
    }
}
