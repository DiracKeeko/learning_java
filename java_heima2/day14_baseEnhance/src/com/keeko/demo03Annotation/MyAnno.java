package com.keeko.demo03Annotation;

public @interface MyAnno {
    // 注解的本质是接口

    public abstract String show();
    // 抽象方法是注解的属性
}
