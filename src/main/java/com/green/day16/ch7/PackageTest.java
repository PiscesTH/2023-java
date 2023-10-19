package com.green.day16.ch7;

import static com.green.day13.ch6.MyMath2.print;
import static com.green.day13.ch6.MyMath2.sNum;
import com.green.day15.ch7.*;

public class PackageTest {
    public static void main(String[] args) {
        Parent parent;                      //import 하고 사용
        com.green.day15.ch7.Parent parent2; //import 없이 사용
        //import com.green.day15.ch7.* ;  >>ch7 패키지 내에 있는거 전부 import
        //하위 패키지가 있다면 하위 패키지에는 영향 X >>사용 불가

        print(); //MyMath2 에 있는 메소드를 바로 사용하기 위해 import static 사용
        sNum = 10; //MyMath2 에 있는 멤버필드를 바로 사용하기 위해 import static 사용
    }
}
