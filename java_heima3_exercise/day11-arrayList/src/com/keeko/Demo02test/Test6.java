package com.keeko.Demo02test;

import java.util.ArrayList;

public class Test6 {
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

        //4.调用方法查看id是否存在
        boolean flag = isExistInList(list, "st01");

        //5.打印结果
        System.out.println(flag); // true

        System.out.println(isExistInList(list,"st10")); // false
    }

    public static boolean isExistInList(ArrayList<User> list, String id) {
        for (int i = 0; i < list.size(); i++) {
            User st = list.get(i);
            if (id.equals(st.getId())) {
                return true;
            }
        }
        return false;
    }
}
