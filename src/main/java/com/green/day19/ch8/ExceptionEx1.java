package com.green.day19.ch8;

public class ExceptionEx1 {
    public static void main(String[] args) {    //try - catch
        int num = 0;
        //num = num / 0;                          //try - catch 밖에서 에러가 생기면 프로그램 작동 중지.
        try {                                     //try { 에러 예상 되는 코드 }
            num = 10;
            num = num / 0;                        //에러 만나도 예외처리 하고 계속 작동함
        } catch (Exception e) {                   //catch { 에러(예외) 발생하면 실행되는 부분 }
            e.printStackTrace();                  //예외 종류 확인.
            System.out.println("예외 발생");
            num = -1;
        } finally {                               //없어도 작동함. 에러 유무 상관없이 반드시 실행된다.
            System.out.println("finally 실행");
        }
        System.out.printf("num : %d\n", num);
        System.out.println("--------------");
    }
}

class ExceptionEx1_2 {
    public static void main(String[] args) {    //try - catch
        int num = 0;
        //num = num / 0;                          //try - catch 밖에서 에러가 생기면 프로그램 작동 중지.
        try {                                    //try { 에러 예상 되는 코드 }
            num = 10;
            return;                                //에러 만나도 예외처리 하고 계속 작동함
        } catch (Exception e) {                   //catch { 에러(예외) 발생하면 실행되는 부분 }
            e.printStackTrace();                  //예외 종류 확인.
            System.out.println("예외 발생");
            num = -1;
        } finally {                              //없어도 작동함. 에러 유무 상관없이 반드시 실행된다.
            System.out.println("finally 실행");   //return 만나면 finally 가 실행된다. 그 후에 종료.
        }
        System.out.printf("num : %d\n", num);
        System.out.println("--------------");
    }
}

class ExcetptionEx1_3 {
    public static void main(String[] args) {
        try {
            ExcetptionEx1_3 obj = null;         //예외가 발생하면 try 안에 남은 코드는 실행 X
            obj.sum();
            int[] arr = new int[10];
            arr[10] = 10;
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {  //멀티 catch 블럭. 여러 예외 처리 가능
            e.printStackTrace();            //예외가 발생하면 예외 메시지 출력
            System.out.println("수학적 예외");
        } catch (NullPointerException e) {      //특정한 예외 발생하면 실행
            System.out.println("널포인트 예외");
        } catch (Exception a) {
            System.out.println("모든 예외");     //모든 예외ㅇ
        }
        System.out.println("End");
    }

    void sum() {
    }
}