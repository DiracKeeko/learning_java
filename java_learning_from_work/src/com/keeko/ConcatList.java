package com.keeko;

import com.keeko.entity.Person;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ConcatList {
    public static void main(String[] args) {
        List<Person> list1 = new ArrayList<>();
        list1.add(new Person("John", 25));
        list1.add(new Person("Jane", 30));

        List<Person> list2 = new ArrayList<>();
        list2.add(new Person("Alice", 28));
        list2.add(new Person("Bob", 35));

        // 1. 使用 List.addAll() 方法
        // 合并两个列表
        list1.addAll(list2);

        // 打印合并后的列表
        list1.forEach(System.out::println);

        /*
            // 也可以新建一个 mergedList
            List<Person> mergedList = new ArrayList<>(list1);
            mergedList.addAll(list2);
        * */


        // 2. 使用 Stream API
        // 合并两个列表
        List<Person> mergedList = Stream.concat(list1.stream(), list2.stream())
                .collect(Collectors.toList());

        // 打印合并后的列表
        System.out.println("===2===");
        mergedList.forEach(System.out::println);
    }
}
