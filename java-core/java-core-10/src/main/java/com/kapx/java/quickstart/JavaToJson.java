package com.kapx.java.quickstart;

import org.json.JSONObject;

public class JavaToJson {
    public static void main(String[] args) {
        UrlShortenerRequestDto dto = new UrlShortenerRequestDto();
        dto.setOriginalUrl("http://localhost:9090/api/ping");
        JSONObject jsonObject = new JSONObject(dto);
        System.out.println(jsonObject.toString());
    }
}
