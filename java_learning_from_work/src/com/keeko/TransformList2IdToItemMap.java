package com.keeko;

import com.keeko.entity.FundItemDo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransformList2IdToItemMap {
    public static void main(String[] args) {
        List<FundItemDo> fundList = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            FundItemDo fundItemDo = new FundItemDo();
            fundItemDo.setId(String.valueOf(i));
            fundItemDo.setName("基金" + i);
            fundItemDo.setM1Return(new BigDecimal(i));
            fundList.add(fundItemDo);
        }

        Map<String, FundItemDo> idToItemMap = getMap(fundList);
        System.out.println(idToItemMap);
    }

    /*
    * 如果 fundList 中有两个或多个 FundItemDo 对象具有相同的 id，这个方法会抛出 IllegalStateException，
    * 因为默认的 toMap 收集器不允许键冲突。
    * */
    public static Map<String, FundItemDo> getMapMayError(List<FundItemDo> fundList) {
        Map<String, FundItemDo> res = fundList.stream().collect(Collectors.toMap(FundItemDo::getId,
                item -> item));
        return res;
    }

    public static Map<String, FundItemDo> getMap(List<FundItemDo> fundList) {
        Map<String, FundItemDo> res = fundList.stream().collect(Collectors.toMap(FundItemDo::getId,
                item -> item,
                (oldValue, newValue) -> oldValue));
        return res;
    }

    /*
        如果可以确保 fundList 中没有重复的 id，或者希望在出现重复键时抛出异常，可以使用 getMapMayError。
        如果可能存在重复的 id，并希望在这种情况下能够继续处理而不抛出异常，可以使用 getMap。
    */
}
