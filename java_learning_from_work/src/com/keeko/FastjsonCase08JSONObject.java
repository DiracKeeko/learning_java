package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 合并两个 JSONObject
public class FastjsonCase08JSONObject {
    public static void main(String[] args) {
        // 创建第一个 JSONObject
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id", 1);
        jsonObject1.put("name", "John Doe");

        // 创建第二个 JSONObject
        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("age", 30);
        jsonObject2.put("city", "New York");

        // 合并两个 JSONObject
        jsonObject1.putAll(jsonObject2);

        // 输出合并后的 JSONObject
        System.out.println(jsonObject1.toString());
        // 输出: {"id":1,"name":"John Doe","age":30,"city":"New York"}
    }
}
