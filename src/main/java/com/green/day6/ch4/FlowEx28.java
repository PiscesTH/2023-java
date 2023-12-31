package com.green.day6.ch4;

import java.util.Scanner;

public class FlowEx28 {
    public static void main(String[] args) {
        int input = 0;      //final 로 하면 성능에 더 좋다 ?
        int answer = (int) (Math.random() * 100) + 1;
        Scanner scan = new Scanner(System.in);
        /*
        while
        1~100 사이의 정수를 입력하세요 :
        정답 맞출때까지 up & down 출력
         */
        while (true) {
            System.out.print("1~100 사이의 정수를 입력하세요 : ");
            input = scan.nextInt();     //전역변수로 필요한게 아니면 변수 선언을 while 안에서 사용 가능.(권장? : 성능에 영향 적음)
            if (input == answer) {      //변수를 while 밖에서 선언했으면 while 끝나고도 사용 가능.
                break;
            }                           //else 없어도 됨.
            System.out.println(input > answer ? "Down" : "Up");
            //System.out.println(input == answer ? "끝" : (input > answer ? "Down" : "Up")); >> while 탈출 불가능.
        }
        System.out.printf("끝. answer : %d = input : %d", answer, input);
    }
}
