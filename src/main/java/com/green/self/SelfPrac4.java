package com.green.self;

import java.util.Scanner;

public class SelfPrac4 {
    public static void main(String[] args) {
        Character c1 = new Character();     //캐릭터 생성, 무기 선택
        c1.checkInventory();                //무기 확인
        c1.goForge();                       //대장간 입장 & 강화 시작

        Character c2 = new Character();     //캐릭터 생성, 무기 선택
        c2.checkInventory();                //무기 확인
        c2.goForge();                       //대장간 입장 & 강화 시작
    }
}

class Forge {
    private final Scanner scan = new Scanner((System.in));
    private static Item characterItem;
    private static Forge singleton;

    public Forge(Item item) {
        characterItem = item;
        System.out.printf("현재 장비 : %s\n", characterItem.getName());
    }

    public static Forge makeForge(Item item) {
        if (singleton == null) {
            singleton = new Forge(item);
        }
        characterItem = item;
        return singleton;
    }

    public void startUpgrade() {
        System.out.printf("현재 등급 : %d\n", characterItem.getGrade());
        System.out.print("Upgrade / Stop : ");
        String input = scan.nextLine();
        while (true) {
            switch (input) {
                case "Upgrade":
                    upgradeProbability(characterItem.getGrade());
                    if (characterItem.getGrade() < 0) {
                        System.out.printf("현재 등급 : %d\n", characterItem.getGrade());
                        System.out.println("장비 파괴");
                        return;
                    } else if (characterItem.getGrade() < 11) {
                        System.out.printf("현재 등급 : %d\n", characterItem.getGrade());
                        System.out.print("Upgrade / Stop : ");
                        input = scan.nextLine();
                        break;
                    }
                    System.out.printf("현재 등급 : %d\n", characterItem.getGrade());
                    System.out.println("성공");
                    return;
                case "Stop":
                    System.out.println("강화를 종료합니다.");
                    System.out.printf("최종 등급 : %d\n", characterItem.getGrade());
                    return;
                default:
                    System.out.println("다시 입력해주세요.");
                    System.out.print("Upgrade / Stop : ");
                    input = scan.nextLine();
            }
        }
    }

    public void upgradeProbability(int grade) {
        int probability = (int) (Math.random() * 100);
        if (probability >= 90) {
            grade += 2;
        } else if (probability >= 60) {
            grade++;
        } else if (probability < 40) {
            grade--;
        }
        characterItem.setGrade(grade);
    }
}

class Character {
    private Item inventory;
    private final Scanner scan = new Scanner((System.in));

    public Character() {
        System.out.print("""
                아래의 무기 중 하나를 선택해 주세요.
                (LongSword / ShortSword / Bow )
                입력창 :\s""");
        String input = scan.nextLine();
        select:
        while (true) {
            switch (input) {
                case "LongSword":
                    inventory = new LongSword();
                    break select;
                case "ShortSword":
                    inventory = new ShortSword();
                    break select;
                case "Bow":
                    inventory = new Bow();
                    break select;
                default:
                    System.out.println("다시 입력해주세요.");
                    input = scan.nextLine();
            }
        }
        System.out.printf("%s를 선택했습니다.\n", inventory.getName());
    }

    public void setInventory(Item inventory) {
        this.inventory = inventory;
    }

    public Item getInventory() {
        return inventory;
    }

    public void checkInventory() {
        System.out.printf("%s를 가지고 있습니다.\n", inventory.getName());
    }

    public void goForge() {
        System.out.println("위치 : 대장간");
        Forge forge = Forge.makeForge(inventory);
        if ("None".equals(inventory.getName())) {
            System.out.println("소지중인 장비가 없습니다.");
            return;
        }
        System.out.print("강화 시작 / 나가기 : ");
        String input = scan.nextLine();
        while (true) {
            switch (input) {
                case "강화 시작":
                    forge.startUpgrade();
                    if (inventory.getGrade() < 0) {
                        inventory.setName("None");
                        inventory.setCategory("None");
                        return;
                    }
                    if (inventory.getGrade() > 10) {
                        return;
                    }
                    goForge();
                case "나가기":
                    System.out.println("밖으로 나갑니다.");
                    return;
                default:
                    System.out.print("다시 입력해 주세요.");
                    input = scan.nextLine();
            }
        }
    }
}

class Item {
    private String category, name;
    private int grade;

    public Item(String category) {
        this.category = category;
        grade = 1;
        name = "None";
    }

    public void setCategory(String category) {
        this.category = category;
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