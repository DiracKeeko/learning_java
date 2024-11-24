package com.keeko;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class HandleNullCase03Stream {
    public static void main(String[] args) {
        System.out.println(filterNulls()); // [a, b, c]
        System.out.println(fillNulls()); // [a, default, b, default, c]
    }

    // 1. 使用 filter + Objects::nonNull 过滤null值
    public static List<String> filterNulls() {
        List<String> list = Arrays.asList("a", null, "b", null, "c");
        List<String> nonNullList = list.stream()
                .filter(Objects::nonNull)
                .collect(Collectors.toList());
        return nonNullList;
    }

    // 2. 使用 Optional 处理可能为null的映射结果
    public static List<String> fillNulls() {
        List<String> list = Arrays.asList("a", null, "b", null, "c");
        List<String> nonNullList = list.stream()
                .map(item -> Optional.ofNullable(item).orElse("default"))
                .collect(Collectors.toList());
        /*
        // 等价于这个
        List<String> resultList2 = list.stream()
            .map(item -> item == null ? "default" : item)
            .collect(Collectors.toList());
        */
        return nonNullList;
    }
}
