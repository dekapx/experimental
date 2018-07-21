package com.kapx.java.quickstart;

public class Test {
    private static final String REGEX = "^(https?|ftp|file)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    public static void main(String[] args) {
        final String url = "http://localhost:9090/api/ping";
        System.out.println(isValidUrl(url));
    }

    private static boolean isValidUrl(final String url) {
        return ((url != null && !url.isEmpty()) && (url.matches(REGEX)));
    }
}

