package com.halcyon.javatests.strings;

public class StringUtil {


    public static boolean isEmpty(String str){

        /*if (str.trim().length() == 0) {
            return true;
        }
        if (str == null){
            return true;
        }
        else{
            return false;
        }*/

        if (str == null) return true;
        if (str.trim().length() == 0) return true;
        return false;
    }
}
