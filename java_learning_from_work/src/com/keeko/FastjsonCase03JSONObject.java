package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 创建空 JSONObject 并添加数据
public class FastjsonCase03JSONObject {
    public static void main(String[] args) {
        // 创建一个新的 JSONObject
        JSONObject jsonObject = new JSONObject();

        // 添加键值对
        jsonObject.put("id", 1);
        jsonObject.put("name", "John Doe");

        // 输出 JSONObject
        System.out.println(jsonObject.toString()); // 输出: {"id":1,"name":"John Doe"}
    }
}
