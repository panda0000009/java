package com.company.info;

public class Join {
    public static void main(String[] args) throws InterruptedException {
       Thread tt= new Thread(()->{
            for (int i=0;i<100;i++){
                System.out.println("lambda....."+i);
            }
        });
        tt.start();

        for(int i=0;i<100;i++){
            if(i==20){
                tt.join();//插队，main被阻塞
            }
            System.out.println("main......"+i);
        }










    }

}
