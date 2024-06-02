package com.keeko.test;

public class OutputTest {
    public static String tostring() {
        System.out.println("Hello World, Test!");
        return "xxxx";
    }

    public static void main(String[] args) {
        System.out.println(tostring());
    }

    // 输出结果是:
    // Hello World, Test!
    // xxxx
}
