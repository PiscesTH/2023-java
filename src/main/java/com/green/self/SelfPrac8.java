package com.green.self;

public class SelfPrac8 {
    public static void main(String[] args) {
        Account a1 = new Account("오창식", 1000000);
        System.out.printf("현재 잔고 : %s\n", a1.getBalance());
        a1.deposit(300000);
        System.out.printf("현재 잔고 : %s\n", a1.getBalance());
        a1.withdraw(1500000);
        a1.withdraw(800000);
        System.out.printf("현재 잔고 : %s\n", a1.getBalance());

    }
}

class Account {
    private String owner;
    private long balance;

    public Account() {
    }

    public Account(String owner) {
    }

    public Account(long balance) {
    }

    public Account(String owner, long balance) {
        this.owner = owner;
        this.balance = balance;
    }

    public Account(long balance, String owner) {
        this.balance = balance;
        this.owner = owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public void setBalance(long balance) {
        this.balance = balance;
    }

    public String getOwner() {
        return owner;
    }

    public long getBalance() {
        return balance;
    }

    public long deposit(long amount) {
        return balance += amount;
    }

    public long withdraw(long amount) {
        if (balance < amount) {
            System.out.println("잔액이 부족합니다.");
            System.out.printf("현재 잔액은 %s 입니다.\n", balance);
            return balance;
        }
        return balance -= amount;
    }
}