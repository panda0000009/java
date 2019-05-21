package com.URL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;

//网络编程之
//网络爬虫基础版
public class url03 {
    public static void main(String[] args) throws IOException {


    //获取URL
    URL url = new URL("https://wwww.jd.comn");
    //下载资源（io字节流）
    InputStream is = url.openStream();
    BufferedReader br = new BufferedReader(new InputStreamReader(is,"UTF-8"));
    String msg =null;
    while (null!=(msg=br.readLine())){
        System.out.println(msg);
    }
    br.close();
    //分析
        //正则表达式
    //处理
}
}