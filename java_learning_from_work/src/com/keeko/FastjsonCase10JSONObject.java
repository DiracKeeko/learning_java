package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 从JSONObject中获取基本类型数据 string, boolean, short, byte
public class FastjsonCase10JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"isActive\":true}";
        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取 boolean 类型数据
        boolean isActive = jsonObject.getBooleanValue("isActive");
        // 输出 boolean 数据
        System.out.println("isActive: " + isActive); // 输出: isActive: true


        String jsonString1 = "{\"name\":\"John Doe\",\"city\":\"New York\"}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject1 = JSONObject.parseObject(jsonString1);

        // 获取 String 类型数据
        String name = jsonObject1.getString("name");
        String city = jsonObject1.getString("city");
        String city1 = jsonObject1.getString("city1"); // 没有key 就是null

        // 输出 String 数据
        System.out.println("name: " + name); // 输出: name: John Doe
        System.out.println("city: " + city); // 输出: city: New York
        System.out.println("city1: " + city1); // 输出: city1: null


        String jsonString2 = "{\"shortValue\":123,\"byteValue\":45}";
        JSONObject jsonObject2 = JSONObject.parseObject(jsonString2);

        // 获取 short 类型数据
        short shortValue = jsonObject2.getShortValue("shortValue");

        // 获取 byte 类型数据
        byte byteValue = jsonObject2.getByteValue("byteValue");

        // 输出 short 和 byte 数据
        System.out.println("shortValue: " + shortValue); // 输出: shortValue: 123
        System.out.println("byteValue: " + byteValue); // 输出: byteValue: 45
    }
}
