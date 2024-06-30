package com.keeko;

import com.keeko.entity.FundItemDo;
import java.util.*;
import java.util.stream.Collectors;

public class Collectors2MapCase {
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

    public static Map<String, FundItemDo> getMapMayError(List<FundItemDo> fundList) {
        return fundList.stream().collect(Collectors.toMap(FundItemDo::getId, item -> item));
    }

    public static Map<String, FundItemDo> getMap(List<FundItemDo> fundList) {
        return fundList.stream().collect(Collectors.toMap(FundItemDo::getId, item -> item, (oldValue, newValue) -> oldValue));
    }
}
