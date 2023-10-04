package com.green.day4.ch4;

public class CharAt {
    public static void main(String[] args) {
        String str = "abcdefghijk".toUpperCase();
        //str = str.toUpperCase();
        char result = str.charAt(1);
        System.out.println(str);
        System.out.println("result : " + result);
        System.out.println("result2 : " + str.charAt(2));
        System.out.println("result2 : " + str.charAt(0));
    }
}
