package com.keeko.test;

public class StaticTest {
    static int i = 1, j = 2;

    static {
        display(i);
    }

    public static void main(String[] args) {
        display(j);
    }

    static void display(int n) {
        System.out.println(n);
    }
}
