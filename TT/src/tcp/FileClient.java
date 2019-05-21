package tcp;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 储存文件
 * 创建服务器
 * 1，指定端口 使用ServerSocket创建服务器
 * 2，阻塞式等待连接 accept
 * 3，操作：输入输出流操作
 * 4，释放资源
 */
public class FileClient {
    public static void main(String[] args) throws IOException {
        System.out.println("-----Client------");
        //1,建立连接：使用Socket创建客户端+服务的地址和端口
        Socket client =new Socket("localhost",8888);
        //2拷贝，上传
        InputStream is =new BufferedInputStream(new FileInputStream("src/ndl.png"));
        OutputStream os =new BufferedOutputStream(client.getOutputStream());
        byte[] flush =new byte[1024];
        int len = -1;
        while((len=is.read(flush))!=-1) {
            os.write(flush,0,len);
        }
        os.flush();
        //3,释放资源
        os.close();
        is.close();
        client.close();
    }
}
