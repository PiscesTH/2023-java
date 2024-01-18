package com.green.day78.regep;

import java.util.regex.Pattern;

public class regexpEx2 {
    public static void main(String[] args) {
        String str1 = "ASD";
        String str2 = "asd";
        String str3 = "ASD asd";
        String regexp = "^[a-zA-Z]*$";

        System.out.printf("%s -> %b\n",str1, Pattern.matches(regexp, str1));
        System.out.printf("%s -> %b\n",str2, Pattern.matches(regexp, str2));
        System.out.printf("%s -> %b\n",str3, Pattern.matches(regexp, str3));
    }
}
