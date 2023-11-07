package com.green.self;

import java.util.Arrays;

public class SelfPrac17 {
    public static void main(String[] args) {

    }
}

class Solution17{
    public int solution(int[][] sizes){
        int[][] tmpArr = new int[sizes.length][sizes[0].length];
        for (int i = 0; i < sizes.length; i++) {
            System.arraycopy(sizes[i], 0, tmpArr[i], 0, sizes[0].length);
            Arrays.sort(tmpArr[i]);
        }
        int max1 = tmpArr[0][0];
        int max2 = tmpArr[0][1];
        for (int i = 0; i < tmpArr[0].length; i++) {
            for (int j = 0; j < tmpArr.length; j++) {

            }
        }
        return 0;
    }
}