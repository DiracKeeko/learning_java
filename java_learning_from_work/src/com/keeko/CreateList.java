package com.keeko;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

// 创建List的方式
public class CreateList {
    public static void main(String[] args) {
        // 两个常用方法
        List<String> oneIdList = Collections.singletonList("1");

        List<String> idList = Arrays.asList("1", "2", "3");

        // 其他方式
        List<String> idList2 = Stream.of("5", "6", "7").collect(Collectors.toList());

        List<String> idList3 = new ArrayList<>();
        idList3.add("7");
        idList3.add("8");
        idList3.add("9");

        // 分别打印
        System.out.println(oneIdList);
        System.out.println(idList);
        System.out.println(idList2);
        System.out.println(idList3);

    }
}
