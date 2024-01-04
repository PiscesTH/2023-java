package com.green.day68.ch14;

interface Test{
    int sumAll(int x, int y);
}
public class MyTest {
    public static void main(String[] args) {
        TestUtils utils = new TestUtils();
        Test test = utils::sum;
        Test test2 = (x, y) -> {
            x = x + y;
            return utils.sum(x,y);
        };
        int result = test2.sumAll(7,5);
        System.out.println("result = " + result);
    }
}

class TestUtils{
    public int sum(int x, int y){
        return x + y;
    }
}
