package com.keeko;


import com.alibaba.fastjson.JSONObject;

// 从JSONObject中获取基本类型数据 int, long, float, double
public class FastjsonCase09JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"age\":25}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 获取 int 类型数据
        int id = jsonObject.getIntValue("id");
        // 获取 long 类型数据
        long age = jsonObject.getLongValue("age");

        System.out.println("id: " + id); // 输出: id: 1
        System.out.println("age: " + age); // 输出: age: 25


        String jsonString1 = "{\"price\":19.5,\"discount\":0.85}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject1 = JSONObject.parseObject(jsonString1);

        // 获取 float 类型数据
        double price = jsonObject1.getFloatValue("price");
        // 获取 double 类型数据
        double discount = jsonObject1.getDoubleValue("discount");

        System.out.println("price: " + price); // 输出: price: 19.5
        System.out.println("discount: " + discount); // 输出: discount: 0.85


    }
}
