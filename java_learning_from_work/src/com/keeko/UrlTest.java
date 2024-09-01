package com.keeko;

import com.keeko.entity.User;
import com.keeko.utils.UrlUtil;

import java.net.URI;
import java.util.HashMap;
import java.util.Map;

public class UrlTest {
    public static void main(String[] args) {
        String url = "http://map.google.com";
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("city", "hz");
        addressMap.put("street", "changHe");
        String addressUrl = UrlUtil.getUrlWithParams(url, addressMap);
        System.out.println(addressUrl); // http://map.google.com?city=hz&street=changHe

        User Mike = new User(12, "Mike");
        Map<String, Object> jsonQuery = new HashMap<>();
        jsonQuery.put("params", Mike);
        String urlWithQuery = UrlUtil.getUrlWithJsonParams(url, jsonQuery);
        System.out.println(urlWithQuery); // http://map.google.com?params=%7B%22id%22:12,%22name%22:%22Mike%22%7D
        // www.google.com?params={id:12,name:Mike} 上面一行的输出是encode之后的结果

        Map<String, String> UserInfo = new HashMap<>();
        UserInfo.put("id", "12");
        UserInfo.put("name", "Mike");
        URI finalUrl = UrlUtil.getUriTypeWithJsonParams(url, "params", UserInfo);
        System.out.println(finalUrl);
        // http://map.google.com?params=%7B%22name%22:%22Mike%22,%22id%22:%2212%22%7D
    }
}
