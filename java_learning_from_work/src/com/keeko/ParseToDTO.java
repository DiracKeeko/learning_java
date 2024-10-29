package com.keeko;

import com.keeko.entity.User;

import java.util.HashMap;
import java.util.Map;

public class ParseToDTO {
    public static void main(String[] args) {
        Map<String, Object> userMap = new HashMap<>();
        userMap.put("id", 1);
        userMap.put("name", "Mike");

        String jsonString = "{\"id\": 1, \"name\": \"Mike\"}";
        // cn.hutool.json
        // User userItem = JSONUtil.toBean(userMap, UserDTO.class);
        // User userItem2 = JSONUtil.toBean(jsonString, UserDTO.class);

        // 输出 UserDTO 内容
        System.out.println("UserDTO ID: " + userItem.getId());
        System.out.println("UserDTO Name: " + userItem.getName());
    }
}
