package com.green.self;

public class SelfPrac12 {
    public static void main(String[] args) {
        /*
        최빈값 구하기문제 설명
        최빈값은 주어진 값 중에서 가장 자주 나오는 값을 의미합니다. 정수 배열 array가 매개변수로 주어질 때,
        최빈값을 return 하도록 solution 함수를 완성해보세요. 최빈값이 여러 개면 -1을 return 합니다.
        제한사항
        0 < array의 길이 < 100
        0 ≤ array의 원소 < 1000
        */
        int[] array = ManyTimes.makeArr();
        ManyTimes m = new ManyTimes();
        m.countNum(array);
        int maxIdx = m.getMaxIdx();
        int answer = m.checkMaxnum(maxIdx);
        System.out.printf("answer = %d\n", answer);
    }
}

class ManyTimes {
    int[] numCnt;

    public ManyTimes() {
        numCnt = new int[1000];
    }

    public void countNum(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            numCnt[arr[i]]++;
        }
    }

    public int getMaxIdx() {
        int maxIdx = 0;
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] < numCnt[i]) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public static int getRandomLen() {
        return (int) (Math.random() * 99) + 1;
    }

    public static int getRandomVal() {
        return (int) (Math.random() * 1000);
    }

    public int checkMaxnum(int maxIdx) {
        for (int i = 0; i < numCnt.length; i++) {
            if (numCnt[maxIdx] == numCnt[i] && maxIdx != i) {
                return -1;
            }
        }
        return maxIdx;
    }
    public static int[] makeArr() {
        int[] tmpArr = new int[getRandomLen()];
        for (int i = 0; i < tmpArr.length; i++) {
            tmpArr[i] = getRandomVal();
        }
        return tmpArr;
    }
}
