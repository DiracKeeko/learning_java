package com.keeko;


import com.alibaba.fastjson.JSON;
import com.keeko.entity.User;

// 2. 将 JSON 字符串反序列化为 Java 对象
public class FastjsonCase02 {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\"}";

        User user = JSON.parseObject(jsonString, User.class);
        System.out.println(user.getName()); // 输出: John Doe
    }
}
