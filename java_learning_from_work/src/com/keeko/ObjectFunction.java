package com.keeko;

public class ObjectFunction {
    public static void main(String[] args) {
        /*
            equals(Object obj)
            hashCode()
            toString()
            getClass()
            clone()
            notify()
            notifyAll()
            wait()
        */
        MyObject obj1 = new MyObject();
        obj1.value = "heihei";

        MyObject obj2 = new MyObject();
        obj2.value = "ha";

        System.out.println(obj1.equals(obj2)); // false
        System.out.println(obj1.hashCode()); // 1975012498
        System.out.println(obj1.getClass()); // class com.keeko.ObjectFunction$MyObject
    }

    static class MyObject {
        String value;
    }
}
