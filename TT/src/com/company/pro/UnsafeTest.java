package com.company.pro;

public class UnsafeTest {
    public static void main(String[] args) {
        //账户
        Account account = new Account(100,"结婚礼金");
        Drawing you = new Drawing(account,80,"可悲的你");
        Drawing wife = new Drawing(account,90,"happy的她");
        you.start();
        wife.start();
    }
}
class Account{
    int money;
    String name;

    public Account(int money, String name) {
        this.money = money;
        this.name = name;
    }
}
//模拟取款
class Drawing extends Thread{
    Account account;//取钱的账户
    int drawingMoney;//取的钱数
    int drawingTotal;//取的总数

    public Drawing(Account account, int drawingMoney, String name) {
        this.account = account;
        this.drawingMoney = drawingMoney;
    }

    @Override
    public void run() {
        if (account.money -drawingMoney<0){
            return;
        }
        try {
            sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        account.money -=drawingMoney;
    drawingTotal +=drawingMoney;
        System.out.println(this.getName()+"账户余额为"+account.money);
        System.out.println(this.getName()+"取的总数"+drawingTotal);

    }
}