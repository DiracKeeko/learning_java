package com.keeko.Demo03homework;

import java.util.ArrayList;

/*

    1、定义员工类Worker，私有属性name和salary，分别为String和int类型，表示姓名和工资，提供构造、get、set方法

    2、创建ArrayList集合，泛型为Worker类型，创建员工对象，将所有员工对象存入集合

    需求：
    1、判断是否有姓名为“王五”的员工，如果有，改名为“王小五”

    2、判断是否有姓名为“赵六”的员工，如果有，将其删除

    3、给姓名为“田七”的员工，涨500工资


    使用for循环遍历集合，获取到每一个元素。

    ​	3.1、判断元素的name属性，如果符合条件，作出相应的修改或者删除。

    ​	3.2、遍历时如果删除元素，后面的元素会往前走，索引再加1就会有元素遗漏，所以删除后遍历索引要相应的减1，防止有元素遍历不到。
* */

public class Homework03 {
    public static void main(String[] args) {
        // 创建集合对象
        ArrayList<Worker> list = new ArrayList<>();
        // 创建员工对象并添加到集合中
        list.add(new Worker("张三", 2000));
        list.add(new Worker("李四", 2500));
        list.add(new Worker("王五", 3000));
        list.add(new Worker("赵六", 3500));
        list.add(new Worker("田七", 4000));

        for (int i = 0; i < list.size(); i++) {
            Worker curWorker = list.get(i);
            if ("王五".equals(curWorker.getName())) {
                curWorker.setName("王小五");
                // list.set(i, curWorker); // 这行不写也行，因为list里面的元素是个对象
            }
            if ("赵六".equals(curWorker.getName())) {
                list.remove(i);
                i--; // 一旦删除元素，后面的元素会往前递补，索引再加1就会有元素遗漏，所以删除后要 i--
                // list.remove(i--); // 等价于上面两行
            }
            if ("田七".equals(curWorker.getName())) {
                curWorker.setSalary(curWorker.getSalary() + 500);
                // list.set(i, curWorker); // 这行不写也行，因为list里面的元素是个对象
            }
        }

        // 再次遍历查看结果
        for (int i = 0; i < list.size(); i++) {
            Worker w = list.get(i);
            System.out.println(w.getName() + "---" + w.getSalary());
        }
    }
}
