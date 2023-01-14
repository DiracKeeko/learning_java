package com.keeko.demo03Annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

/**
 * 元注解：用于描述注解的注解
 *
 * @Target：描述注解能够作用的位置
 * @Retention：描述注解被保留的阶段
 * @Documented：描述注解是否被抽取到api文档中
 * @Inherited：描述注解是否被子类继承
 */

@Target(value = {ElementType.TYPE}) // 表示MyAnno3这个注解只能作用于类上
public @interface MyAnno3 {
}

/*
    ElementType 有三种取值：
        TYPE: 可以作用于类上
        METHOD: 可以作用于方法上
        FIELD: 可以作用于成员变量上
*/