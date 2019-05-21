package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetSocketAddress;
import java.net.SocketException;

/**
 * 服务端  （接收端）
 * 1，创建服务端+端口
 * 2，准备数据，接收容器
 * 3，封装成包
 * 4，接收数据
 * 5，分析数据
 * 6，释放
 */
public class MyServert {
    public static void main(String[] args) throws Exception {

        //*客户端  （发送端）
        // 1创建服户端+端口
        DatagramSocket server = new DatagramSocket(8888);
        // 2，准备接收容器
        byte[] container = new byte[1024];
        // 3，封装成包DatagramPacket(byte[] buf, int length)
        DatagramPacket packet = new DatagramPacket(container,container.length);
        // 4，接收数据
        server.receive(packet);
        // 5，分析数据
        byte[] data = packet.getData();
        //6.释放
        server.close();
    }
}
