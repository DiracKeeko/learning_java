package com.keeko.demo03.Generic;

/*
    测试含有泛型的接口

    1、
    泛型接口  ->  泛型接口的实现类(指定类型)  ->  使用实现类

    2、
    泛型接口  ->  泛型接口的实现类(不指定类型，保留泛型)  ->  使用实现类(指定类型)
 */

public class Demo04GenericInterface {
    public static void main(String[] args) {
        //创建GenericInterfaceImpl1对象
        GenericInterfaceImpl1 gi1 = new GenericInterfaceImpl1();
        gi1.method("字符串");

        //创建GenericInterfaceImpl2对象
        GenericInterfaceImpl2<Integer> gi2 = new GenericInterfaceImpl2<>();
        gi2.method(10);

        GenericInterfaceImpl2<Double> gi3 = new GenericInterfaceImpl2<>();
        gi3.method(8.8);
    }
}
