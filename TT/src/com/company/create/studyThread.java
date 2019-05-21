package com.company.create;

/**
 * 创建线程方式1：
 * 1，创建：继承Thread+重写run
 * 2，启动，创建子类对象，启动
 *
 */
public class studyThread extends Thread{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }

    public static void main(String[] args) {
        //创建子类对象
        studyThread st = new studyThread();
        //启动
        st.start();
        for (int i=0;i<20;i++){
            System.out.println("一边coding");
        }
    }
}
