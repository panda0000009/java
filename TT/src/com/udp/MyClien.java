package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 客户端  （发送端）
 * 1，创建客户端+端口
 * 2，准备数据
 * 3，打包（发送的地点及端口）
 * 4，发送
 * 5，释放
 */
public class MyClien {
    public static void main(String[] args) throws Exception {

        //*客户端  （发送端）
       // 1创建客户端+端口
        DatagramSocket client = new DatagramSocket(9999);
       // 2，准备数据
        String msg = "udp编程";
        byte[] data = msg.getBytes();
       // 3，打包（发送的地点及端口）
        DatagramPacket packet = new DatagramPacket(data,data.length,new InetSocketAddress("localhost",8888));
       // 4，发送
        client.send(packet);
       // 5，释放
        client.close();
    }
}
