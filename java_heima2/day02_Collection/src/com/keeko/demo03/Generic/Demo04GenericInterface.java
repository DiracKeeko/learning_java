package com.keeko.demo03.Generic;

/*
    测试含有泛型的接口

    泛型接口  ->  泛型接口的实现类(指定类型)  ->  使用实现类
 */

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

    }
}
