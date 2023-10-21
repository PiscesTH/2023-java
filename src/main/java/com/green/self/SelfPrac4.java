package com.green.self;

import java.util.Scanner;

public class SelfPrac4 {
    public static void main(String[] args) {
        Character c1 = new Character();
        System.out.println(c1.getInventory().getName());
        System.out.println(c1.getInventory().getCategory());

    }
}

class Forge {
    private final Scanner scan = new Scanner((System.in));
    private Item characterItem;


    public Forge(Character character) {
        characterItem = character.getInventory();
        System.out.printf("선택 된 장비 : %s\n", characterItem.getName());
    }

    public void startUpgrade() {
        System.out.printf("현재등급 : %d\n", characterItem.getGrade());
        System.out.print("Upgrade / Stop : ");
        String input = scan.nextLine();
        int tmpGrade = characterItem.getGrade();
        forge:
        while (true) {
            switch (input) {
                case "Upgrade":
                    int probability = (int) (Math.random() * 100) + 1; //1~100
                    if (probability > 90) {
                        tmpGrade += 2;
                    } else if (probability > 60) {
                        tmpGrade++;
                    } else if (probability <= 40) {
                        tmpGrade--;
                    }
                    characterItem.setGrade(tmpGrade);
                    if (tmpGrade < 0) {
                        System.out.printf("현재등급 : %d\n", tmpGrade);
                        System.out.println("실패");
                        return;
                    } else if (tmpGrade < 11) {
                        System.out.printf("현재등급 : %d\n", tmpGrade);
                        System.out.print("Upgrade / Stop : ");
                        input = scan.nextLine();
                        break;
                    }
                    System.out.printf("현재등급 : %d\n", tmpGrade);
                    System.out.println("성공");
                    return;
                case "Stop":
                    System.out.println("강화를 종료합니다.");
                    System.out.printf("최종등급 : %d\n", tmpGrade);
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    System.out.print("Upgrade / Stop : ");
                    input = scan.nextLine();
            }
        }
    }
}

class Character {
    private int money;
    private Item inventory;
    private final Scanner scan = new Scanner((System.in));

    public Character() {
        money = 3000;
        System.out.printf("""
                아래의 무기 중 하나를 선택해 주세요.
                (LongSword / ShortSword / Bow )
                입력창 :\s""");
        String input = scan.nextLine();
        while (true) {
            switch (input) {
                case "LongSword":
                    inventory = new LongSword();
                    return;
                case "ShortSword":
                    inventory = new ShortSword();
                    return;
                case "Bow":
                    inventory = new Bow();
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    input = scan.nextLine();
            }
        }
    }

    public Item getInventory() {
        return inventory;
    }
    public void goForge(){
        
    }
}

class Item {
    private String category, name;
    private int grade;

    public Item(String category) {
        this.category = category;
        grade = 1;
    }

    public void setGrade(int grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCategory() {
        return category;
    }

    public String getName() {
        return name;
    }

    public int getGrade() {
        return grade;
    }
}

class Sword extends Item {
    public Sword() {
        super("Sword");
    }
}

class LongSword extends Sword {
    public LongSword() {
        setName("LongSword");
    }
}

class ShortSword extends Sword {
    public ShortSword() {
        setName("ShortSword");
    }
}

class Bow extends Item {
    public Bow() {
        super("Bow");
        setName("Bow");
    }
}