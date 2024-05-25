package com.keeko.entity;

public class Person {
    private String Name;
    private int age;

    public Person() {
    }

    public Person(String name, int age) {
        Name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Name='" + Name + '\'' +
                ", age=" + age +
                '}';
    }
}
