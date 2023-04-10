package com.keeko.homework;

/*
 * 现有一个小数数组{12.9, 53.54, 75.0, 99.1, 3.14}。请编写代码，找出数组中的最小值并打印。
 * */
public class Homework02 {
    public static void main(String[] args) {
        double[] arr = {12.9, 53.54, 75.0, 99.1, 3.14};

        double min = getMin(arr);
        System.out.println(min);
    }

    public static double getMin(double[] arr) {
        double minNum = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (minNum > arr[i]) {
                minNum = arr[i];
            }
        }
        return minNum;
    }
}
