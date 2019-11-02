package com.halcyon.javatests.util;

public class StringUtil {

    public static String repeat(String str, int times){

        if (times < 0){
            throw new IllegalArgumentException("Negative Times not allowed");
        }

        StringBuilder result = new StringBuilder();

        for (int i = 0; i < times; i++) {
            result.append(str);
        }

        return result.toString();
    }
}
