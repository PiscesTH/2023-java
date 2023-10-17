package com.green.self;

import java.util.Random;

class SampleTest{
    SampleTest(int x){}
}


public class Sample {
    public static void main(String[] args) {
        //home test
        int[] arr = {10};
        System.out.println(arr[0]);
        arr[0]= 1000;

        SampleTest test = new SampleTest(5);
    }
}
