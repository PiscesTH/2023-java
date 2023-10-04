package com.green.day3.ch4;

import java.util.Scanner;

public class OperaterEx32Mission {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("숫자를 입력해주세요 : ");
        int n = scan.nextInt();
        //System.out.println(n);    >> -10
        //System.out.println(-n);   >>  10
        //n이 음수라면 양수로, 양수라면 그대로 출력
        System.out.printf("%d\n",n >= 0 ? n : -n);
        System.out.println(n >= 0 ? n : -n); //아래식으로 조금 더 간단하게 만들 수 있다.
    }
}
/*
if(n<0){
    System.out.print(-n);
    }else{
    Sustem.out.print(n);
    }
 */