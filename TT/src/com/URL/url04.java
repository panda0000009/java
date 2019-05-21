package com.URL;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

//网络爬虫，模拟页面检测User-Agent
public class url04 {
    public static void main(String[] args) throws Exception {
        //获取URL
        URL url = new URL("https://www.dianping.com");
        //下载资源
        HttpURLConnection conn =(HttpURLConnection)url.openConnection();
        conn.setRequestMethod("GET");
        conn.setRequestProperty("User-Agent"," Mozilla/5.0 (Windows NT 10.0; WOW64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/71.0.3578.98 Safari/537.36");
        BufferedReader br = new BufferedReader(new InputStreamReader(conn.getInputStream(),"UTF-8"));
        String msg =null;
        while (null!=(msg=br.readLine())){
            System.out.println(msg);
        }
        br.close();
    }
}
