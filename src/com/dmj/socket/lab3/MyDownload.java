package com.dmj.socket.lab3;

import java.io.*;
import java.net.Socket;

public class MyDownload implements Runnable {
    /**
     * 线程类，实现多次下载
     */
    private Socket socket;

    public MyDownload(Socket socket) {
        this.socket = socket;
    }

    @Override
    public void run() {

        try {
            //accept可监听是否有客户端访问
            System.out.println("与客户端连接成功！");//测试连接
            //服务端向客户端发送文件OutputStream
            OutputStream out = socket.getOutputStream();
            //准备发送的文件
            File file = new File("dmj/test.txt");
            //使用InputStream将文件从硬盘保存到内存中，该输入流（直接new）与网络传输的输入输出流（socket提供）不一样
            InputStream fileIn = new FileInputStream(file);
            //将fileIn通过socket提供的输出流发送给客户端，文件较大，循环分次发送
            byte[] fileBytes = new byte[100];//每次发100个字节
            int len = -1;
            while ((len = fileIn.read(fileBytes)) != -1) {
                out.write(fileBytes, 0, len);
            }
            System.out.println("文件发送成功！");
            //关闭服务、流
            fileIn.close();
            out.close();
            socket.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
