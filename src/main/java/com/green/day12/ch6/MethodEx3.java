package com.green.day12.ch6;

import java.util.Arrays;
import java.util.List;

public class MethodEx3 {

    int sumText(String str) {
        int strNum = Integer.parseInt(str);
        int result = 0;
        while (strNum > 0) {
            int pulsNum = strNum % 10;
            strNum /= 10;
            result += pulsNum;
        }
        return result;
    }

    int sumText2(String str) {
        char[] charArr = new char[str.length()];
        int result = 0;
        for (int i = 0; i < charArr.length; i++) {
            charArr[i] = str.charAt(i);
            result += Integer.parseInt(String.valueOf(charArr[i]));    // >> char i 를 int i로. 바로 바꾸는 법 존재.
        }
        return result;
    }
    int sumText2Sol(String str) {
        char[] charArr = str.toCharArray();
        int result = 0;
        for (char num : charArr) {
            result += Character.getNumericValue(num);    // >> char i 를 int i로
        }
        return result;
    }

    public static void main(String[] args) {
        MethodEx3 me3 = new MethodEx3();

        int sum = me3.sumText("123456789");
        System.out.println(sum);
        int sum2 = me3.sumText2("123");
        System.out.println(sum2);
        int sum3 = me3.sumText2Sol("12345");
        System.out.println(sum3);

    }
}
