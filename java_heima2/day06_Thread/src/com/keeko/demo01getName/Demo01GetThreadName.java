package com.keeko.demo01getName;

/*
    线程的名称:
        主线程: main
        新线程: Thread-0,Thread-1,Thread-2
 */
public class Demo01GetThreadName {
    public static void main(String[] args) {
        //创建Thread类的子类对象
        MyThread mt = new MyThread();
        //调用start方法,开启新线程,执行run方法
        mt.start();

        new MyThread().start();
        new MyThread().start();

        /*
        Thread-0
        Thread-1
        Thread-2
        */

        // 链式编程 获取主线程名称 main  必须使用这种方式
        System.out.println(Thread.currentThread().getName());
    }
}
