package com.keeko.test;


public class Car {
    String name = "汽车";

    public Car(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        Car bmw = new BMW("宝马X5");
        System.out.println(bmw.name);
        // 宝马X5
    }
}

class BMW extends Car {
    String name = "宝马";
    public BMW(String name) {
        super(name);  // 调用父类的构造函数
        this.name = name;
    }
}
