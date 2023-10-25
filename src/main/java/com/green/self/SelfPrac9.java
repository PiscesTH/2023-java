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
    private List<Integer> list;
    private int count;
    public final int CALL_MAX;

    public baskinrobbinsGame() {
        CALL_MAX = 3;
        count = 1;
        list = new ArrayList<>();
        System.out.println("입력창 안내 >> 정수만 입력해주세요.");

    }

    public int getRandomNum() {
        return (int) (Math.random() * CALL_MAX) + 1;
    }

    public void callNumber(int input) {
        list.add(input);
        count++;
    }

    public void userTurn() throws Exception {
        Scanner scan = new Scanner(System.in);
        System.out.println("숫자를 1 ~ 3 개 입력 해 주세요.");
        System.out.printf("현재 숫자 %d : ", list.get(list.size() - 1));
        int input = scan.nextInt();
        while (input != count) {
            System.out.print("다시 입력 해 주세요. : ");
            System.out.printf("현재 숫자 %d : ", list.get(list.size() - 1));
            input = scan.nextInt();
        }
        callNumber(input);
        if (checkNum()) {
            return;
        }
        for (int i = 1; i < CALL_MAX; i++) {
            System.out.printf("현재 숫자 %d / ", list.get(list.size() - 1));
            System.out.print("입력을 종료하려면 0 을 입력해주세요 : ");
            input = scan.nextInt();
            if (input == 0) {
                break;
            } else if (input != count) {
                System.out.println("다시 입력 해 주세요.");
                i--;
                continue;
            }
            callNumber(input);
            if (checkNum()) {
                return;
            }
        }
    }

    public void computerTurn() {
        for (int i = 0; i < getRandomNum(); i++) {
            list.add(count);
            System.out.printf("Computer : %d\n", count++);
            if (checkNum()) {
                return;
            }
        }
    }

    public void startGame() {
        System.out.println("Computer turn");
        computerTurn();
        if (checkNum()) {
            System.out.println("Computer 패배");
            return;
        }
        System.out.println("User turn");
        try {
            userTurn();
        } catch (Exception e) {
            System.out.println("정수 외의 값을 입력하여 게임이 종료됩니다.");
            System.out.println("게임을 다시 시작해주세요.");
            count = 0;
            list = new ArrayList<>();
            return;
        }
        if (checkNum()) {
            System.out.println("User 패배");
            return;
        }
        startGame();
    }

    public boolean checkNum() {
        return list.size() > 30;
    }
}