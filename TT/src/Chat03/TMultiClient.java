package Chat03;

import java.io.*;
import java.net.Socket;

/**
 * 在线聊天室：客户端
 * 目标：实现一个客户可以正常收发多条信息
 * 问题：其他客户必须等待之前的客户退出，才能继续排队
 */
public class TMultiClient {
    public static void main(String[] args) throws IOException {
        //1、建立连接: 使用Socket创建客户端 +服务的地址和端口
        Socket client =new Socket("localhost",8888);
        //2、客户端发送消息
     new Thread(new Send(client)).start();
     new Thread(new Receive(client)).start();
}
}
