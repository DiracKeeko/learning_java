package com.keeko.Demo01String;

/*
    定义一个方法，把 int 数组中的数据按照指定的格式拼接成一个字符串返回，调用该方法，
    并在控制台输出结果。例如，数组为 int[] arr = {1,2,3}; ，执行方法后的输出结果为：[1, 2, 3]
*/

public class StringDemo7 {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3,};
        System.out.println(arrToString(arr));
    }

    public static String arrToString(int[] arr) {
        String str = "[";
        for (int i = 0; i < arr.length; i++) {
            int curInt = arr[i];
            str += curInt; // 等价于 str.append(curInt);
            String strEx = i == (arr.length - 1) ? "" : ", ";
            str += strEx;
        }
        str += "]";
        return str;
    }
}
