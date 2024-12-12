package com.keeko;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateFormatCorrectCase {
    /*
       java中正确的 format string

       1）@JsonFormat(pattern="yyyy-MM-dd HH:mm:ss", timezone="GMT+8")

       2）DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
          DateTimeFormatter dateTimeFormatterByLocal = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);

       3）SimpleDateFormat simple = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
          SimpleDateFormat simpleByLocale = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
          SimpleDateFormat simpleByDfs = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", dateFormatSymbols);
          simpleDateFormat.applyPattern("yyyy-MM-dd HH:mm:ss");
          simpleDateFormat.applyLocalizedPattern("yyyy-MM-dd HH:mm:ss");
    */
    public static void main(String[] args) {
        // 日期是2024年12月31日
        LocalDate date = LocalDate.of(2024, 12, 31);

        // 1. 正确的 formatter token "yyyy-MM-dd"
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        String formattedDate = date.format(formatter);
        System.out.println("使用 yyyy-MM-dd 格式化的结果: " + formattedDate);
        // 使用 yyyy-MM-dd 格式化的结果: 2024-12-31


        // 2. 加入了时分秒的 正确 formatter token "yyyy-MM-dd HH:mm:ss"
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        /*
        String formattedDate2 = date.format(formatter2); // 会报错
        System.out.println("使用 yyyy-MM-dd 格式化的结果: " + formattedDate2);

        // LocalDate表示一个日期对象（仅包含年、月、日），而不包含时间（小时、分钟、秒）。
        // 因此，当尝试使用格式化器yyyy-MM-dd HH:mm:ss时，程序会报错
         */

        // 将 LocalDate 转换为 LocalDateTime，补充时间部分
        LocalDateTime dateTime = date.atTime(LocalTime.MIDNIGHT); // 时间补充为 00:00:00
        // LocalDateTime endTime = LocalDate.now().atTime(LocalTime.MAX);
        String formattedDate2 = dateTime.format(formatter2);

        System.out.println("使用 yyyy-MM-dd HH:mm:ss 格式化的结果: " + formattedDate2);
        // 使用 yyyy-MM-dd HH:mm:ss 格式化的结果: 2024-12-31 00:00:00

        // 3. 添加了时区 Locale.CHINA 的 formatter token
        LocalDateTime endTime = date.atTime(LocalTime.MAX);
        DateTimeFormatter dateTimeFormatterByLocal = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss", Locale.CHINA);
        String formattedDate3 = endTime.format(dateTimeFormatterByLocal);
        System.out.println("使用 dateTimeFormatterByLocal 格式化的结果: " + formattedDate3);
        // 使用 dateTimeFormatterByLocal 格式化的结果: 2024-12-31 23:59:59

    }
}
