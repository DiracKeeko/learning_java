package com.keeko.test;

public class ObjectGC {
    public static void main(String[] args) {
        Object o = new Float(3.14F);
        Object[] oa = new Object[1];
        oa[0] = o;
        o = null;
        oa[0] = null;
        System.out.println("return 0");
    }
}
