package com.keeko.demo02setName;

public class Demo01SetThreadName {
    public static void main(String[] args) {
        //开启多线程
        MyThread mt = new MyThread();
        mt.setName("A1");
        mt.start(); // A1
    }
}
