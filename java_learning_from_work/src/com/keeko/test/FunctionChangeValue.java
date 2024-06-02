package com.keeko.test;

public class FunctionChangeValue {
    public static void changeValue(int i) {
        ++i;
    }

    public static void main(String[] args) {
        int i = 100;
        changeValue(i);
        i = i++; // i = 100; i++的值 等于 i的值
        System.out.println(i); // 100
    }
}
