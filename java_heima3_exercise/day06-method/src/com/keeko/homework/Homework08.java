package com.keeko.homework;
/*
需求：
​	定义一个方法fill(int[] arr,int fromIndex,int toIndex,int value)

功能：
​	将数组arr中的元素从索引fromIndex开始到toIndex（不包含toIndex）对应的值改为value
*/

public class Homework08 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        fill(arr, 2, 4, 0);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static int[] fill(int[] arr, int fromIndex, int toIndex, int value) {
        for (int i = fromIndex; i < toIndex; i++) {
            arr[i] = value;
        }
        return arr;
    }
}
