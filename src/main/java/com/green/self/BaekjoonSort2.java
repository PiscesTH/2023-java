package com.green.self;

import java.util.Arrays;
import java.util.Scanner;

public class BaekjoonSort2 {
    public static void main(String[] args) {
        /*
문제
배열을 정렬하는 것은 쉽다. 수가 주어지면, 그 수의 각 자리수를 내림차순으로 정렬해보자.

입력
첫째 줄에 정렬하려고 하는 수 N이 주어진다. N은 1,000,000,000보다 작거나 같은 자연수이다.

출력
첫째 줄에 자리수를 내림차순으로 정렬한 수를 출력한다.
         */
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        int len = input.length();
        char[] charArr = new char[input.length()];
        for (int i = 0; i < len; i++) {
            charArr[i] = input.charAt(i);
        }
        System.out.println(Arrays.toString(charArr));
        for (int i = 1; i < charArr.length; i++) {
            int beforeIndex = i - 1;
            int currentIndex = beforeIndex + 1;
            while (beforeIndex >= 0 && charArr[beforeIndex] > charArr[currentIndex]) {
                char tmp = charArr[beforeIndex];
                charArr[beforeIndex] = charArr[currentIndex];
                charArr[currentIndex] = tmp;
                beforeIndex--;
                currentIndex--;
            }
        }
        System.out.printf("정답 : %s\n", Arrays.toString(charArr));
    }
}
