package com.keeko.test;

//目标：要能区分出什么时候使用带返回值的方法
//需求：定义方法，比较两个长方形的面积

//调用方法获取长方形的面积，再进行比较

public class Test3 {
    public static void main(String[] args) {
        double area1 = getArea(5.3, 1.7);
        double area2 = getArea(2.4, 2.7);

        if(area1 > area2){
            System.out.println("第一个长方形更大");
        }else{
            System.out.println("第二个长方形更大");
        }
    }

    public static double getArea(double length, double width) {
        double area = length * width;
        return area;
    }
}
