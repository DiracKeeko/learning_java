package com.keeko;

import java.util.Arrays;
import java.util.List;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("↓basic for loop↓");
        for (int i = 0; i < 3; i++) {
            System.out.println(i);
        }

        System.out.println("↓for loop to arr↓");
        // 增强的 for 循环 (for-each 循环)
        // 这种 for 循环常用于遍历 数组 或 集合。
        int[] array = {1, 2, 3};
        for (int number : array) {
            System.out.println("arr[i] " + number);
        }

        List<String> list = Arrays.asList("a", "b", "c");
        for (String str: list) {
            System.out.println("list item -> " + str);
        }

        // 基于索引的for循环
        String[] names = {"Alice", "Bob", "Charlie"};
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }

        // java8 forEach
        list.forEach(str -> System.out.println(str));
    }
}
