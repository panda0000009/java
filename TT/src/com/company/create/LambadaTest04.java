package com.company.create;

public class LambadaTest04 {
    public static void main(String[] args) {
        new Thread(() ->{
            System.out.println("一边学习lambda");
        }).start();

        new Thread(()->
                System.out.println("一边奔溃")
        ).start();



    }
}
