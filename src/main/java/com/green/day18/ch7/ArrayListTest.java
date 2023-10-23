package com.green.day18.ch7;

import com.green.day14.ch6.Card;

import java.util.ArrayList;
import java.util.List;
// import java.util.*;      하나로 import 가능

public class ArrayListTest {
    public static void main(String[] args) {
        List list = new ArrayList();    //상속관계.  Object 타입으로 저장. 내부에서는 배열이용
        list.add(10);                   //리스트에 넣을때
        list.add(10.3f);                //Object 도 주소값만 저장 가능. 기본형 >> 래퍼클래스로 자동으로 형변환 하고 저장.
        list.add(10.3d);                // ex) int >> Integer
        list.add(10L);
        list.add("dsa");
        list.add(new Card());

        Object val1 = list.get(0);      //Object 타입으로 빼고
        int n1 = (int)val1;             //형변환 해야 사용 가능. 그냥은 무슨 타입인지 모르기에

        float n2 = (float) list.get(1); //
    }
}

class ArrayListTest2{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList();   //int의 reference 타입 : Integer. 서로 동일하게 사용 가능. == >> true p.491
        //제네릭스  < > 안에는 reference 타입만 가능. int 등 불가능
        list.add(10);   //Integer만 가능. 다른 타입 저장 불가.
        list.add(20);
        list.add(30);
        boolean b = list.add(45);   //실제로는 return method
        /*
        list.add(10.3f);
        list.add(10.3d);
        list.add(10L);
        list.add("dsa");
        list.add(new Card());
        */
        int val = list.get(0);  //제네릭스로 타입이 정해져서 가능. get method도 제네릭스로 리턴타입 결정됨.
        System.out.println(list.size());        //내부 생성 배열 길이

        for (int i = 0; i < list.size(); i++) {
            System.out.printf("[%d] : %d\n",i,list.get(i));
        }
        System.out.println("-----------------");
        for (int num : list) {
            System.out.println(num);
        }
    }
}

class ArrayListTest3{
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        System.out.println(list.size());
        list.add(10);
        list.add(20);
        list.add(30);
        list.add(40);
        System.out.println(list.toString());
        list.add(1,100);    //1번방 100 삽입, 기존 값 뒤로 밀림.
        System.out.println(list);
        list.add(3,70);
        System.out.println(list);

        list.remove(0);             //0번 방 삭제, 배열 크기 조정
        System.out.println(list);
    }
}