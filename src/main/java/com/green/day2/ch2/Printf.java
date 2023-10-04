package com.green.day2.ch2;

public class Printf {
    public static void main(String[] args){
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("Hi");
        System.out.println("------------");
        System.out.print("Hello");
        System.out.print("Hello");
        System.out.print("Hello\n");
        System.out.println("------------");
        System.out.print("Halo\n");  //    \n : 이스케이프(줄넘기기)
        System.out.print("Halo\n");
        System.out.print("Halo\n");
        System.out.println("------------");

        String name = "홍길동";
        int age = 23;
        char bloodType = 'B';
        float height = 178.8f;

        //제 이름은 홍길동이고, 나이는 23세이고, 혈액형은 B형이고, 키는 178.8입니다.   - 목표
        System.out.printf("제 이름은 "+name+"이고, 나이는 "+age+"이고, 혈액형은 "
                +bloodType+"이고, 키는 "+height+"cm입니다.\n");  //중간에 enter 가능.
        System.out.printf("제 이름은 %s이고, 나이는%3d이고, 혈액형은 %c이고, 키는 %.3fcm입니다.\n"
                ,name,age,bloodType,height);
                                                //%5d : 5칸 안에 입력



        System.out.printf("제 이름은 %s이고, 나이는%s이고, 혈액형은 %s이고, 키는 %scm입니다.\n"
                ,name,age,bloodType,height);


    }
}
