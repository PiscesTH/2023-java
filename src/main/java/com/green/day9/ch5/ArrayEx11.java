package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx11 {
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
        for (int i = 0; i < numArr.length; i++) {   //LEN(짧은거) 사용하면 용량에 유리함.
            int random = (int) (Math.random() * numArr.length);
            numArr[i] = random;
            cntArr[numArr[i]]++;    // >> for 문 분리해서 사용하는걸 권장. 하나의 for문 안에서는 한가지 작업만 하는게 좋다. Sol 참고.
                                    //분리하면 재사용이 쉬워짐.(메소드 단위로 사용)
        }
        System.out.println(Arrays.toString(numArr));

        /*
        for (int i = 0; i < cntArr.length; i++) {
            for (int j = 0; j < numArr.length; j++) {
                if (i == numArr[j]){
                    cntArr[i]++;
                }
            }
        }
        */                  //어렵게 푼 방식..
        System.out.println(Arrays.toString(cntArr));
    }
}
