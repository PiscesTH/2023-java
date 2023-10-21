package com.green.self;

public class SelfPrac7 {
    public static void main(String[] args) {
        System.out.println(new SalaryMan().getAnnualGross());
        System.out.println(new SalaryMan(2000000).getAnnualGross());
    }
}

class SalaryMan {
    private int salary; //월 급여액
    private int annualGross;

    public SalaryMan() {
        salary = 1000000;
        annualGross = salary * 5;
    }
    public SalaryMan(int salary){
        this.salary = salary;
        annualGross = salary * 5;
    }

    public int getAnnualGross(){
        return annualGross;
    }
}