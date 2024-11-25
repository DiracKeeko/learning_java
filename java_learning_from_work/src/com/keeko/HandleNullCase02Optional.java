package com.keeko;

import java.util.Optional;

public class HandleNullCase02Optional {
    public static void main(String[] args) {
        String str = null;
        // 创建 Optional
        Optional<String> optional = Optional.ofNullable(str);

        // 安全获取值
        String result = optional.orElse("默认值");
        System.out.println("result");
        System.out.println(result); // "默认值"

        // 使用 Lambda 提供默认值
        String result2 = optional.orElseGet(() -> "计算默认值");
        System.out.println("result2");
        System.out.println(result2); // "计算默认值"

        String res = Optional.ofNullable(str).orElse("一个空值");
        System.out.println(res); // 一个空值

        // Optional.ofNullable(value).orElse(defaultValue);
    }

    /*
     关键方法说明：
        Optional.empty(): 创建空的 Optional
        Optional.of(value): 创建非空的 Optional（值为null会抛异常）
        Optional.ofNullable(value): 创建可能为空的 Optional
        orElse(): 提供默认值
        orElseGet(): 延迟提供默认值
        orElseThrow(): 值为空时抛出异常
        map(): 转换值
        flatMap(): 处理返回 Optional 的转换
        filter(): 按条件过滤
        ifPresent(): 值存在时执行操作
        isPresent(): 检查是否存在值

     使用建议：
        优先使用 orElse() 和 orElseGet() 而不是 isPresent()+get()
        使用 map() 进行链式调用而不是多重判空
        当默认值计算成本高时使用 orElseGet() 而不是 orElse()
        使用 filter() 进行条件过滤而不是显式的 if 判断
    */
}
