package com.green.self;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SelfPrac16 {
    public static void main(String[] args) {

    }
}
/*
정수를 저장한 배열, arr 에서 가장 작은 수를 제거한 배열을 리턴하는 함수, solution을 완성해주세요.
 단, 리턴하려는 배열이 빈 배열인 경우엔 배열에 -1을 채워 리턴하세요. 예를들어 arr이 [4,3,2,1]인 경우는 [4,3,2]를 리턴 하고,
 [10]면 [-1]을 리턴 합니다.
 */
class Solution16 {
    public int[] solution(int[] arr) {
        if (arr.length == 1){
            arr[0] = -1;
            return arr;
        }
        int minIdx = 0;
        for (int i = 1; i < arr.length; i++) {
            if (arr[minIdx] > arr[i]){
                minIdx = i;
            }
        }
        int[] resultArr = new int[arr.length -1];
        for (int i = 0; i < resultArr.length; i++) {
            resultArr[i] = i < minIdx ? arr[i] : arr[i+1];
        }
        return resultArr;
    }
}