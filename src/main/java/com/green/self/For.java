package com.green.self;

public class For {
    public static void main(String[] args) {
        for (int i = 2; i < 10; i++) {         //for ( 초기화 공간 ; 반복여부 체크 ; 증감식 ) 모두 비어있으면 무한 루프.
            System.out.printf("%d단\n",i);
            for (int j = 2; j < 10 ; j++){
                System.out.printf("%d x %d = %d\n", i, j, i * j);
            }
            System.out.println();
        }
    }
}
