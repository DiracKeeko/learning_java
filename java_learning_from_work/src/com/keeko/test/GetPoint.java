package com.keeko.test;

class Line {
    public class Point {
        public int x, y;
    }
    public Point getPoint() {
        return new Point();
    }
}


/*
public class GetPoint {
    public GetPoint {
        // insert code here
        // 获取Point对象的坐标
        Line.Point p = (new Line()).getPoint();
        // 在 Java 中，内部类是通过 OuterClassName.InnerClassName 来引用的。所以 Line.Point 是合法的写法，表示 Line 类中的 Point 内部类。
    }
}
*/
