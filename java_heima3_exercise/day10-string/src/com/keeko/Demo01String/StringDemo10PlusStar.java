package com.keeko.Demo01String;

public class StringDemo10PlusStar {
    public static void main(String[] args) {
        String phoneNumber = "13566668888";

        String startStr = phoneNumber.substring(0, 3);

        String endStr = phoneNumber.substring(7);

        String res = startStr + "****" + endStr;

        System.out.println(res);
    }
}
