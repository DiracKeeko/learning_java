package com.keeko.demo05Consumer;

/*
    练习:
        字符串数组当中存有多条信息，请按照格式“姓名：XX。性别：XX。”的格式将信息打印出来。
        要求将打印姓名的动作作为第一个Consumer接口的Lambda实例，
        将打印性别的动作作为第二个Consumer接口的Lambda实例，
        将两个Consumer接口按照顺序“拼接”到一起。
 */

import java.util.function.Consumer;

public class Demo03Test {

    public static void printInfo(String[] arr, Consumer<String> con1, Consumer<String> con2) {
        for (String message: arr) {
            con1.andThen(con2).accept(message);
        }
    }

    public static void main(String[] args) {
        String[] arr = { "张三,男", "李四,男" };

        printInfo(arr, (message) -> {
            String name = message.split(",")[0];
            System.out.print("姓名: " + name + ", ");
        }, (message) -> {
            String age = message.split(",")[1];
            System.out.println("年龄: " + age + "。");
        });
    }
}
