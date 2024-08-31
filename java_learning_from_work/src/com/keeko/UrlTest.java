package com.keeko;

import com.keeko.entity.User;
import com.keeko.utils.UrlUtil;

import java.util.HashMap;
import java.util.Map;

public class UrlTest {
    public static void main(String[] args) {
        Map<String, String> addressMap = new HashMap<>();
        addressMap.put("city", "hz");
        addressMap.put("street", "changHe");
        String url = "map.google.com";
        String addressUrl = UrlUtil.getUrlWithParams(url, addressMap);
        System.out.println(addressUrl);

        // User Mike = new User(12, "Mike");
        // System.out.println(urlWithQuery); // www.google.com?params={id:12,name:Mike}
    }
}
