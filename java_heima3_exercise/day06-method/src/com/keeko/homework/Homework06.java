package com.keeko.homework;

public class Homework06 {
    public static void main(String[] args) {
        int[] arr1 = { 1, 2, 3 };
        int[] arr2 = { 1, 2, 3 };
        int[] arr3 = { 1, 6, 6 };

        System.out.println(arrayEquals(arr1, arr2));
        System.out.println(arrayEquals(arr1, arr3));

    }

    public static boolean arrayEquals(int[] arr1, int[] arr2) {
        boolean isArrayLengthEquality = arr1.length == arr2.length;
        if (!isArrayLengthEquality) {
            return false;
        }

        // boolean isArrayContentSame = true;
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] != arr2[i]) {
                return false;
            }
        }

        return true;
    }
}
