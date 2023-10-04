package com.green.day2.ch3;

public class OperaterEx16 {
    public static void main(String[] args) {
        float pi = 3.141592f;
        System.out.println(pi);

        int pro1 = (int)(pi * 1000);
        System.out.println("pro1 : " + pro1);

        float pro2 = pro1 * 0.001f; // or / 1000f;
        System.out.println("pro2 : "+ pro2);

        System.out.println("pi : "+(int)(pi * 1000)*0.001f);

        System.out.print("==================\n");

        System.out.printf("%.3f\n",pi);
        System.out.printf("%.3f",Math.floor(1000*pi)*0.001);

    }
}
