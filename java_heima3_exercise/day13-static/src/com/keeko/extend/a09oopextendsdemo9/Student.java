package com.keeko.extend.a09oopextendsdemo9;

public class Student {
    String name;
    int age;
    String school;

    //需求：
    // 默认为 ZJU

    public Student() {
        //表示调用本类其他构造方法
        //细节：虚拟机就不会再添加super();
        this(null, 0, "ZJU");
    }

    public Student(String name, int age, String school) {
        this.name = name;
        this.age = age;
        this.school = school;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSchool() {
        return school;
    }

    public void setSchool(String school) {
        this.school = school;
    }
}
