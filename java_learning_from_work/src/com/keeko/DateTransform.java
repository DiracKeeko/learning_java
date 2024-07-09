package com.keeko;

import static com.keeko.utils.DateUtil.formatDateString;

public class DateTransform {
    public static void main(String[] args) {
        String[] testDates = {
                "2023-05-06",
                "2023-05-06 20:23:11",
                "20230506",
                "2023/05/06",
                "2023.05.06"
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
