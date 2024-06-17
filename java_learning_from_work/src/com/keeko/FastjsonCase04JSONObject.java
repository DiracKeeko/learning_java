package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 从字符串解析为 JSONObject
public class FastjsonCase04JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\"}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取值
        int id = jsonObject.getInteger("id");
        String name = jsonObject.getString("name");

        // 输出解析的值
        System.out.println("id: " + id); // 输出: id: 1
        System.out.println("name: " + name); // 输出: name: John Doe
    }
}
