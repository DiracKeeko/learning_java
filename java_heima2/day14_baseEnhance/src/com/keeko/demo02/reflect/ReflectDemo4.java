package com.keeko.demo02.reflect;


import com.keeko.demo02.domain.Person;

import java.lang.reflect.Method;

public class ReflectDemo4 {

    /**
     * Class对象功能：
     * 获取功能：
     * 1. 获取成员变量们
     * Field[] getFields()
     * Field getField(String name)
     * <p>
     * Field[] getDeclaredFields()
     * Field getDeclaredField(String name)
     * 2. 获取构造方法们
     * Constructor<?>[] getConstructors()
     * Constructor<T> getConstructor(类<?>... parameterTypes)
     * <p>
     * Constructor<T> getDeclaredConstructor(类<?>... parameterTypes)
     * Constructor<?>[] getDeclaredConstructors()
     * 3. 获取成员方法们：
     * Method[] getMethods()
     * Method getMethod(String name, 类<?>... parameterTypes)
     * <p>
     * Method[] getDeclaredMethods()
     * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
     * <p>
     * 4. 获取类名
     * String getName()
     */

    public static void main(String[] args) throws Exception {

        //0.获取Person的Class对象
        Class personClass = Person.class;
        /*
          3. 获取成员方法们：
             * Method[] getMethods()
             * Method getMethod(String name, 类<?>... parameterTypes)

             * Method[] getDeclaredMethods()
             * Method getDeclaredMethod(String name, 类<?>... parameterTypes)
         */

        //获取指定名称的方法
        Method eat_method = personClass.getMethod("eat");
        Person p = new Person();
        //执行方法
        eat_method.invoke(p); // eat...


        Method eat_method2 = personClass.getMethod("eat", String.class);
        //执行方法
        eat_method2.invoke(p, "rice"); // eat...rice

        System.out.println("-----------------");

        // 获取所有public修饰的方法 getMethods
        Method[] methods = personClass.getMethods();
        // 继承自Object类的methods也会被获取到

        for (Method method : methods) {
            System.out.println(method);
            String name = method.getName();
            System.out.println(name);
            //method.setAccessible(true);
        }

        //获取类名 getName -> 全类名 (包名)
        String className = personClass.getName();
        System.out.println(className); // com.keeko.demo02.domain.Person

    }

}
