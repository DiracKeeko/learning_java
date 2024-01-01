package com.keeko.entity;

import java.math.BigDecimal;

public class FundItemDo {
    /**
     * 合约代码
     */
    private String id;

    /**
     * 基金简称
     */
    private String name;

    /**
     * 近1月回报率
     */
    private BigDecimal m1Return;

    public FundItemDo() {
    }

    public FundItemDo(String id, String name, BigDecimal m1Return) {
        this.id = id;
        this.name = name;
        this.m1Return = m1Return;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getM1Return() {
        return m1Return;
    }

    public void setM1Return(BigDecimal m1Return) {
        this.m1Return = m1Return;
    }
}
