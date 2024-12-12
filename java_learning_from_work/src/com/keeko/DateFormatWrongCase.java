package com.keeko;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DateFormatWrongCase {
    /*
        1、YYYY表示当前周所处年份的较大值，如果使用YYYY格式化，年的显示会出现错误
                日期2024-12-31  格式化输出为2025-12-31

        2、DD为年份中的第几天，如果使用DD格式化时间，日的显示会出现错误。
                日期2024-04-08  格式化输出为2024-04-99
                日期2024-04-09  格式化报错 DateTimeException
    */
    public static void main(String[] args) {
        // 日期是2024年12月31日
        LocalDate date = LocalDate.of(2024, 12, 31);

        // 使用YYYY格式化
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("YYYY-MM-dd");
        String formattedDate = date.format(formatter);

        System.out.println("使用 YYYY 格式化的结果: " + formattedDate); // 使用 YYYY 格式化的结果: 2025-12-31

        LocalDate date2 = LocalDate.of(2024, 4, 8);
        // 使用DD格式化
        DateTimeFormatter formatterTwo = DateTimeFormatter.ofPattern("yyyy-MM-DD");
        String formattedDateTwo = date2.format(formatterTwo);

        System.out.println("使用 yyyy-MM-DD 格式化的结果: " + formattedDateTwo); // 使用 yyyy-MM-DD 格式化的结果: 2024-04-99

        /*
            注意:
                DD使用时还有 DateTimeFormatter的最大宽度边界问题

                yyyy-MM-DD中的DD代表一年中的第几天（Day of Year），如果DD的值 > 99，例如100
                "100" 宽度超过了默认DateTimeFormatter的最大宽度（2位），因此会抛出DateTimeException。

                DateTimeFormatter的宽度限制是内部实现的一部分，无法修改默认DateTimeFormatter的最大宽度（2位）

                LocalDate.of(2024, 4, 8); // 使用 yyyy-MM-DD 格式化的结果: 2024-04-99
                LocalDate.of(2024, 4, 9); // 使用 yyyy-MM-DD 格式化  2024年4月9日是2024年的第100天 "100"超出了两位宽度
                    抛出异常 java.time.DateTimeException: Field DayOfYear cannot be printed as the value 100 exceeds the maximum print width of 2
         */
    }
}
