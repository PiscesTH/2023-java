package com.green.day9.ch5;

import com.sun.security.jgss.GSSUtil;

import java.util.Arrays;

public class ArrayEx11Sol {
    public static void main(String[] args) {
        final int LEN = 10;
        int[] numArr = new int[LEN];
        int[] cntArr = new int[LEN];
        /*
        numArr 각 방에 0~9 사이의 랜덤값을 대입.(중복 허용)
        numarr 각 방의 값 출력
        cntArr 의 0번 방은 0의 개수, 1번 방은 1의 개수 count값을 넣는다.
        0~9의 개수를 출력
        [4, 4, 4, 6, 5, 7, 9, 7, 5, 3]
        0의 개수 : 0 / 1의 개수 : 0 ... 4의 개수 : 3 / 5의 개수 : 2....
         */
        for (int i = 0; i < LEN; i++) {   //LEN(짧은거) 사용하면 용량에 유리함.
            //int random = (int) (Math.random() * LEN);
            numArr[i] = (int) (Math.random() * LEN);
            //cntArr[numArr[i]]++;
        }
        System.out.println("numArr");
        System.out.println(Arrays.toString(numArr));    //단위 테스트. >> 중간 단계에서 점검
        //설명할 땐 배열 출력해서 하는게 편할듯 ?

        /*
        for (int i = 0; i < cntArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (i == numArr[j]){
                    cntArr[i]++;
                }
            }
        }
        */                  //어렵게 푼 방식..

        for (int i = 0; i < LEN; i++) {
            //int val = numArr[i];   따로 변수를 설정해도 되고 바로 써도 되고.
            cntArr[numArr[i]]++;
        }
        System.out.println("cntArr");
        System.out.println(Arrays.toString(cntArr));
    }
}
