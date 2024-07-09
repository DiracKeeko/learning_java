package com.keeko.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateUtil {
    /**
     * 实现一个方法，将各种日期格式的字符串（例如"yyyy-MM-dd"、"yyyyMMdd"）
     * 都转换为统一的格式 "yyyy-MM-dd HH:mm:ss
     */
    public static String formatDateString(String dateString) {
        // Define the output date format
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        // Define possible input date formats
        String[] dateFormats = {
                "yyyy-MM-dd HH:mm:ss",
                "yyyy-MM-dd",
                "yyyyMMdd",
                "yyyy/MM/dd",
                "yyyy.MM.dd"
        };

        // Try to parse the input date string with each format
        for (String format : dateFormats) {
            try {
                SimpleDateFormat inputFormat = new SimpleDateFormat(format);
                date = inputFormat.parse(dateString);
                break; // If parsing is successful, break out of the loop
            } catch (ParseException e) {
                // Continue to the next format if parsing fails
            }
        }

        if (date == null) {
            throw new IllegalArgumentException("Invalid date format: " + dateString);
        }

        // Return the formatted date string
        return outputFormat.format(date);
    }
}
