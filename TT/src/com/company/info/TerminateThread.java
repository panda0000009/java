package com.company.info;

/**
 * 终止线程
 * 1，线程正常执行完毕-->次数
 * 2,外部干涉-->加入标识
 * 不要使用stop    destroy
 * @author   郑焕忠
 */
public class TerminateThread implements Runnable{
    //1,加入标识   标记线程体是否可以yunx
    private boolean flag = true;
    private String name;

    public TerminateThread(String name) {
        this.name = name;
    }

    @Override
    public void run() {
        int i = 0;
    //2,关联标识，true-->   运行false   ——>停止
        while (flag){
            System.out.println(name+"-->"+i++);
        }
    }
    //3,对外提供方法改变标识
    public void terminate(){
        this.flag = false;
    }
    public static void main(String[] args) {
    TerminateThread tt = new TerminateThread("c罗");
    new Thread(tt).start();
    for(int i=0;i<=999999999;i++){
        if (i==88888888){
            tt.terminate();//线程的终止
            System.out.println("tt game over");
        }
    }
    }
}
