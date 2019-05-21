package com.URL;

import javax.print.DocFlavor;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

/**
 * 获取资源：源代码
 */
public class url02 {
    public static void main(String[] args) throws IOException {
        URL url = new URL("http://www.baidu.com");//主页 默认资源
       /*
       //获取资源 网络流
        InputStream is = url.openStream();
        byte[] flush = new byte[1024];
        int len = 0;
        while (-1!=(len=is.read(flush))){
            System.out.println(new String(flush,0,len));
        }
        is.close();
        */
    }
}
