package com.green.self;

import java.util.Arrays;

public class SelectionSrot {

    static int[] bulbleSortReverse(int[] arr) {
        int min = 0;
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        int times = arr.length - 1;
        for (int i = 0; i < times; i++) {
            for (int j = times; j > i; j--) {
                int indexNUm = j - 1;
                if (resultArr[indexNUm] > resultArr[j]) {
                    int tmp = resultArr[indexNUm];
                    resultArr[indexNUm] = resultArr[j];
                    resultArr[j] = tmp;
                }
                System.out.printf("Process[%d][%d] : %s\n", i, j, Arrays.toString(resultArr));
//4321 432 43 4
            }
        }
        return resultArr;
    }

    static int[] selectionSort (int[] arr){

        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        System.out.println(Arrays.toString(arr));
        int[] arrSorted = bulbleSortReverse(arr);
        System.out.println(Arrays.toString(bulbleSortReverse(arr)));
    }
}
