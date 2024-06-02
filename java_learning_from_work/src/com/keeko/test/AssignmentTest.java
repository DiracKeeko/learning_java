package com.keeko.test;

public class AssignmentTest {
    public static void main(String[] args) {
        boolean b = true;
        if (b = false) {
            System.out.println("a");
        } else if (b) {
            System.out.println("b");
        } else if (!b) {
            System.out.println("c");
        } else {
            System.out.println("d");
        }
        // 上面输出 "c"
        System.out.println("b = false -> " + (b = false));
    }
}
