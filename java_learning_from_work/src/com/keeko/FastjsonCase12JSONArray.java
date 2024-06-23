package com.keeko;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

// 从字符串解析为 JSONArray
public class FastjsonCase12JSONArray {
    public static void main(String[] args) {
        String jsonString = "[{\"id\":1,\"name\":\"John Doe\"},{\"id\":2,\"name\":\"Jane Doe\"}]";

        // 从字符串解析为 JSONArray
        JSONArray jsonArray = JSONArray.parseArray(jsonString);

        // 遍历 JSONArray
        for (int i = 0; i < jsonArray.size(); i++) {
            JSONObject jsonObject = jsonArray.getJSONObject(i); // 从JSONArray里获取JSONObject
            int id = jsonObject.getInteger("id");
            String name = jsonObject.getString("name");
            System.out.println("id: " + id + ", name: " + name);
        }
        // 输出:
        // id: 1, name: John Doe
        // id: 2, name: Jane Doe
    }
}
