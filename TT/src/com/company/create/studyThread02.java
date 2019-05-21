package com.company.create;

/**
 * 创建线程方式1：
 * 1，创建：实现Runnable+重写run
 * 2，创建实现类对象加Star
 *
 *
 */
public class studyThread02 extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
       /* //创建子类对象
        studyThread02 st = new studyThread02();
        //创建代理对象
        Thread t = new Thread(st);
        //启动
        t.start();*/
        new Thread(new studyThread02()).start();

        for (int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
