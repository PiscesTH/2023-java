package com.green.self;

public class SelfPrac5 {
    public static void main(String[] args) {
        Student a = new Student("기계공학과",201111);
        System.out.println(a);

        Student b = new Student();
        b.setMajor("생명공학과");
        b.setStudentNum(210000);
        System.out.printf("학과 : %s, 학번 : %d",b.getMajor(),b.getStudentNum());
    }
}

class Student{
    private String major;
    private int studentNum;

    public Student(){}
    public Student(String major, int studentNum){
        this.major = major;
        this.studentNum = studentNum;
    }
    public void setMajor(String major){
        this.major = major;
    }
    public void setStudentNum(int studentNum){
        this.studentNum = studentNum;
    }
    public String getMajor(){
        return major;
    }
    public int getStudentNum(){
        return studentNum;
    }
    @Override
    public String toString(){
        return String.format("학과 : %s, 학번 : %d",major,studentNum);
    }

}
