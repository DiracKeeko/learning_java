package com.keeko;

import com.keeko.entity.User;
import com.keeko.utils.JacksonUtil;

import java.util.HashMap;
import java.util.Map;

public class ParseToDTO {
    public static void main(String[] args) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("id", 1);
        userMap.put("name", "Mike");

        String jsonString = "{\"id\": 1, \"name\": \"Mike\"}";
        // cn.hutool.json
        // User userItem = JSONUtil.toBean(userMap, User.class);
        // User userItem2 = JSONUtil.toBean(jsonString, User.class);

        // JacksonUtil 实现字符串解析为 实体类
        // User userItem = JacksonUtil.parseObject(userMap, User.class);
        User userItem2 = JacksonUtil.parseObject(jsonString, User.class);

        // 输出 UserDTO 内容
        System.out.println("UserDTO ID: " + userItem2.getId()); // 1
        System.out.println("UserDTO Name: " + userItem2.getName()); // Mike
    }
}
