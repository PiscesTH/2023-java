package com.green.self;

import java.util.Arrays;
//23.10.14
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int[] resultArr = SelectionSort.arrayCopy(arr);
        final int LEN = resultArr.length;
        for (int i = 1; i < LEN; i++) {
            int beforeIndex = i - 1;
            if (i == 1 && resultArr[beforeIndex] > resultArr[i]) {
                int tmp = resultArr[beforeIndex];
                resultArr[beforeIndex] = resultArr[i];
                resultArr[i] = tmp;
            }
            if (resultArr[beforeIndex] > resultArr[i]) {
                int tmp = resultArr[beforeIndex];
                resultArr[beforeIndex] = resultArr[i];
                resultArr[i] = tmp;
                i -= 2;
            }
        }
        return resultArr;
    }

    static int[] selectionSortPrac(int[] arr){
        int[] resultArr = SelectionSort.arrayCopy(arr);
        final int LEN = resultArr.length;
        for (int i = 0; i < LEN; i++) {
            int minIndex = i;
            for (int j = i; j < LEN; j++) {
                int afterIndex = j + 1;
                if (resultArr[i] < resultArr[afterIndex]){
                    minIndex = afterIndex;
                }
            }
            int tmp = resultArr[i];
            resultArr[i] = resultArr[minIndex];
            resultArr[minIndex] = tmp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
