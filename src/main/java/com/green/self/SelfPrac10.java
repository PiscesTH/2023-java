package com.green.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfPrac10 {
    public static void main(String[] args) {
        int[] arr = {-1, 1, -7, 3, -2, 4, 2};
        Sort sort = new Sort(arr);


        //배열로 >> -1 1 -7 3 -2 4 2 ans: -1 -7 -2 1 3 4 2.
    }
}

class Sort {
    private int[] resultArr;

    public Sort(int[] arr) {
        resultArr = Arrays.copyOf(arr, arr.length);
        System.out.println(Arrays.toString(resultArr));
    }

    public int[] getResultArr() {
        return resultArr;
    }

    public int removeArr(int idx) {
        int[] tmpArr = new int[resultArr.length - 1];
        int tmp = tmpArr[idx];
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = i < idx ? resultArr[i] : resultArr[i + 1];
        }
        resultArr = tmpArr;
        System.out.println(Arrays.toString(resultArr));
        return tmp;
    }

    public int selectIdx(int[] arr) {
        int minIdx = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]) {
                minIdx = i;
            }
        }
        return minIdx;
    }
}