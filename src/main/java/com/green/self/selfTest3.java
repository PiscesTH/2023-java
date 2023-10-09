package com.green.self;

import java.util.Arrays;
import java.util.stream.IntStream;

public class selfTest3 {
    public static void main(String[] args) {
        /*
        1 ~ 10 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 2520입니다.
        그러면 1 ~ 20 사이의 어떤 수로도 나누어 떨어지는 가장 작은 수는 얼마입니까?
         */
        int x = 2520;
        //int[] arr = new int[20];
        //arr = IntStream.range(1, 21).toArray();
        while (true) {
            x += 2520;
            if (x % 11 == 0 && x % 12 == 0 && x % 13 == 0 && x % 14 == 0 && x % 15 == 0
                    && x % 16 == 0 && x % 17 == 0 && x % 18 == 0 && x % 19 == 0) {       //이걸 여러개를 처리하는 방법... 수동으로 해야 할 듯 ?
                break;
            }
        }
        System.out.println("1부터 20까지의 어떤 수로도 나누어 떨어지는 가장 작은 수: " + x);
    }
}