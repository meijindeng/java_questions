package com.dmj.io.io_stream;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 题目：使用Stream流读取文本信息
 */
public class Test1 {
    public static void main(String[] args) throws Exception {
        String filePath = "dmj/test.txt";
        //第一种：使用普通流读取文件
        BufferedReader br = new BufferedReader(new FileReader(filePath));
        String str = null;
        while ((str = br.readLine()) != null){
            System.out.println(str);
        }

        System.out.println("===========分隔符=========");

        //第二种：使用使用Stream流读取文本信息
        Stream<String> lines = Files.lines(Paths.get(filePath));
        lines.forEach(System.out::println);//调用流对象forEach方法，直接使用方法引用。
    }
}
