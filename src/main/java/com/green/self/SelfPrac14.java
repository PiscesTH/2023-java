package com.green.self;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class SelfPrac14 {
    public static void main(String[] args) {
        String s = "-1 -2 -3 -4";
        Solution sol = new Solution();
        String result = sol.getStr(s);
        System.out.println(result);
    }
}

/*
문자열 s에는 공백으로 구분된 숫자들이 저장되어 있습니다. str에 나타나는 숫자 중 최소값과 최대값을 찾아 이를
"(최소값) (최대값)"형태의 문자열을 반환하는 함수, solution을 완성하세요.
예를들어 s가 "1 2 3 4"라면 "1 4"를 리턴하고, "-1 -2 -3 -4"라면 "-4 -1"을 리턴하면 됩니다.
 */
class Solution {
    private List<Integer> list;

    public Solution() {
        list = new ArrayList<>();
    }

    public String getStr(String s) {
        String[] arr = s.split(" ");
        for (String string : arr) {
            list.add(Integer.parseInt(string));
        }
        list.sort(Comparator.naturalOrder());
        return String.format("%d %d", list.get(0), list.get(list.size() - 1));
    }
}