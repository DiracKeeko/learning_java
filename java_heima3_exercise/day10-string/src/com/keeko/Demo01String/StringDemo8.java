package com.keeko.Demo01String;

import java.util.Scanner;

//定义一个方法，实现字符串反转。键盘录入一个字符串，调用该方法后，在控制台输出结果
//
// ​	例如，键盘录入 abc，输出结果 cba
public class StringDemo8 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串");
        String str = sc.next();
        // String str = "abc";
        System.out.println(reverseStr(str));
    }

    public static String reverseStr(String str) {
        String strRes = "";
        for (int i = 0; i < str.length(); i++) {
            strRes = str.charAt(i) + strRes;
        }
        return strRes;
    }

    /*
    // 用StringBuilder 创建字符串
    public static String reverseStr(String str) {
        StringBuilder strRes = new StringBuilder();
        for (int i = 0; i < str.length(); i++) {
            strRes.insert(0, str.charAt(i));
        }
        return strRes.toString();
    }
    */
}
