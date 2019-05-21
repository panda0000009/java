package com.URL;

import java.net.MalformedURLException;
import java.net.URL;

public class url{
    public static void main(String[] args) throws Exception {
        //绝对路径构建
        URL url = new URL("http://www.baidu.com:80/index.thml?uname=bjsxt");
        System.out.println("协议："+url.getProtocol());//是否存在
        System.out.println("域名："+url.getHost());
        System.out.println("端口："+url.getPort());
        System.out.println("资源："+url.getFile());
        System.out.println("相对资源"+url.getPath());
        System.out.println("锚点"+url.getRef());
        System.out.println("参数"+url.getQuery());//参数：存在锚点返回NUll，不存在返回正确
    }

}
