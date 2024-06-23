package com.keeko;


import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;

// 创建 JSONArray 并添加数据
public class FastjsonCase11JSONArray {
    public static void main(String[] args) {
        // 创建一个新的 JSONArray
        JSONArray jsonArray = new JSONArray();

        // 添加 JSON 对象
        JSONObject jsonObject1 = new JSONObject();
        jsonObject1.put("id", 1);
        jsonObject1.put("name", "John Doe");

        JSONObject jsonObject2 = new JSONObject();
        jsonObject2.put("id", 2);
        jsonObject2.put("name", "Jane Doe");

        jsonArray.add(jsonObject1);
        jsonArray.add(jsonObject2);

        // 输出 JSONArray
        System.out.println(jsonArray.toString()); // 输出: [{"id":1,"name":"John Doe"},{"id":2,"name":"Jane Doe"}]
    }
}
