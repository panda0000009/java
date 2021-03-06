package chat01;

import java.io.*;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：实现一个客户可以正常收发多条信息
 */
public class MultiClient {
    public static void main(String[] args) throws IOException {
        //1、建立连接: 使用Socket创建客户端 +服务的地址和端口
        Socket client =new Socket("localhost",8888);
        //2、客户端发送消息
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));//获取控制台读取的内容
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());//发送到服务器
        DataInputStream dis = new DataInputStream(client.getInputStream());
        //3，获取信息
        boolean isRunning = true;
        while (isRunning){
        String msg =console.readLine();
        dos.writeUTF(msg);
        dos.flush();
        msg = dis.readUTF();
        System.out.println(msg);
        }
        dos.close();
        dis.close();
        client.close();
    }
}
