package com.keeko.entity;

import java.math.BigDecimal;

public class FundResDto {
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
    private Double m1Return;

    public FundResDto() {
    }

    public FundResDto(String id, String name, Double m1Return) {
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

    public Double getM1Return() {
        return m1Return;
    }

    public void setM1Return(Double m1Return) {
        this.m1Return = m1Return;
    }

    @Override
    public String toString() {
        return "FundResDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", m1Return=" + m1Return +
                '}';
    }
}
