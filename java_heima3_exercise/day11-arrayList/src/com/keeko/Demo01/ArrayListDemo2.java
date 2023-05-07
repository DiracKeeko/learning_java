package com.keeko.Demo01;


import java.util.ArrayList;

/*
    boolean add(E e)        添加

    boolean remove(E e)     删除
    E remove(int index)

    E set(int index,E e)    修改

    E get(int index)        查询
    int size()              获取长度

 */
public class ArrayListDemo2 {
    public static void main(String[] args) {

        //1.创建一个集合
        ArrayList<String> list = new ArrayList<>();

        //2.添加元素
        list.add("aaa");
        list.add("aaa");
        list.add("bbb");
        list.add("ccc");


        //3.删除元素
        /*boolean result1 = list.remove("aaa"); // 返回值表示是否删除成功
        System.out.println(result1); // true
        System.out.println(list); // [aaa, bbb, ccc]

        boolean result2 = list.remove("ddd");
        System.out.println(result2); // false
        System.out.println(list); // [aaa, bbb, ccc]

        String str = list.remove(2); // 返回值表示删除的元素
        System.out.println(str); // ccc

        String str2 = list.remove(2); // 索引越界 -> 报错
        System.out.println(str2);*/


        //修改元素
        /*String result = list.set(1, "ddd"); // 返回值是被修改的元素
        System.out.println(result); // aaa*/

        //查询元素
        /*String s = list.get(0);
        System.out.println(s); // aaa*/

        //遍历
        for (int i = 0; i < list.size(); i++) {
            //i 索引
            //list.get(i) 元素
            String str3 = list.get(i);
            System.out.println(str3);
        }

    }
}
