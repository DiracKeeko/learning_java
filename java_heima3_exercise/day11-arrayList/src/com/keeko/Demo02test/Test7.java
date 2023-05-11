package com.keeko.Demo02test;

import java.util.ArrayList;

/*需求：
1，main方法中定义一个集合，存入三个用户对象。
      用户属性为：id，username，password
2，要求：定义一个方法，根据id查找对应的用户信息。
      如果存在，返回索引
      如果不存在，返回-1
*/

public class Test7 {
    public static void main(String[] args) {
        //1.创建集合
        ArrayList<User> list = new ArrayList<>();

        //2.创建三个用户对象
        User u1 = new User("st01","zhangsan","123456");
        User u2 = new User("st02","lisi","12345678");
        User u3 = new User("st03","wangwu","1234qwer");

        //3.把用户对象添加到集合当中
        list.add(u1);
        list.add(u2);
        list.add(u3);


        //5.打印结果
        System.out.println(getIndex(list, "st02")); // true

        System.out.println(getIndex(list,"st10")); // false
    }

    public static int getIndex(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User us = list.get(i);
            if (id.equals(us.getId())) {
                return i;
            }
        }
        return -1;
    }

}
