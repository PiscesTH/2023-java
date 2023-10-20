package com.green.self;

import java.util.Scanner;

public class SelfPrac4 {
    public static void main(String[] args) {
        int grade = 1;
        Scanner scan = new Scanner(System.in);
        System.out.printf("현재등급 : %d\n", grade);
        System.out.print("Upgrade / Stop : ");
        String input = scan.nextLine();
        forge:
        while (true) {
            switch (input) {
                case "Upgrade":
                    int probability = (int) (Math.random() * 100) + 1; //1~100
                    if (probability > 90) {
                        grade += 2;
                    } else if (probability > 60) {
                        grade++;
                    } else if (probability <= 40) {
                        grade--;
                    }
                    if (grade < 0) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.println("실패");
                        break forge;
                    } else if (grade < 11) {
                        System.out.printf("현재등급 : %d\n", grade);
                        System.out.print("Upgrade / Stop : ");
                        input = scan.nextLine();
                        break;
                    }
                    System.out.printf("현재등급 : %d\n", grade);
                    System.out.println("성공");
                    break forge;
                case "Stop":
                    System.out.println("강화를 종료합니다.");
                    System.out.printf("최종등급 : %d\n", grade);
                    break forge;
                default:
                    System.out.println("다시 입력해주세요.");
                    System.out.print("Upgrade / Stop : ");
                    input = scan.nextLine();
                    break;
            }
        }
    }
}

class Forge{
    public Forge(Item item){

    }
}

class User{
    private int money;
}
class Item{
    private String category, name;
    private int grade;
    private int probability;

    public Item(String category){
        this.category = category;
        grade = 1;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getCategory(){
        return category;
    }
    public String getName(){
        return getName();
    }
    public int getGrade(){
        return grade;
    }
}

class Sword extends Item{
    public Sword(){
        super("Sword");
    }
}
class LongSword extends Sword{
    public LongSword(){
        setName("LongSword");
    }
}
class ShortSword extends Sword{
    public ShortSword(){
        setName("ShortSword");
    }
}
class Bow extends Item{
    public Bow(){
        super("Bow");
        setName("Bow");
    }
}