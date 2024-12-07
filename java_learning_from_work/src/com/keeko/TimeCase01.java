package com.keeko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class TimeCase01 {
    public static void main(String[] args) {
        // 创建时间范围 近7天 (近七天)
        final LocalDateTime endTime = LocalDate.now().atTime(LocalTime.MAX);
        final LocalDateTime startTime = LocalDate.now().minusDays(7).atTime(LocalTime.MIN);

        System.out.println(endTime); // 2024-12-07T23:59:59.999999999
        System.out.println(startTime); // 2024-11-30T00:00
    }
}
