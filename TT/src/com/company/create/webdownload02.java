package com.company.create;

public class webdownload02 extends Thread {
    private String url;
    private String name;

    public webdownload02(String url, String name) {
        this.url = url;
        this.name = name;
    }

    @Override
    public void run() {
    webdownload01 wd = new webdownload01();
    wd.download(url,name);
    }

    public static void main(String[] args) {
        webdownload02 wd2 = new webdownload02("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&hs=0&pn=1&spn=0&di=177650&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=3300305952%2C1328708913&os=188573792%2C343995474&simid=4174703319%2C828922280&adpicid=0&lpn=0&ln=1719&fr=&fmq=1556718300494_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic37.nipic.com%2F20140113%2F8800276_184927469000_2.png&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3F9AzdH3F898AzdH3Flm808c0_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","天马.png");
        webdownload02 wd3 = new webdownload02("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&hs=0&pn=2&spn=0&di=176660&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=234634259%2C4236876085&os=54892700%2C159557102&simid=3579428015%2C308375459&adpicid=0&lpn=0&ln=1719&fr=&fmq=1556718300494_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fpic15.nipic.com%2F20110628%2F1369025_192645024000_2.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Bgtrtv_z%26e3Bv54AzdH3Ffi5oAzdH3F90088lb_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","海南.png");
        webdownload02 wd4 = new webdownload02("http://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E5%9B%BE%E7%89%87&step_word=&hs=0&pn=4&spn=0&di=129140&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=0&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=undefined&cs=2153937626%2C1074119156&os=2973785003%2C2939226447&simid=4127171795%2C760771602&adpicid=0&lpn=0&ln=1719&fr=&fmq=1556718300494_R&fm=&ic=undefined&s=undefined&hd=undefined&latest=undefined&copyright=undefined&se=&sme=&tab=0&width=undefined&height=undefined&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=http%3A%2F%2Fk.zol-img.com.cn%2Fsjbbs%2F7692%2Fa7691515_s.jpg&fromurl=ippr_z2C%24qAzdH3FAzdH3Fkkf_z%26e3Bz5s_z%26e3Bv54_z%26e3BvgAzdH3Ff3kkfAzdH3F10_c99a_z%26e3Bip4s&gsm=0&rpstart=0&rpnum=0&islist=&querylist=&force=undefined","小狗.png");
        //启动三个线程
        wd2.start();
        wd3.start();
        wd4.start();
    }
}
