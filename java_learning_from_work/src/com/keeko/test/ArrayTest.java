package com.keeko.test;

public class ArrayTest {
    public static void main(String[] args) {
        int[] intArray = new int[9]; // java中，创建一个新的int数组时，数组的每个元素都会被默认初始化为0
        for (int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
        // 输出 0 0 0 0 0 0 0 0 0
    }
}
