package com.keeko.test;
/*
需求：
​	定义方法实现随机产生一个5位的验证码

验证码格式：
​	长度为5

​	前四位是大写字母或者小写字母
​	最后一位是数字
*/

import java.util.Random;

public class Test3VerificationCode {
    public static void main(String[] args) {
        // 1.大写字母和小写字母都放到数组当中
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            //ASCII码表
            if (i <= 25) {
                //添加小写字母
                chs[i] = (char) (97 + i);
            } else {
                //添加大写字母
                // A --- 65
                chs[i] = (char) (65 + i - 26);
            }
        }

        // 定义一个字符串类型的变量，用来记录最终的结果
        String result = "";

        // 2.随机抽取4次
        // 随机抽取数组中的索引
        Random r = new Random();
        for (int i = 0; i < 4; i++) {
            int randomIndex = r.nextInt(chs.length);
            result = result + chs[randomIndex];
        }

        // 3.随机抽取一个数字0~9
        int number = r.nextInt(10);

        result = result + number;

        System.out.println("result-> " + result);
    }
}
