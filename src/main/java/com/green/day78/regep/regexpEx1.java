package com.green.day78.regep;

import java.util.regex.Pattern;

public class regexpEx1 {
    public static void main(String[] args) {
        String str1 = "123 ";
        String str2 = "12345";
        String str3 = "123asd";
        String regexp = "^[\\d ]*$";

        System.out.printf("%s -> %b\n",str1, Pattern.matches(regexp, str1));
        System.out.printf("%s -> %b\n",str2, Pattern.matches(regexp, str2));
        System.out.printf("%s -> %b\n",str3, Pattern.matches(regexp, str3));
    }
}
