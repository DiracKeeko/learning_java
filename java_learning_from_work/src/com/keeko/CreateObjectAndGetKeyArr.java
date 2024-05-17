package com.keeko;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
import java.util.StringJoiner;

public class CreateObjectAndGetKeyArr {
    // 使用 Java 9+ 的 Map.of() 方法来一次性创建并初始化 Map
    /*private static final Map<String, String> indexObj = Map.of(
            "000001.SS", "上证指数",
            "000300.SS", "沪深300",
            "000905.SS", "中证500",
            "399001.SZ", "深证成指",
            "399006.SZ", "创业板指"
    );*/

    private static Map<String, String> createIndexMap() {
        Map<String, String> map = new HashMap<>();
        map.put("000001.SS", "上证指数");
        map.put("000300.SS", "沪深300");
        map.put("000905.SS", "中证500");
        map.put("399001.SZ", "深证成指");
        map.put("399006.SZ", "创业板指");
        return map;
    }

    // 使用静态初始化块来一次性创建并初始化 HashMap
    private static final Map<String, String> indexMap = createIndexMap();

    public static void main(String[] args) {
        Set<String> keySet = indexMap.keySet();

        // 创建一个 StringJoiner 用于拼接字符串
        StringJoiner joiner = new StringJoiner(",");

        // 将键加入 StringJoiner
        for (String key : keySet) {
            joiner.add(key);
        }

        // 获取拼接后的字符串
        String indexString = joiner.toString();

        // 输出结果
        System.out.println("indexString-> " + indexString);
    }
}
