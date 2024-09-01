package com.keeko.utils;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.web.util.UriComponentsBuilder;

import java.util.Map;

public class UrlUtil {
    private static final ObjectMapper OBJECT_MAPPER = new ObjectMapper();

    public static String getUrlWithParams(String url, Map<String, String> params) {

        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);
        for (Map.Entry<String, String> entry : params.entrySet()) {
            builder.queryParam(entry.getKey(), entry.getValue());
        }

        String urlWithParams = builder.toUriString();

        return urlWithParams;
    }

    public static String getUrlWithJsonParams(String url, Map<String, Object> params) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String value;
            try {
                // Convert the object to a JSON-like string if it's not a primitive or String
                if (entry.getValue() instanceof String || entry.getValue() instanceof Number || entry.getValue() instanceof Boolean) {
                    value = entry.getValue().toString();
                } else {
                    value = OBJECT_MAPPER.writeValueAsString(entry.getValue());
                }
            } catch (JsonProcessingException e) {
                throw new RuntimeException("Failed to serialize parameter: " + entry.getKey(), e);
            }

            // Add the parameter to the URL
            builder.queryParam(entry.getKey(), value);
        }

        return builder.toUriString();
    }
}