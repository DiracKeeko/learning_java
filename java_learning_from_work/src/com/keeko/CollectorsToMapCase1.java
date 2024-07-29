package com.keeko;

import com.keeko.entity.FundItemDo;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CollectorsToMapCase1 {
    public static void main(String[] args) {
        List<FundItemDo> fundListOrigin = new ArrayList<>();

        fundListOrigin.add(new FundItemDo("1", "华夏成长", new BigDecimal(1)));
        fundListOrigin.add(new FundItemDo("2", "易方达蓝筹", new BigDecimal(2)));
        fundListOrigin.add(new FundItemDo("3", "中银稳健添利E", new BigDecimal(3)));

        // 整体的代码看着没问题，但是一旦加入下面这一行 就会报错，空指针异常
        // java.util.stream.Collectors.lambda$toMap
        fundListOrigin.add(new FundItemDo("4", null, new BigDecimal(3)));

        // 这是因为 Collectors.toMap(key, value); key和value的任何一个为null，都会导致 NullPointerException。
        Map<String, String> fundIdToNameMap = fundListOrigin.stream()
                .collect(Collectors.toMap(FundItemDo::getId, FundItemDo::getName));

        // 所以在使用 Collectors.toMap()时，一定要先过滤，避免空指针异常
        /*
        // 下面是添加过滤之后的代码
        Map<String, String> fundIdToNameMapFilter = fundListOrigin.stream()
                .filter(item -> item.getId() != null && item.getName() != null)
                .collect(Collectors.toMap(FundItemDo::getId, FundItemDo::getName));
        */

        System.out.println(fundIdToNameMap);
    }
}
