package com.keeko.demo04Reader;

import java.io.FileInputStream;
import java.io.IOException;

/*
    使用字节流读取中文文件
    1个中文
        GBK:占用两个字节
        UTF-8:占用3个字节
 */
public class Demo01InputStream {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("day09_IOAndProperties\\c.txt");
        int len = 0;
        while ((len = fis.read()) != -1) {
            System.out.println((char) len); // 有问题, 读取了1/3个中文，1/3个中文转为char就乱码了
        }
        fis.close();
    }
}
