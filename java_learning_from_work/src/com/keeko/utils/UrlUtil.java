package com.keeko.utils;

import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class UrlUtil {
    public static String getUrlWithParams(String url, Map<String, String> params) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            builder.queryParam(entry.getKey(), entry.getValue());
        }

        String urlWithParams = builder.toUriString();

        return urlWithParams;
    }

}