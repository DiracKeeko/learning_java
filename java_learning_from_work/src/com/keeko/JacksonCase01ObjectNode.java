package com.keeko;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.node.ObjectNode;
import com.keeko.utils.JacksonUtil;

public class JacksonCase01ObjectNode {
    public static void main(String[] args) {
        ObjectNode obj = JacksonUtil.createObjectNode();
        obj.put("a", "a");
        obj.put("b", 2);
        System.out.println(obj);

        String a = obj.get("a").asText();
        int b = obj.get("b").asInt();
        // JsonNode c = obj.get("c"); // 不报错
        // String c = obj.get("c").asText(); // 报错

        String c = obj.has("c") ? obj.get("c").asText() : null;

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
