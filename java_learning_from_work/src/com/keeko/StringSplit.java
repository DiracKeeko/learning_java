package com.keeko;

public class StringSplit {
    public static void main(String[] args) {
        String str = "aaa_bbb_ccc";
        String[] arr = str.split("_");

        // 输出数组的内容
        for (String s : arr) {
            System.out.println(s);
        }
    }
}
