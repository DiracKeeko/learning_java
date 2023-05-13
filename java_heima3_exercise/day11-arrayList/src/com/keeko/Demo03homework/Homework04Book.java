package com.keeko.Demo03homework;

import java.util.ArrayList;
import java.util.Scanner;

/*
*
* 利用面向对象的思想设计一个图书管理系统。图书的属性有：编号，书名，作者，价格。要求提供如下功能：

1、提供操作菜单，可以选择要进行的操作。

2、可以添加图书，添加图书时，编号需要唯一，添加成功，返回到菜单。

3、可以查询图书，显示所有图书信息，然后返回到菜单。

4、可以根据书名，查询单本图书信息，显示信息后，返回到菜单。

5、可以删除图书，通过编号删除，删除成功后，返回到菜单。

6、可以修改图书的信息，但编号不可以修改，修改成功后，返回到菜单。

7、可以退出系统，结束程序运行。

提示：

1、所有图书信息由键盘录入

2、图书的价格可以定义为字符串类型，因为在键盘录入时，不可以先使用nextInt()方法获取整数然后再使用next()方法获取字符串，这样会导致next()方法获取不到数据。
* */

public class Homework04Book {
    public static void main(String[] args) {
        // 创建集合用于存储图书信息
        ArrayList<Book> list = new ArrayList<>();
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("请选择你要进行的操作");
            System.out.println("1:添加图书");
            System.out.println("2:查看图书");
            System.out.println("3:查询图书");
            System.out.println("4:修改图书");
            System.out.println("5:删除图书");
            System.out.println("6:退出系统");

            String type = sc.next();

            switch (type) {
                case "1":
                    // 添加
                    addBook(list);
                    break;
                case "2":
                    // 查看所有图书
                    findAllBooks(list);
                    break;
                case "3":
                    // 查询某本图书
                    findBookByName(list);
                    break;
                case "4":
                    // 修改图书
                    updateBook(list);
                    break;
                case "5":
                    // 删除图书
                    deleteBook(list);
                    break;
                case "6":
                    System.out.println("感谢使用，再见");
                    System.exit(0); // 退出系统
                default:
                    System.out.println("选择有误，请重新输入");
                    break;
            }

        }
    }

    // 删除图书
    private static void deleteBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要删除的图书编号：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (id.equals(b.getBookId())) { // 编号存在
                // 删除图书并结束方法
                list.remove(i);
                System.out.println("~~~删除成功~~~");
                return;
            }
        }
        System.out.println("没有该编号的图书信息");
    }

    // 修改图书
    private static void updateBook(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要修改的图书编号：");
        String id = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (id.equals(b.getBookId())) { // 编号存在
                System.out.println("请输入修改后图书的名称：");
                String name = sc.next();
                System.out.println("请输入修改后图书的作者：");
                String author = sc.next();
                System.out.println("请输入修改后图书的价格：");
                double price = sc.nextDouble();
                Book newBook = new Book(id, name, author, price);
                // 更新数据
                list.set(i, newBook);
                System.out.println("~~~修改成功~~~");
                return;
            }
        }
        // 如果编号不存在
        System.out.println("没有该编号的图书信息");
    }

    // 根据图书的名称查询图书信息
    private static void findBookByName(ArrayList<Book> list) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要查询的图书名称：");
        String name = sc.next();
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            if (name.equals(b.getName())) {
                System.out.println("编号\t" + "书名\t" + "作者\t" + "价格");
                System.out.println(b.getBookId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
                return;
            }
        }
        System.out.println("没有该名称图书信息");
    }

    // 查看所有图书信息
    private static void findAllBooks(ArrayList<Book> list) {
        if (list == null || list.size() == 0) {
            System.out.println("尚无图书信息");
            return;
        }
        System.out.println("编号\t" + "书名\t" + "作者\t" + "价格");
        for (int i = 0; i < list.size(); i++) {
            Book b = list.get(i);
            System.out.println(b.getBookId() + "\t" + b.getName() + "\t" + b.getAuthor() + "\t" + b.getPrice());
        }
    }

    // 查询编号是否存在
    public static boolean isExist(ArrayList<Book> list, String bookId) {
        // 遍历，如果发现相同id，返回true，
        for (int i = 0; i < list.size(); i++) {
            if (bookId.equals(list.get(i).getBookId())) {
                return true;
            }
        }
        // 如果没有，返回false
        return false;
    }

    // 添加图书
    public static void addBook(ArrayList<Book> list) {
        // 键盘录入
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入图书信息：");
        System.out.println("编号：");
        String bookId;
        while (true) {
            bookId = sc.next();
            // 查询编号是否存在
            if (isExist(list, bookId)) {
                System.out.println("该编号已经存在，请重新输入");
            } else {
                break;
            }
        }
        System.out.println("名称：");
        String name = sc.next();
        System.out.println("作者：");
        String author = sc.next();
        System.out.println("价格：");
        double price = sc.nextDouble();
        // 将信息封装到图书对象
        Book b = new Book(bookId, name, author, price);
        // 添加到集合
        list.add(b);
        System.out.println("~~~添加成功~~~");
    }
}
