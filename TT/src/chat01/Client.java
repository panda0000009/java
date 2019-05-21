package chat01;

import java.io.*;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：实现一个客户可以正常收发信息
 */
public class Client {
    public static void main(String[] args) throws IOException {
        //1、建立连接: 使用Socket创建客户端 +服务的地址和端口
        Socket client =new Socket("localhost",8888);
        //2、客户端发送消息
        BufferedReader console = new BufferedReader(new InputStreamReader(System.in));//获取控制台读取的内容
        String msg =console.readLine();
        DataOutputStream dos = new DataOutputStream(client.getOutputStream());//发送到服务器
        dos.writeUTF(msg);
        dos.flush();
        //3，获取信息
        DataInputStream dis = new DataInputStream(client.getInputStream());
        msg = dis.readUTF();
        System.out.println(msg);


        dos.close();
        dis.close();
        client.close();
    }
}
