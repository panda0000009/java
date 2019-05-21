package com.company.create;

/**
 * Lambda表达式   简化线程（用一次）的使用
 *
 */
public class LambdaThread {
    //静态内部类
    static class Test implements Runnable{
    @Override
    public void run() {
        for (int i=0;i<20;i++){
            System.out.println("一边听歌");
        }
    }
    }

    public static void main(String[] args) {
    //  new Thread(new Test()).start();

    //局部内部类 局部内部类是定义在一个方法或者一个作用域里面的类，它和成员内部类的区别在于局部内部类的访问仅限于方法内或者该作用域内
      class Test2 implements Runnable{
          @Override
          public void run() {
              for(int i = 0;i<20;i++){
                  System.out.println("一边听歌");
              }
          }
      }
       // new Thread(new Test()).start();

        //匿名内部类 必须借助接口或者父类
        new Thread(new Runnable() {
            @Override
            public void run() {
                for (int i=0;i<20;i++){
                    System.out.println("一边听歌");
                }
            }
        }).start();

        //jdk8  简化 lambda
        new Thread(()->{
            for (int i = 0;i<20;i++){
                System.out.println("一边听歌");
            }
        }
        ).start();







}
}






