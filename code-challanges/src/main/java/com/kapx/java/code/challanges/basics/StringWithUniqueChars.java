package com.kapx.java.code.challanges.basics;

public class StringWithUniqueChars {
    public static void main(String[] args) {
        final String str = "KapilK";
        System.out.println(isUniqueChars(str));
    }

    private static boolean isUniqueChars(String str) {
        if (str.length() > 128) return false;

        boolean[] char_set = new boolean[128];
        for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if (char_set[val]) {//Already found this char in string
                return false;
            }
            char_set[val] = true;
        }
        return true;
    }
}
