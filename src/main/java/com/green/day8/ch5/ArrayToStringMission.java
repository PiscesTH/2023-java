package com.green.day8.ch5;

import java.util.Arrays;

public class ArrayToStringMission {
    public static void main(String[] args) {
        int[] arr = {5, 10, 7, 3, 8, 54, 33};
        System.out.println(Arrays.toString(arr));
        //for문을 활용하여 위와 같은 결과 출력.
        int lenCal = arr.length - 1;
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            //if (i == arr.length - 1) {
            if (i == lenCal) {
                System.out.printf("%d]\n", arr[i]);
                break;
            }
            System.out.printf("%d,\s", arr[i]);
        }
        System.out.println("----------------------sol");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i < lenCal) {
                System.out.printf("%d, ", arr[i]);
            } else {
                System.out.printf("%d", arr[i]);
            }
        }
        System.out.println("]");
        System.out.println("----------------------sol2");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i < lenCal ? arr[i] + ", " : arr[i]);
        }
        System.out.println("]");
        System.out.println("----------------------sol3");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i != lenCal) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
        System.out.println("----------------------sol4");

        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            if (i != 0) {
                System.out.print(", ");
            }
            System.out.print(arr[i]);
        }
        System.out.println("]");
        System.out.println("----------------------sol5");

        System.out.printf("[%d", arr[0]);
        for (int i = 1; i < arr.length; i++) {
            System.out.printf(", %d", arr[i]);
        }
        System.out.println("]");
    }
}
