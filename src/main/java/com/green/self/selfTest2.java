package com.green.self;

public class selfTest2 {
    public static void main(String[] args) {
        /*
        피보나치(Fibonacci) 수열의 각 항은 바로 앞의 항 두 개를 더한 것입니다. 1과 2로 시작하는 경우 이 수열은 아래와 같습니다.
        1, 2, 3, 5, 8, 13, 21, 34, 55, 89, ...
        4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더하면 얼마가 됩니까?
         */
        int f1 = 1, f2 = f1 + 1, f3, fLast = 0;
        int sum = 0;
        final int TARGET = 4000000;
        while (f1 <= TARGET) {
            if (f1 % 2 == 0) {
                sum += f1;
                fLast = f1;
            }
            f1 += f2;
            f3 = f1;
            f1 = f2;
            f2 = f3;
        }
        System.out.printf("4백만 이하의 짝수 값을 갖는 모든 피보나치 항을 더한 값 = %s\n", sum);
        System.out.println("마지막으로 더해진 값 = " + fLast);
        System.out.println("마지막 피보나치 수열 값 = " + f1);
    }
}

//4 백만 이하의 짝수 값을 갖는 모든 피보나치 항의 합은: 4613732
//마지막 값 두 개는 3524578와 5702887 ( fLast 와 f1 )
//3524578의 앞의 값은 ? >> 832040
// TARGET 보다 약간 작은 값을 fLast값으로 주면 구할 수 있다. 그 이외의 방법이 있는지는 아직 모르겠음.
