package com.green.day4.ch4;

public class RandomValMission {
    public static void main(String[] args) {
        //5~10 나오게.
        /*
        System.out.println((Math.random()*10+1));
        System.out.println(10-((Math.random()*10+1)%5));
        */
        int rVal = (int) (Math.random() * 6) + 5;//
        System.out.println("rVal : " + rVal);

        //14~23
        int rVal2 = (int) (Math.random() * 10) + 14;
        System.out.println("rVal2 : " + rVal2);
    }
}
