package com.green.self;

import java.util.Arrays;

public class SelectionSort {

    static int[] arrayCopy(int[] arr){
        int[] resultArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            resultArr[i] = arr[i];
        }
        return resultArr;
    }

    static int[] bubbleSortReverse(int[] arr) {
        int [] resultArr = arrayCopy(arr);
        int times = arr.length - 1;
        for (int i = 0; i < times; i++) {
            for (int j = times; j > i; j--) {
                int indexNUm = j - 1;
                if (resultArr[indexNUm] > resultArr[j]) {
                    int tmp = resultArr[indexNUm];
                    resultArr[indexNUm] = resultArr[j];
                    resultArr[j] = tmp;
                }
                //System.out.printf("Process[%d][%d] : %s\n", i, j, Arrays.toString(resultArr));
            }
        }
        return resultArr;
    }

    static int[] selectionSort(int[] arr) {
        int [] resultArr = arrayCopy(arr);
        int times = arr.length - 1;
        for (int i = 0; i < times; i++) {
            int minIndex = i;                                       //i= 0
            for (int j = i; j < times; j++) {                       //i = j j= 0~3
                int indexNum = j + 1;                               //indexNum = 1~4
                if (resultArr[minIndex] > resultArr[indexNum]) {    //tmpIndex=0 j=0 indexNum=1
                    minIndex = indexNum;                            //minIndex = 0 >> 1
                }
                //System.out.println("minIndex : " + minIndex);
                //System.out.println("indexNum : " + indexNum);
            }
            int tmp = resultArr[minIndex];
            resultArr[minIndex] = resultArr[i];
            resultArr[i] = tmp;
            //System.out.printf("process : %s\n", Arrays.toString(resultArr));
        }
        return resultArr;
    }

    public static void main(String[] args) {
        int[] arr = {4, 2, 1, 5, 3};
        System.out.println("arr : " + Arrays.toString(arr));
        int[] arrSorted = bubbleSortReverse(arr);
        System.out.println("arrSortedReverse : " + Arrays.toString(bubbleSortReverse(arrSorted)));

        System.out.println("arr : " + Arrays.toString(arr));
        int[] arrSorted2 = selectionSort(arr);
        System.out.println("arrSelectionSorted : " + Arrays.toString(selectionSort(arrSorted2)));
    }
}
