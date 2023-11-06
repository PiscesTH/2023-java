package com.green.self;

public class SelfPrac15 {
    public static void main(String[] args) {
        String s = "1                     a                              w                  qwd           s";
        S15 s15 = new S15();
        String result = s15.solution(s);
        System.out.println(result);
    }
}
/*
JadenCase란 모든 단어의 첫 문자가 대문자이고, 그 외의 알파벳은 소문자인 문자열입니다.
단, 첫 문자가 알파벳이 아닐 때에는 이어지는 알파벳은 소문자로 쓰면 됩니다. (첫 번째 입출력 예 참고)
문자열 s가 주어졌을 때, s를 JadenCase로 바꾼 문자열을 리턴하는 함수, solution을 완성해주세요.

제한 조건
s는 길이 1 이상 200 이하인 문자열입니다.
s는 알파벳과 숫자, 공백문자(" ")로 이루어져 있습니다.
숫자는 단어의 첫 문자로만 나옵니다.
숫자로만 이루어진 단어는 없습니다.
공백문자가 연속해서 나올 수 있습니다.
 */

class S15 {
    public String solution(String s) {
        String[] arr = s.split(" ");
        for (int i = 0; i < arr.length; i++) {
            if ("".equals(arr[i])) {
                continue;
            }
            arr[i] = arr[i].toUpperCase().charAt(0) +
                    arr[i].substring(1).toLowerCase();
        }
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < arr.length; i++) {
            sb.append(" ");
            sb.append(arr[i]);
        }
        return sb.toString().trim();
    }
}