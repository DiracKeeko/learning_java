package com.keeko;

import java.util.Optional;

public class HandleNullCase04Optional {
    public static void main(String[] args) {
        Optional<String> optional = Optional.of("Hello");

        System.out.println("Using orElse:");
        String result1 = optional.orElse(getDefaultValue()); // Computing default value...   默认值总会被计算
        System.out.println("Result1: " + result1);

        System.out.println("Using orElseGet:");
        String result2 = optional.orElseGet(() -> getDefaultValue()); // 默认值不会被计算
        System.out.println("Result2: " + result2);


        Optional<String> op2 = Optional.ofNullable("World");
        System.out.println("Using orElse:");
        String result3 = op2.orElse(getDefaultValue()); // Computing default value...   默认值总会被计算
        System.out.println("Result3: " + result3);

        System.out.println("Using orElseGet:");
        String result4 = op2.orElseGet(() -> getDefaultValue()); // 默认值不会被计算
        System.out.println("Result4: " + result4);

    }

    private static String getDefaultValue() {
        System.out.println("Computing default value...");
        return "Default";
    }

    /*
        默认值简单、不涉及复杂计算	orElse
        默认值复杂、涉及高计算成本	orElseGet
    */
}
