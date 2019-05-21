package Chat03;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.channels.Channel;

/**
 * 在线聊天室：服务器   转发器
 * 目标：使用多线程实现多个客户可以正常收发多条信息
 * 问题
 * 1，代码不好维护
 * 2，客户端读写没有分开  必须先写后读
 *
 */
public class TMultiChat {
    public static void main(String[] args) throws IOException {
        System.out.println("-----Server-----");
        // 1、指定端口 使用ServerSocket创建服务器
        ServerSocket server =new ServerSocket(8888);
        // 2、阻塞式等待连接 accept
        while (true) {
            Socket client = server.accept();
            System.out.println("一个客户端建立了连接");
            new Thread(new Channel(client)).start();
        }
    }
            //一个客户代表一个Channel
            static class Channel implements Runnable {
                private DataInputStream dis;
                private DataOutputStream dos;
                private Socket client;
                private boolean isRunning;

                public Channel(Socket client) {
                    this.client = client;
                    try {
                        dis = new DataInputStream(client.getInputStream());
                        dos = new DataOutputStream(client.getOutputStream());
                        isRunning = true;
                    } catch (IOException e) {
                        System.out.println("---1------");
                        release();
                    }
                }

                //接收信息
                private String receive() {
                    String msg = "";
                    try {
                        msg = dis.readUTF();
                    } catch (IOException e) {
                        System.out.println("----2----");
                        release();
                    }
                    return msg;
                }

                //发送信息
                private void send(String msg) {
                    try {
                        dos.writeUTF(msg);
                    } catch (IOException e) {
                        System.out.println("----3-----");
                        release();
                    }
                }

                //释放资源
                private void release() {
                    this.isRunning = false;
                    Utils.close(dis, dos, client);
                }

                @Override
                public void run() {
                    while (isRunning) {
                        String msg = receive();
                        if (!msg.equals("")) {
                            send(msg);
                        }
                    }
                }

            }
}
