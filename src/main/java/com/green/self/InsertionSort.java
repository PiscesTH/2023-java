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

    static int[] insertionSortPrac(int[] arr) {
        int[] resultArr = SelectionSort.arrayCopy(arr);
        for (int i = 1; i < resultArr.length; i++) {
            int beforeIndex = i - 1;
            int currentIndex = beforeIndex + 1;
            while (beforeIndex >= 0 && resultArr[beforeIndex] > resultArr[currentIndex]) {
                int tmp = resultArr[currentIndex];
                resultArr[currentIndex] = resultArr[beforeIndex];
                resultArr[beforeIndex] = tmp;
                beforeIndex--;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
        int[] arrSorted3 = insertionSortPrac(arr);
        System.out.println("arr : " + Arrays.toString(arr));
        System.out.println("arrInsertionSorted : " + Arrays.toString(arrSorted3));
    }
}
