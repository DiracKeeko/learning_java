package com.keeko;

import com.keeko.entity.FundItemDo;
import java.util.*;
import java.util.stream.Collectors;

public class CollectorsToMapCase2 {
    public static void main(String[] args) {
        List<FundItemDo> fundList = Arrays.asList(
                new FundItemDo("1", "Fund A"),
                new FundItemDo("2", "Fund B"),
                new FundItemDo("1", "Fund C") // Duplicate id
        );

        try {
            Map<String, FundItemDo> mapMayError = getMapMayError(fundList);
            System.out.println("getMapMayError: " + mapMayError);
        } catch (IllegalStateException e) {
            System.out.println("getMapMayError: Exception - " + e.getMessage());
        }

        Map<String, FundItemDo> map = getMap(fundList);
        System.out.println("getMap: " + map);
    }

    /*
    *   总结: Case1 + Case2
    *      1. 使用Collectors.toMap()的时候 需要先filter，对key和value都进行null的过滤操作
    *      2. 其次，在toMap()的第三个参数位置，要写 (old, new) -> old 函数，处理重复的key
    * */
    public static Map<String, FundItemDo> getMapMayError(List<FundItemDo> fundList) {
        return fundList.stream().collect(Collectors.toMap(FundItemDo::getId, item -> item));
    }

    public static Map<String, FundItemDo> getMap(List<FundItemDo> fundList) {
        return fundList.stream().collect(Collectors.toMap(FundItemDo::getId, item -> item, (oldValue, newValue) -> oldValue));
    }
}
