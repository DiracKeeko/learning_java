package com.keeko.Demo02test;

import java.util.ArrayList;

/*
需求：
    改写User类，增加 Int age;

        main方法中定义一个集合，存入三个User对象。
        他们的age 分别为  16 17 18
        定义一个方法，将age < 18的user对象存入新的集合中，返回新的集合。
*/

public class Test8 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("st01","zhangsan","123456", 16);
        User u2 = new User("st02","lisi","12345678", 17);
        User u3 = new User("st03","wangwu","1234qwer", 18);

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);

        ArrayList<User> juList = getJuvenileUser(list);

        //5.打印结果
        for (int i = 0; i < juList.size(); i++) {
            User us = juList.get(i);
            System.out.println(us.getUsername() + ", " + us.getAge());
        }
    }

    public static ArrayList<User> getJuvenileUser(ArrayList<User> list) {
        ArrayList<User> juvenileList = new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            User us = list.get(i);
            if (us.getAge() < 18) {
                juvenileList.add(us);
            }
        }
        return juvenileList;
    }

}
