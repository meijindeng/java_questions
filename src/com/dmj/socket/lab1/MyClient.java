package com.dmj.socket.lab1;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class MyClient {
    //说明：客户端接收hello，向服务端反馈world
    public static void main(String[] args) throws IOException {
        //客户端通过Socket访问端口
        Socket socket = new Socket("127.0.0.1",9999);

        //客户端接收服务端发送的消息InputStream
        InputStream in = socket.getInputStream();
        byte[] bs = new byte[100];
        in.read(bs);
        System.out.println("接收服务端发来的请求："+new String(bs));//byte[]-->String

        //客户端向服务端做出发聩OutputStream
        OutputStream out = socket.getOutputStream();
        out.write("world".getBytes());//String-->byte[]

        //关闭服务、流
        out.close();
        in.close();
        socket.close();
    }
}
