package com.keeko;


import com.alibaba.fastjson.JSONObject;
import com.keeko.entity.User;

//  将 JSONObject 转换为 Java 对象
public class FastjsonCase05JSONObject {
    public static void main(String[] args) {
        String jsonString = "{\"id\":1,\"name\":\"John Doe\"}";

        // 从字符串解析为 JSONObject
        JSONObject jsonObject = JSONObject.parseObject(jsonString);

        // 将 JSONObject 转换为 Java 对象
        User user = jsonObject.toJavaObject(User.class);

        // 输出 Java 对象的属性
        System.out.println("id: " + user.getId()); // 输出: id: 1
        System.out.println("name: " + user.getName()); // 输出: name: John Doe
    }
}
