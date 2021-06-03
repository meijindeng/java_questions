package com.dmj.socket.lab3;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class MyServer3 {
    //说明：服务端发送一个文件，接收客户端的反馈world
    public static void main(String[] args) throws IOException {
        //服务端通过ServerSocket绑定服务端口，ip为本机IP
        ServerSocket server = new ServerSocket(9999);//通过构造方法绑定端口
        while (true) {
            //接收到客户端的请求，返回一个线程
            Socket socket = server.accept();//返回一个socket对象
            //下载线程。download线程对象
            MyDownload download = new MyDownload(socket);//将socket通过构造方法传入MyDownload中
            //先将Runnable转换为Thread
            Thread downLoadThread = new Thread(download);
            //启动线程
            downLoadThread.start();
            //以上三行可以优化为： new Thread(new MyDownload(socket)).start();
        }
    }
}
