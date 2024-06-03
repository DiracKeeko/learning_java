package com.keeko.test;

import java.util.function.BiFunction;
import java.util.function.Function;

public class ArrowFunction {
    public static void main(String[] args) {
        Function<Integer, Integer> f = x -> x + 1;
        System.out.println(f.apply(1));

        BiFunction<Integer, Integer, Integer> g = (x, y) -> x + y;
        System.out.println(g.apply(1, 2));

        // 先输出2，再换行 输出3
    }
}
