package com.keeko.Demo03StringJoiner;

import java.util.StringJoiner;

public class StringJoinerDemo2 {
    public static void main(String[] args) {
        //1.创建对象 new StringJoiner(delimiter, prefix, suffix)
        StringJoiner sj = new StringJoiner(", ","[","]");

        //2.添加元素
        sj.add("aaa").add("bbb").add("ccc");

        int len = sj.length();
        System.out.println(len); //15

        //3.打印
        System.out.println(sj); // [aaa, bbb, ccc]

        String str = sj.toString();
        System.out.println(str); // [aaa, bbb, ccc]

    }
}
