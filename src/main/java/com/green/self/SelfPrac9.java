package com.green.self;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SelfPrac9 {
    public static void main(String[] args) {
        baskinrobbinsGame game = new baskinrobbinsGame();
        game.startGame();
    }
}

class baskinrobbinsGame {
    private final List<Integer> list;
    private int count;
    public final int CALL_MAX;

    public baskinrobbinsGame() {
        CALL_MAX = 3;
        count = 1;
        list = new ArrayList<>();

    }

    public int getRandomNum() {
        return (int) (Math.random() * CALL_MAX) + 1;
    }

    public void callNumber(int input) {
        list.add(input);
        count++;
        System.out.printf("count = %d\n", count);
    }

    public void userTurn() {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 1 ~ 3 개 입력 해 주세요.");
        System.out.printf("현재 숫자 %d : ", list.get(list.size() - 1));
        int input = scan.nextInt();
        while (input != count) {
            System.out.print("다시 입력 해 주세요. : ");
            input = scan.nextInt();
        }
        callNumber(input);
        for (int i = 1; i < CALL_MAX; i++) {
            System.out.print("입력을 종료하려면 0 을 입력해주세요. : ");
            input = scan.nextInt();
            if (input == 0) {
                break;
            } else if (input != count) {
                System.out.println("다시 입력 해 주세요.");
                i--;
                continue;
            }
            callNumber(input);
        }
    }

    public void computerTurn() {
        int[] tmpArr = new int[getRandomNum()];
        for (int i = 0; i < tmpArr.length; i++) {
            list.add(count);
            System.out.printf("Computer : %d\n", count++);
        }
    }

    public void startGame() {
        System.out.println("Computer turn");
        computerTurn();
        if (count > 31) {
            System.out.println("Computer 패배");
            return;
        }
        System.out.println("User turn");
        userTurn();
        if (count > 31) {
            System.out.println("User 패배");
            return;
        }
        startGame();
    }
}