package com.keeko;

import com.keeko.entity.FundItemDo;
import com.keeko.entity.FundResDto;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class BigDecimalProblem {
    public static void main(String[] args) {
        List<FundItemDo> fundListOrigin = new ArrayList<>();

        fundListOrigin.add(new FundItemDo("1", "华夏成长", new BigDecimal(1)));
        fundListOrigin.add(new FundItemDo("2", "易方达蓝筹", new BigDecimal(2)));
        fundListOrigin.add(new FundItemDo("3", "中银稳健添利E", new BigDecimal(3)));

        // main里面的代码看起来没有问题
        // 但是一旦加入下面这行，就会因为 item.getM1Return()为null, 导致null.doubleValue报错： java.lang.NullPointerException
        fundListOrigin.add(new FundItemDo("4", "广发北证50成分C", null));

        // 正确的处理方式是 先过滤，将所有的可能为空又会有转换的情况 (可能导致报错的项过滤掉)
        List<FundResDto> fundListRes = fundListOrigin.stream()
                .filter(item -> item.getM1Return() != null)
                .map(item -> new FundResDto(item.getId(), item.getName(), item.getM1Return().doubleValue()))
                .collect(Collectors.toList());

        System.out.println(fundListRes);

    }
}
