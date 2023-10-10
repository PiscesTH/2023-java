package com.green.day9.ch5;

import java.util.Arrays;

public class ArrayEx12 {
    public static void main(String[] args) {
        String[] names = {"Kim", "Park", "Yi"};     //각 배열의 값이 String 타입인 배열(길이 3)

        for (int i = 0; i < names.length; i++) {
            System.out.printf("names[%d] : %s\n", i, names[i]);
        }

        names[1] = "Woo";
        names[2] += " Woo";
        System.out.println(Arrays.toString(names));
        System.out.println("---------------------------enhanced for");
        for (String str : names) {       //enhanced for 문 혹은 for each 문  >> for 문 줄여서 쓰는 법. 배열이면 사용 가능.
            System.out.println(str);    //index 따로 출력 안 할 때 사용하는 편. i++ 로 index 출력은 가능하지만...
        }
        System.out.println("---------------------------for");
        for (int i = 0; i < names.length; i++) {        //위에 for 문 풀어서 썼을 때.
            String str = names[i];                      //index 따로 출력 할 땐 for 문 사용.
            System.out.printf("names[%d] : %s\n", i, str);
        }
    }
}