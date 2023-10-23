package com.green.day18.ch7;

import java.util.Arrays;
import java.util.Scanner;

public class NumberBaseballGame {
    public static void main(String[] args) {
        NumberBaseball game = new NumberBaseball(3);
        game.start();
        game.getUserInput();
    }
}

class NumberBaseball {
    private final int GAME_COUNT;
    private final int[] gameNumbers;    //주소값을 못바꿈. 배열의 내용은 변경 가능.
    private final int MAX_NUM = 10;

    public NumberBaseball(int count) {
        GAME_COUNT = count;
        gameNumbers = new int[count];
    }


    public void start() {
        setRandomNumNotDuplicate();
        System.out.println(Arrays.toString(gameNumbers));
    }

    private boolean isContinueCheckResult(int[] arr) {
        int strike = 0, ball = 0, out;
        for (int i = 0; i < gameNumbers.length; i++) {
            for (int z = 0; z < arr.length; z++) {
                if (gameNumbers[i] == arr[z]) {
                    if (i == z) {
                        strike++;
                    } else {
                        ball++;
                    }
                }
            }
        }
        out = GAME_COUNT - (strike + ball);
        System.out.printf("strike : %d, ball : %d, out : %d\n", strike, ball, out);

        return false;
    }

    public void getUserInput() {
        Scanner scan = new Scanner(System.in);
        int[] userArr = new int[GAME_COUNT];
        for (int i = 0; i < GAME_COUNT; i++) {
            System.out.printf("%d 숫자 >> ", i + 1);
            userArr[i] = scan.nextInt();
        }

        boolean r = isContinueCheckResult(userArr);
        scan.close();
    }

    public void setRandomNumNotDuplicate() {
        for (int i = 0; i < gameNumbers.length; i++) {
            int random = (int) (Math.random() * MAX_NUM);
            gameNumbers[i] = random;
            for (int j = 0; j < i; j++) {
                if (gameNumbers[i] == gameNumbers[j]) {
                    i--;
                    break;
                }
            }
        }
    }
}