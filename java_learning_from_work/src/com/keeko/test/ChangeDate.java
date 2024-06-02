package com.keeko.test;

import java.time.LocalDate;
import java.time.Month;

public class ChangeDate {
    public static void main(String[] args) {
        LocalDate ld1 = LocalDate.of(2014, Month.JANUARY, 31);
        LocalDate ld2 = ld1.plusMonths(1);
        System.out.println(ld1); // 2014-01-31
        System.out.println(ld2); // 2014-02-28
    }
}
