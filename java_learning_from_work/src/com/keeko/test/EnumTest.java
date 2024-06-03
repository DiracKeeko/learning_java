package com.keeko.test;

enum Level {
    LOW, MEDIUM, HIGH, URGENT
}

public class EnumTest {
    public static void main(String[] args) {
        Level s1 = null;
        Level s2 = Level.HIGH;

        System.out.println(getValue(Level.LOW)); // LOW
        System.out.println(getValue(s2)); // HIGH
        System.out.println(getValue(s1)); // null 如果getValue没处理好，会空指针异常
    }

    private static String getValue(Level lv) {
        return lv.name();
    }
}
