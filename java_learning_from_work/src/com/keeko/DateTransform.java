package com.keeko;

import static com.keeko.utils.DateUtil.formatDateString;

public class DateTransform {
    public static void main(String[] args) {
        String[] testDates = {
                "1720428000", //  秒级别时间戳
                "1720368000000", // 毫秒级别时间戳
                "2023-05-06",
                "2023-05-06 20:23:11",
                "20230506",
                "2023/05/06",
                "2023.05.06",
                // "2023.05.067", // Invalid date format: 2023.05.067
                "2023.05.67", // Original: 2023.05.67 -> Formatted: 2023-07-06 00:00:00
        };

        for (String testDate : testDates) {
            try {
                String formattedDate = formatDateString(testDate);
                System.out.println("Original: " + testDate + " -> Formatted: " + formattedDate);
            } catch (IllegalArgumentException e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
