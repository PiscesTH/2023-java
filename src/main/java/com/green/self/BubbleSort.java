package com.green.self;

import java.util.Arrays;

public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {3, 2, 1, 6, 5, 4};
        System.out.println(Arrays.toString(arr));

        bubbleSort(arr);       //오름차순 정렬 1 ~ 6 순서
        System.out.println(Arrays.toString(arr));
        printArr(arr);

        System.out.println(sumArr(arr));
    }

    public static int[] bubbleSort(int[] arr) {
        int[] resultArr = SelectionSort.arrayCopy(arr);
        int times = resultArr.length - 1;
        for (int i = times; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                int nextIndex = j + 1;
                if (resultArr[j] > resultArr[nextIndex]) {
                    int tmp = resultArr[i];
                    resultArr[i] = resultArr[nextIndex];
                    resultArr[nextIndex] = tmp;
                }
            }
        }
        return resultArr;
    }


    public static void sortArrSol(int[] arr) {      //선택정렬 구현 시도해보기.
        int len = arr.length - 1;               //len = 5
        for (int i = len; i > 0; i--) {         //i=5~0 >> 5번 4번 3번 2번 1번 반복 되는 for
            for (int j = 0; j < i; j++) {       //i=5 j=0~4 / i=4 j=0~3 / i=3 j= 0~2...
                int nIdx = j + 1;               // j번 nIdx 번(j 다음 방) 배열 비교
                if (arr[nIdx] < arr[j]) {       // nIdx번(다음) 방이 작으면
                    int tmp = arr[j];           // j번(이전) 방의 값 임시저장
                    arr[j] = arr[nIdx];         // j번(이전) 방에 작은 값 저장
                    arr[nIdx] = tmp;            // nIdx 방(다음)에 임시저장 한 값 불러오기
                }
            }
        }
    }

    public static void printArr(int[] arr) {
        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }

    public static int sumArr(int[] arr) {
        int result = 0;
        for (int num : arr) {
            result += num;
        }
        return result;
    }
}
