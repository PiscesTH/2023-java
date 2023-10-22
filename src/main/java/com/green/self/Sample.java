package com.green.self;

class SampleTest{
    private SampleTest(){}

    public static SampleTest makeClass(){
        return new SampleTest();
    }
}


public class Sample {
    public static void main(String[] args) {
        //home test
        SampleTest sp = SampleTest.makeClass();
    }
}
