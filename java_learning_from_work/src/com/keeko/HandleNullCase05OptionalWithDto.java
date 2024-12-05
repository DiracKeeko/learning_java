package com.keeko;

import com.keeko.entity.User;

import java.util.Optional;

public class HandleNullCase05OptionalWithDto {
    public static void main(String[] args) {
        User user1 = new User(1, "Tom");
        User user2 = new User();
        user2.setId(2);

        // DTO 实体类没有 Map.getOrDefault()方法，只能用Optional
        // stringMap.getOrDefault("key3", "default");


        String name1 = Optional.ofNullable(user1.getName()).orElse("defaultName");
        System.out.println("name1 " + name1); // name1 Tom
        String name2 = Optional.ofNullable(user2.getName()).orElse("defaultName");
        System.out.println("name2 " + name2); // name2 defaultName

    }

}
