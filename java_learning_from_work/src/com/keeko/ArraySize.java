package com.keeko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ArraySize {
    public static void main(String[] args) {
        // List<String> idList = new ArrayList<>();
        List<String> idList = Arrays.asList("1", "2", "3");
        int s1 = idList.size();
        System.out.println(s1);
        /*
        idList = null;
        int s2 = idList.size(); // 会报错
        System.out.println(s2);
        */

        // 创建一个空的字符串数组
        String[] emptyStringArray = new String[0];

        // 创建一个空的整数数组
        int[] emptyIntArray = new int[0];

        // 创建一个空的对象数组
        Object[] emptyObjectArray = new Object[0];

    }
}
