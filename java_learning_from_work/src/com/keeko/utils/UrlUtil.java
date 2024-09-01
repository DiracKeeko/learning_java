package com.keeko.utils;

import org.springframework.web.util.UriComponentsBuilder;

import java.net.URI;
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

    public static String getUrlWithJsonParams(String url, Map<String, Object> params) {
        UriComponentsBuilder builder = UriComponentsBuilder.fromHttpUrl(url);

        for (Map.Entry<String, Object> entry : params.entrySet()) {
            String value;
            if (entry.getValue() instanceof String || entry.getValue() instanceof Number || entry.getValue() instanceof Boolean) {
                value = entry.getValue().toString();
            } else {
                value = JacksonUtil.toJsonString(entry.getValue());
            }

            // Add the parameter to the URL
            builder.queryParam(entry.getKey(), value);
        }

        return builder.toUriString();
    }

    public static URI getUriTypeWithJsonParams(String url, String key, Map<String, String> params) {
        // 将参数对象转换为 JSON-like 字符串
        String jsonString = JacksonUtil.toJsonString(params);

        // 构建带有占位符的 URI
        URI finalUrl = UriComponentsBuilder.fromHttpUrl(url)
                .queryParam(key, "{json}")
                .buildAndExpand(jsonString)
                .toUri();

        return finalUrl;
    }
}