package com.keeko.homework;

/*
需求：
​	定义一个方法copyOfRange(int[] arr,int from, int to)
功能：
​	将数组arr中从索引from（包含from）开始，到索引to结束（不包含to）的元素复制到新数组中，
​	并将新数组返回。
*/

public class Homework10 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6};
        int[] res = copyOfRange(arr, 2, 4);

        for (int i = 0; i < res.length; i++) {
            System.out.print(res[i] + " ");
        }
    }

    public static int[] copyOfRange(int[] arr, int from, int to) {
        int[] arr1 = new int[to - from];
        int index = 0;
        for (int i = from; i < to; i++) {
            arr1[index++] = arr[i];
        }
        return arr1;
    }

}
