package com.keeko.homework;
/*
    定义一个数组其中包含多个数字。

    用自己的方式最终实现，奇数放在数组的左边，偶数放在数组的右边。（可以创建其他数组，不必须在原数组中改变）

    打印排序之后的数组
*/

public class Homework08 {
    public static void main(String[] args) {
        //1.定义原数组
        int[] arr = {12,23,34,45,67,78,11,22};

        //2.定义空数组
        int[] newArr = new int[arr.length];

        int left = 0;
        int right = arr.length - 1;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 == 1) {
                newArr[left] = arr[i];
                left++;
            } else {
                newArr[right] = arr[i];
                right--;
            }
        }
        for (int i = 0; i < newArr.length; i++) {
            System.out.print(newArr[i] + " ");
        }
    }
}
