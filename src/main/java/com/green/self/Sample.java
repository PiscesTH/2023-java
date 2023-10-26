package com.green.self;

import java.util.Arrays;

public class Sample {
    public static void main(String[] args) {
        //home test
        int[] array = Solution.makeArr(Solution.getRandomLen());
        Solution s = new Solution();
        int answer = s.solution(array);
        System.out.println(answer);
    }
}

class Solution {
    public int solution(int[] array) {
        int answer = 0;
        int[] numCnt = new int[10];
        for (int i = 0; i < array.length; i++) {
            numCnt[array[i]]++;
        }
        int maxIdx = 0;
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] < numCnt[i]) {
                maxIdx = i;
            }
        }
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] == numCnt[i] && maxIdx != i) {
                return -1;
            }
        }
        System.out.println(Arrays.toString(numCnt));
        answer = maxIdx;
        return answer;
    }

    public static int getRandomLen() {
        return (int) (Math.random() * 10000);
    }

    public static int getRandomVal() {
        return (int) (Math.random() * 10);
    }

    public static int[] makeArr(int len) {
        int[] tmpArr = new int[len];
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = getRandomVal();
        }
        return tmpArr;
    }
}

