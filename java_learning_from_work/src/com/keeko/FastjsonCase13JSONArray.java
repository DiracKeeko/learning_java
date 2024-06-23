package com.keeko;


import com.alibaba.fastjson.JSONArray;
import com.keeko.entity.User;

import java.util.List;

// 将 JSONArray 转换为 Java 对象列表
public class FastjsonCase13JSONArray {
    public static void main(String[] args) {
        String jsonString = "[{\"id\":1,\"name\":\"John Doe\"},{\"id\":2,\"name\":\"Jane Doe\"}]";

        // 从字符串解析为 JSONArray
        JSONArray jsonArray = JSONArray.parseArray(jsonString);

        // 将 JSONArray 转换为 Java 对象列表
        List<User> userList = jsonArray.toJavaList(User.class);

        // 输出 Java 对象列表的属性
        for (User user : userList) {
            System.out.println("id: " + user.getId() + ", name: " + user.getName());
        }
        // 输出:
        // id: 1, name: John Doe
        // id: 2, name: Jane Doe
    }
}
