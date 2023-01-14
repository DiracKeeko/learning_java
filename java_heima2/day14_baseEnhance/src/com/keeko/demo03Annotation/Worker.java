package com.keeko.demo03Annotation;

@MyAnno(value = 12, per = Person.P1, anno2 = @MyAnno2, strs = {"aaa", "bbb"})
// @MyAnno(value = 12, per = Person.P1, anno2 = @MyAnno2, strs = "aaa") // 数组中只有一个值 {}可以省略
@MyAnno3
public class Worker {

    // @MyAnno3 // ElementType.TYPE 只能作用于类上，加了报错
    public String name = "ccc";

    // @MyAnno3 // ElementType.TYPE 只能作用于类上，加了报错
    public void show() {
    }
}
