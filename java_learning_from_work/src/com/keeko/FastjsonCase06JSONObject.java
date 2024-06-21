package com.keeko;


import com.alibaba.fastjson.JSONObject;
import com.keeko.entity.User;

// 操作嵌套的 JSONObject
public class FastjsonCase06JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\",\"address\":{\"city\":\"New York\",\"zipcode\":\"10001\"}}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取嵌套的 JSONObject
        JSONObject addressObject = jsonObject.getJSONObject("address");

        // 获取嵌套 JSONObject 的值
        String city = addressObject.getString("city");
        String zipcode = addressObject.getString("zipcode");

        // 输出嵌套对象的值
        System.out.println("city: " + city); // 输出: city: New York
        System.out.println("zipcode: " + zipcode); // 输出: zipcode: 10001
    }
}
