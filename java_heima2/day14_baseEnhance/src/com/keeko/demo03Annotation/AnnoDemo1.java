package com.keeko.demo03Annotation;

/**
 * 注解javadoc演示
 *
 * @author tester
 * @version 1.0
 * @since 1.5
 */

public class AnnoDemo1 {

    /**
     * 计算两数的和
     *
     * @param a 整数
     * @param b 整数
     * @return 两数的和
     */
    public int add(int a, int b) {
        return a + b;
    }
    // 通过 cmd种 javadoc AnnoDemo1.java 生成java文档
    // javadoc命令 在生成java文档时，会采用当前操作系统的文件编码，
    // 如果AnnoDemo1.java的编码格式与本操作系统的编码格式不同，java文档可能会乱码
}
