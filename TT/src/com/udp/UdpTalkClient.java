package com.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * 多次交流：接收端
 * Address alre in use ：Cannot bind 同一个协议下端口不允许冲突
 * 1，使用DatagramSocket 指定端口 创建接收端
 * 2，准备容器 封装成DatagramPacket 包裹
 * 3，阻塞式接收包裹receive（DatagramPacket p）
 * 4，分析数据
 */
public class UdpTalkClient {
    public static void main(String[] args) throws Exception {
        System.out.println("启动方接收");
        //1，使用DatagramSocket 指定端口 创建接收端
        DatagramSocket server = new DatagramSocket(6666);
        while (true){
        byte[] container =new byte[1024*60];
        DatagramPacket packet = new DatagramPacket(container,0,container.length);
        // 3、阻塞式接收包裹receive​(DatagramPacket p)
        server.receive(packet); //阻塞式
        // 4、分析数据
        //    byte[]  getData​()
        //                getLength​()
        byte[]  datas =packet.getData();
        int len = packet.getLength();
        String data=new String(datas,0,len);
        System.out.println(data);
        if (data.equals("bye")){
            break;
        }
    }
        //5,释放资源
        server.close();
    }
}
