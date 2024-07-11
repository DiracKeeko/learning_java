package com.keeko.utils;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;

public class DateUtil {
    /**
     * 实现一个方法，将各种日期格式的字符串（例如"yyyy-MM-dd"、"yyyyMMdd"）
     * 都转换为统一的格式 "yyyy-MM-dd HH:mm:ss
     */
    public static String formatDateString(String dateString) {
        // Define the output date format
        SimpleDateFormat outputFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        Date date = null;

        if (dateString.matches("\\d{10}")) {
            // Convert seconds to milliseconds
            long timestamp = Long.parseLong(dateString) * 1000;
            date = new Date(timestamp);
        } else if (dateString.matches("\\d{13}")) {
            // Input is already in milliseconds
            long timestamp = Long.parseLong(dateString);
            date = new Date(timestamp);
        } else {
            // Define possible input date formats with corresponding regex patterns
            Map<Pattern, SimpleDateFormat> dateFormatMap = new HashMap<>();
            dateFormatMap.put(Pattern.compile("\\d{4}-\\d{2}-\\d{2} \\d{2}:\\d{2}:\\d{2}"), new SimpleDateFormat("yyyy-MM-dd HH:mm:ss"));
            dateFormatMap.put(Pattern.compile("\\d{4}-\\d{2}-\\d{2}"), new SimpleDateFormat("yyyy-MM-dd"));
            dateFormatMap.put(Pattern.compile("\\d{8}"), new SimpleDateFormat("yyyyMMdd"));
            dateFormatMap.put(Pattern.compile("\\d{4}/\\d{2}/\\d{2}"), new SimpleDateFormat("yyyy/MM/dd"));
            dateFormatMap.put(Pattern.compile("\\d{4}\\.\\d{2}\\.\\d{2}"), new SimpleDateFormat("yyyy.MM.dd"));

            // Try to parse the input date string with each format
            for (Map.Entry<Pattern, SimpleDateFormat> entry : dateFormatMap.entrySet()) {
                if (entry.getKey().matcher(dateString).matches()) {
                    try {
                        date = entry.getValue().parse(dateString);
                        break; // If parsing is successful, break out of the loop
                    } catch (ParseException e) {
                        // 如果匹配到了，但是解析错误，就需要这个Catch来处理，但是e可以选择不抛出
                        // 因为系统会输出大量的error log，而error log又不会终止程序的运行
                    }
                }
            }
        }


        if (date == null) {
            // date = new Date(); // 返回今天的时间
            // return dateString; // 或者返回原dateString

            System.out.println("Invalid date format: " + dateString);
            // log.error("Invalid date format: " + dateString); // 换用loger
            // 不做异常抛出处理
            // throw new IllegalArgumentException("Invalid date format: " + dateString);
        }

        // Return the formatted date string
        return outputFormat.format(date);
    }
}
