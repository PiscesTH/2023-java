package com.green.day4.ch4;

public class Switch {
    public static void main(String[] args) {
        int val = 1;
        switch (val) {
            case 1:
                System.out.println("1");
                //break;                      //break를 만나면 switch문을 빠져나온다. 없으면 아래로 계속 실행.
            case 2:
                System.out.println("2");
                break;
            //default:  가능
            case 3:
                System.out.println("3");
                break;
            default:                            //default 는 순서 상관 없이 들어갈 수 있다. 밑에 있을 필요 x
                System.out.println("1~3이 아니다.");    //break 없어도 됨.

        }
    }
}
