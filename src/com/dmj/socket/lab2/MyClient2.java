package com.dmj.socket.lab2;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 */
public class MyClient2 {
    //说明：客户端接收文件，向服务端反馈world
    public static void main(String[] args) throws IOException {
        //客户端通过Socket访问端口
        Socket socket = new Socket("127.0.0.1",9999);

        //客户端接收服务端发送的文件InputStream
        InputStream in = socket.getInputStream();
        byte[] bs = new byte[100];
        int len = -1;
        //使用OutputStream将文件从内存保存到硬盘中
        OutputStream fileOut = new FileOutputStream("e:\\dmj.txt");
        //接收每次发来的文件切片
        while ((len = in.read(bs))!=-1){
            fileOut.write(bs,0,len);
        }
        System.out.println("文件接收成功！");
        //关闭服务、流
        fileOut.close();
        in.close();
        socket.close();
    }
}
