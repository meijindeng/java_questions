package com.dmj.socket.lab1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 服务器
 */
public class MyServer {
    //说明：服务端发送hello，接收客户端的反馈world
    public static void main(String[] args) throws IOException {
        //服务端通过ServerSocket绑定服务端口，ip为本机IP
        ServerSocket server = new ServerSocket(9999);//通过构造方法绑定端口
        //accept可监听是否有客户端访问
        Socket socket = server.accept();//返回一个socket对象
        System.out.println("与客户端连接成功！");//测试连接

        //服务端向客户端发送消息OutputStream
        OutputStream out = socket.getOutputStream();
        //String-->byte[]
        String info = "hello";
        out.write(info.getBytes());

        //服务端接收客户端的反馈InputStream
        InputStream in = socket.getInputStream();
        byte[] bs = new byte[100];
        in.read(bs);
        System.out.println("接收客户端的反馈："+new String(bs));//byte[]-->String

        //关闭服务、流
        out.close();
        in.close();
        socket.close();
        server.close();
    }
}
