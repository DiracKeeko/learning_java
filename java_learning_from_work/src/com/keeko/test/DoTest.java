package com.keeko.test;

class Test2 {
    private final int y;
    {
        y = 10;
        System.out.println(y);
    }
    // {
    //     y = 20;
    //     System.out.println(y);
    // }
    // 开启注释的话  无法编译通过，会报错，不会产生任何输出
}

public class DoTest {
    public static void main(String[] args) {
        new Test2();
    }
}
