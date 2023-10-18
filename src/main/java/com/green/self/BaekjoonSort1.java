package com.green.self;

import java.util.Scanner;

public class BaekjoonSort1 {

    static int[] makeArr(int len) {
        Scanner scan = new Scanner(System.in);
        int[] arr = new int[len];
        for (int i = 0; i < arr.length; i++) {
            System.out.print("1 ~ 1000 사이의 정수를 입력해주세요. : ");
            arr[i] = scan.nextInt();
            for (int j = 0; j < i; j++) {
                if (arr[i] == arr[j]) {
                    System.out.print("중복된 숫자입니다.\n");
                    i--;
                    break;
                }
            }
        }
        return arr;
    }

    static int[] sortArr(int[] arr) {
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        int times = arr.length - 1;
        for (int i = 0; i < times; i++) {
            int minIndex = i;
            for (int j = i; j < times; j++) {
                int afterIndex = j + 1;
                if (resultArr[minIndex] > resultArr[afterIndex]) {
                    minIndex = afterIndex;
                }
            }
            int tmp = resultArr[i];
            resultArr[i] = resultArr[minIndex];
            resultArr[minIndex] = tmp;
        }
        return resultArr;
    }

    public static void main(String[] args) {
        /*
문제
N개의 수가 주어졌을 때, 이를 오름차순으로 정렬하는 프로그램을 작성하시오.

입력
첫째 줄에 수의 개수 N(1 ≤ N ≤ 1,000)이 주어진다. 둘째 줄부터 N개의 줄에는 수가 주어진다.
이 수는 절댓값이 1,000보다 작거나 같은 정수이다. 수는 중복되지 않는다.

출력
첫째 줄부터 N개의 줄에 오름차순으로 정렬한 결과를 한 줄에 하나씩 출력한다.
         */
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자의 개수를 정해주세요. : ");
        int len = scan.nextInt();
        int[] numArr = makeArr(len);
        int[] sortedArr = sortArr(numArr);
        for (int i : sortedArr) {
            System.out.println(i);
        }
    }
}
