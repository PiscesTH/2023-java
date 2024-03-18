package com.green.self;

import java.util.Arrays;

public class SelfPrac19 {

    public static void main(String[] args) {
        String[] strings = {"abc", "//", ".", "bbd", "qwe"};
        System.out.println(Arrays.toString(strings));
        String result = getStr(strings, "bbd");
        System.out.println(result);
    }

    private static String getStr(String[] strings, String str) {
        String result = null;
        if (Arrays.asList(strings).contains(str)) {
            result = strings[Arrays.asList(strings).indexOf(str)];
        }
        return result;
    }
}
