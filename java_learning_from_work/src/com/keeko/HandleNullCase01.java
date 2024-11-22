package com.keeko;

import java.util.*;

public class HandleNullCase01 {
    public static void main(String[] args) {

        // Map中如果取值可能为空，可以用 map.getOrDefault() 来处理
        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("key1", "value1");
        stringMap.put("key2", "value2");

        // 查找存在的键
        String value1 = stringMap.getOrDefault("key1", "default");
        System.out.println(value1); // 输出: value1

        // 查找不存在的键
        String value2 = stringMap.getOrDefault("key3", "default");
        System.out.println(value2); // 输出: default


        Map<String, List<String>> map = new HashMap<>();

        // 初始化 Map 数据
        map.put("fruits", Arrays.asList("apple", "banana", "cherry"));
        map.put("vegetables", Arrays.asList("carrot", "potato", "cucumber"));

        // 使用 getOrDefault 获取值（键存在）
        List<String> fruits = map.getOrDefault("fruits", new ArrayList<>());
        System.out.println("Fruits: " + fruits); // 输出: Fruits: [apple, banana, cherry]

        // 使用 getOrDefault 获取值（键不存在）
        List<String> grains = map.getOrDefault("grains", new ArrayList<>());
        System.out.println("Grains: " + grains); // 输出: Grains: []

        // 使用 getOrDefault 获取值（键不存在）
        List<String> grains1 = map.getOrDefault("grains1", Collections.emptyList());
        System.out.println("Grains1: " + grains); // 输出: Grains1: []

        /*
            总结:
                1. map.get("key") 如果可能为null, 就要考虑 使用 map.getOrDefault("key", defaultValue);
                2. 空list 可以用 new ArrayList<>() 或者 Collections.emptyList() 来创建
        */
    }
}
