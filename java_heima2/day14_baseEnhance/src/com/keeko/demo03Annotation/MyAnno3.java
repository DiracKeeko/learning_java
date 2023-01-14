package com.keeko.demo03Annotation;

import java.lang.annotation.*;

/**
 * 元注解：用于描述注解的注解
 *
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承
 */

@Target({ElementType.TYPE,ElementType.METHOD,ElementType.FIELD})
// ↑ 表示MyAnno3这个注解 可以作用于类、方法，成员变量上 (此处省略了value)

@Retention(RetentionPolicy.RUNTIME)
// ↑ 表示被描述的注解会保留到class字节码文件中，并被JVM读取到

@Documented
// ↑ 表示将来这个注解描述的信息会被抽取到Java doc文档中

@Inherited
// ↑ 表示这个注解会被继承

public @interface MyAnno3 {
}

/*
    ElementType 有三种取值：
        TYPE: 可以作用于类上
        METHOD: 可以作用于方法上
        FIELD: 可以作用于成员变量上
*/