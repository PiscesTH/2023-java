package com.green.self;

import java.util.Arrays;

public class SelfPrac12 {
    public static void main(String[] args) {
        //최빈값 구하기
        int[] arr = {1, 5, 6, 7, 8, 6, 4, 5};
        ManyTimes m = new ManyTimes();
        m.countNum(arr);
        int maxIdx = m.getIdx();
        int answer = m.checkMaxnum(maxIdx);
        System.out.printf("answer = %d\n", answer);
    }
}

class ManyTimes {
    int[] numCnt;

    public ManyTimes() {
        numCnt = new int[10];
    }

    public void countNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            numCnt[arr[i]]++;
        }
    }

    public int getIdx() {
        int maxIdx = 0;
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] < numCnt[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public int checkMaxnum(int maxIdx) {
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] == numCnt[i] && maxIdx != i) {
                return -1;
            }
        }
        return maxIdx;
    }
}
