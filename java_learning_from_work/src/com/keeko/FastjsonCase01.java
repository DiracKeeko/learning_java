package com.keeko;


import com.alibaba.fastjson.JSON;
import com.keeko.entity.User;

// 1. 将 Java 对象序列化为 JSON 字符串
public class FastjsonCase01 {
    public static void main(String[] args) {
        User user = new User();
        user.setId(1);
        user.setName("John Doe");

        String jsonString = JSON.toJSONString(user);
        System.out.println(jsonString); // 输出: {"id":1,"name":"John Doe"}
    }
}
