package com.keeko.demo02.Set;


/*
    HashSet存储自定义类型元素

    set集合报错元素唯一:
        存储的元素(String,Integer,...Student,Person...),

        存储自定义元素(如 Person)必须重写hashCode方法和equals方法

    要求:
        同名同年龄的人,视为同一个人,只能存储一次
 */

import java.util.HashSet;

public class Demo03HashSetSavePerson {
    public static void main(String[] args) {
        HashSet<Person> set = new HashSet<>();

        Person p1 = new Person("11",18);
        Person p2 = new Person("11",18);
        Person p3 = new Person("11",19);
        System.out.println(p1.hashCode());//1967205423
        System.out.println(p2.hashCode());//42121758

        System.out.println(p1==p2);//false
        System.out.println(p1.equals(p2));//false
        set.add(p1);
        set.add(p2);
        set.add(p3);
        System.out.println(set);
    }
}
