package com.green.self;

import java.util.Arrays;
//23.10.14
public class InsertionSort {
    public static int[] insertionSort(int[] arr) {
        int[] resultArr = SelectionSort.arrayCopy(arr);
        int len = resultArr.length;
        for (int i = 1; i < len; i++) {
            int beforeIndex = i - 1;
            if (i == 1 && resultArr[beforeIndex] > resultArr[i]) {
                int tmp = resultArr[beforeIndex];
                resultArr[beforeIndex] = resultArr[i];
                resultArr[i] = tmp;
            }
            if (resultArr[beforeIndex] > resultArr[i]) {   //i = 2 indexNum = 1
                int tmp = resultArr[beforeIndex];          //
                resultArr[beforeIndex] = resultArr[i];
                resultArr[i] = tmp;
                i -= 2;
            }
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        System.out.println(Arrays.toString(arr));
        int[] sortedArr = insertionSort(arr);
        System.out.println(Arrays.toString(sortedArr));
    }
}
