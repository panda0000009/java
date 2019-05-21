package Chat03;

import java.io.DataInputStream;
import java.io.IOException;
import java.net.Socket;

/**
 * 使用多线程封装：接收端
 * 1，接收消息
 * 2，释放资源
 * 3，重写run
 */
public class Receive implements Runnable{
    private DataInputStream dis;
    private Socket client;
    private  boolean isRunning;
    public Receive(Socket client){
        this.client = client;
        this.isRunning = true;
        try {
            dis = new DataInputStream(client.getInputStream());
        } catch (IOException e) {
            System.out.println("======2======");
            e.printStackTrace();
            release();

        }
    }
    //接收信息
    private String receive(){
        String msg = "";
        try {
            msg = dis.readUTF();
        } catch (IOException e) {
            System.out.println("======4=====");
            e.printStackTrace();
            release();
        }
        return msg;
    }

    public void run() {
        while (isRunning){
            String msg = receive();
            if (!msg.equals("")){
                System.out.println(msg);
            }
        }

    }
    private void release(){
        this.isRunning = false;
        Utils.close(dis,client);
    }
}
