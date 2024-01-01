package com.keeko;

import com.keeko.entity.FundItemDo;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class IdListToItemListUseMap {
    public static void main(String[] args) {
        List<String> idList = Arrays.asList("1", "2", "3");
        List<FundItemDo> fundList = idList.stream().map(id -> new FundItemDo(id, "基金" + id, new BigDecimal(id))).collect(Collectors.toList());
        System.out.println(fundList);
    }
}
