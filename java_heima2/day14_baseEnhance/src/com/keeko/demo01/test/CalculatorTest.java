package com.keeko.demo01.test;

import com.keeko.demo01.junit.Calculator;
import org.junit.Assert;
import org.junit.Test;

public class CalculatorTest {
    /**
     * 测试add方法
     */
    @Test
    public void testAdd() {
        // System.out.println("我被执行了");
        //1.创建计算器对象
        System.out.println("testAdd...");
        Calculator c = new Calculator();
        //2.调用add方法
        int result = c.add(1, 2);
        // System.out.println(result);

        int errorResult = 4;
        //3.断言  我断言这个结果是3
        Assert.assertEquals(errorResult, result);
    }

    @Test
    public void testSub() {
        //1.创建计算器对象
        Calculator c = new Calculator();
        int result = c.sub(1, 2);
        System.out.println("testSub....");
        Assert.assertEquals(-1, result);
    }
}
