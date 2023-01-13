package com.keeko.demo03Annotation;

public @interface MyAnno {
    // 注解的本质是接口

    // public abstract String show();

    // 抽象方法是注解的属性
    // 1、属性的返回值类型要求
    /*
     * 1 基本数据类型
     * 2 String
     * 3 枚举
     * 4 注解
     * 5 以上类型的数组
     *
     * */

    // void show1(); // void 不行

    int value();

    // int age();

    // Person per();
    //
    // MyAnno2 anno2();
    //
    // String[] strs();

    // String name() default "张三"; // 设置默认值
}
