package com.keeko.test;

abstract class Person {
    public void talk() {
        System.out.println("I am a person");
    }
}

class Employee extends Person {
    public void talk() {
        System.out.println("I am an employee");
    }
}

class Student extends Person {
    public void talk() {
        System.out.println("I am a student");
    }
}

public class ExtendsTest {
    public static void main(String[] args) {
        Person student = new Student();
        student.talk();
    }
}
