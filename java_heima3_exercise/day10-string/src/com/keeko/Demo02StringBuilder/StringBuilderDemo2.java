package com.keeko.Demo02StringBuilder;

public class StringBuilderDemo2 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder();

        // 实现与 string + "abc" 一样的效果
        for (int i = 0; i < 1000000; i++) {
            sb.append("abc");
        }

        System.out.println(sb);
    }
}