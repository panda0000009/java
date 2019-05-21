package com.company.create;

/**
 * 守护线程：是为用户线程服务的;jvmt停止不用等待守护线程执行完毕
 * 默认：用户线程  jvm等待守护线程执行完毕才会停止
 */
public class DemonTest {
    public static void main(String[] args) {
        God god = new God();
        YOU you = new YOU();
      Thread t = new Thread(god);

      t.setDaemon(true);//将用户线程调整为守护
        t.start();
        new Thread(you).start();
    }
}
class YOU extends Thread{
    @Override
    public void run() {
      for (int i =1;i<365*100;i++){
          System.out.println("happy life....");
      }
        System.out.println("。。。。。。。。");
    }
}
class God extends Thread{
    @Override
    public void run() {
        while (true){
            System.out.println("bless  you");
        }
    }
}