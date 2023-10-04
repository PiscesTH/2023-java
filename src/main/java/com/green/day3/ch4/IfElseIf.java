package com.green.day3.ch4;

public class IfElseIf {
    public static void main(String[] args) {
        if (1==1){                      //if 와 else if 는 같은 그룹
            System.out.println("1");    //조건을 처음으로 만족하는 if문(or esle if문)을 실행하고 매서드를 빠져나온다.
        } else if (2==2){               //그룹이 아닌 별개의 if문은 동시에 실행될 가능성이 있다.
            System.out.println("2");
        } else if (3==3){
            System.out.println("3");
        }else{
            System.out.println("else");
        }
    }
}
