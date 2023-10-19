package com.green.day16.ch7;

public class Time {
    public final static int MIN_HOUR = 0;
    public final static int MAX_HOUR = 23;
    private int hour, minute, second;

    //1.생성자를 이용하여 private 변수에 값 지정
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }

    //2. setter method를 이용하여 private 변수에 값 지정
    //setter method 에는 규칙이 있음. 변수 하나당 setter 하나 작성. public void set변수이름(){} 으로.
    public void setHour(final int hour) {     //파라미터 에는 final 붙이면 빨라질 수도 있음.
        this.hour = hour;
        if (hour > MAX_HOUR) {         //변수선언 해서 쓰면 좋을지도.
            this.hour = MAX_HOUR;
        } else if (hour < MIN_HOUR) {
            this.hour = MIN_HOUR;
        }
    }

    public void setMinute(int minute) {
        this.minute = minute;
    }

    public void setSecond(int second) {
        this.second = second;
    }

    public int getHour() {
        return hour;
    }

    public int getMinute() {
        return minute;
    }

    public int getSecond() {
        return second;
    }

    @Override
    public String toString() {
        return String.format("%02d시 %02d분 %02d초\n", hour, minute, second);
    }
}

class TimeTest {
    public static void main(String[] args) {
        Time time = new Time(10, 5, 5);
        //time.hour = 10;  private이라 다른 클래스에서 호출 불가능
        time.setMinute(3);
        System.out.println(time);
        time.setHour(3);   //  23초과 > 23 0미만 > 0
        System.out.println(time);

    }
}