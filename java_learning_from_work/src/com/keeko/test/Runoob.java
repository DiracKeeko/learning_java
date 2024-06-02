package com.keeko.test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Runoob {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");
        list.add("D");
        Iterator<String> it = list.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
        }
        // 迭代器，依次(且换行) 输出 A, B, C, D
    }
}
