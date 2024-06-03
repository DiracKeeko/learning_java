package com.keeko.test;

public class ArrayTest {
    public static void main(String[] args) {
        int[] intArray = new int[9];
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // 输出 0 0 0 0 0 0 0 0 0
    }
}
