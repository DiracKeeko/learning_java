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

        List<FundResDto> fundListRes = fundListOrigin.stream()
                .map(item -> new FundResDto(item.getId(), item.getName(), item.getM1Return().doubleValue()))
                .collect(Collectors.toList());

        System.out.println(fundListRes);

    }
}
