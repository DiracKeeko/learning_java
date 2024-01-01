package com.keeko;

import com.keeko.entity.FundItemDo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TransformListToIdToItemMap {
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

    public static Map<String, FundItemDo> getMap(List<FundItemDo> fundList) {
        Map<String, FundItemDo> res = fundList.stream().collect(Collectors.toMap(FundItemDo::getId,
                item -> item,
                ( oldValue, newValue) -> oldValue));
        return res;
    }
}
