package com.company.create;

public class Web12306 implements Runnable {
    //票数
    private  int tickerNums = 99;
    @Override
    public void run() {
        while (true){
            if (tickerNums<0){
                break;
            }
            try {
                Thread.sleep(200);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(Thread.currentThread().getName()+"-->"+tickerNums--);
        }
    }

    public static void main(String[] args) {
        //一份资源
        Web12306 web = new Web12306();
        System.out.println(Thread.currentThread().getName());
        //多个代理
        new  Thread(web,"码农").start();
        new  Thread(web,"码鬼").start();
        new  Thread(web,"码神").start();


    }
}
