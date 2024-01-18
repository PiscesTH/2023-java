package com.green.day78.regep;

import java.util.regex.Pattern;

public class regexpEx5 {
    public static void main(String[] args) {
        String str1 = "가나다";
        String str2 = "123";
        String str3 = "가123";
        String str4 = "가나123";
        String str5 = "가123나";
        String regexp = "^\\d{2}(0[1-9]|1[012])(0[1-9]|[12]\\d|3[01])-[1234]\\d{6}$";

        System.out.printf("%s -> %b\n", str1, Pattern.matches(regexp, str1));
        System.out.printf("%s -> %b\n", str2, Pattern.matches(regexp, str2));
        System.out.printf("%s -> %b\n", str3, Pattern.matches(regexp, str3));
        System.out.printf("%s -> %b\n", str4, Pattern.matches(regexp, str4));
        System.out.printf("%s -> %b\n", str5, Pattern.matches(regexp, str5));
    }
}
