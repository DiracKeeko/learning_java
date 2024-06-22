package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 遍历 JSONObject
public class FastjsonCase07JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\",\"age\":30}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 遍历 JSONObject
        for (String key : jsonObject.keySet()) {
            Object value = jsonObject.get(key);
            System.out.println(key + ": " + value);
        }

        // 输出:
        // id: 1
        // name: John Doe
        // age: 30
    }
}
