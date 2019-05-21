package com.company.pro;

public class infoTest {
    public static void main(String[] args) {
        System.out.println(Thread.currentThread().isAlive());


        // 设置名称：真实角色+代理角色
        MyInfo info = new MyInfo("战斗机");
        Thread t = new Thread(info);
        t.setName("公鸡");
        t.start();
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println(t.isAlive());

    }
}
class MyInfo implements Runnable{

    private String name;
    public MyInfo(String name){
        super();
        this.name = name;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName()+"-->"+name);
    }

}