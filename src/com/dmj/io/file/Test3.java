package com.dmj.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;

/**
 * 目录操作以及文件删除（mkdir创建一级目录，mkdirs为创建多级目录，delete删除）
 */
public class Test3 {
    public static void main(String[] args) {

    }

    @Test
    public void delete() throws IOException {
        String filePath = "dmj/test.txt";
        File file = new File(filePath);
        //判断文件是否存在，存在就删除
        if (file.exists()){
            //拓展：使用使用Stream流读取文本信息
            Stream<String> lines = Files.lines(Paths.get(filePath));
            lines.forEach(System.out::println);//调用流对象forEach方法，直接使用方法引用。

            if(file.delete()){
                System.out.println(filePath+"删除成功！！！");
            }else {
                System.out.println(filePath+"删除失败！！！");
            }
        }else {
            System.out.println("文件不存在！！！");
        }
    }

    @Test
    public void test(){
        String directoryPath = "e:\\demo\\a\\b";
        File file = new File(directoryPath);
        //创建文件，先判断是否存在
        if (file.exists()){
            System.out.println(directoryPath+"已经存在");
        }else {
            //否则创建
            if (file.mkdirs()){
                System.out.println(directoryPath+"创建成功");
            }else {
                System.out.println(directoryPath+"创建失败");
            }
        }
    }
}
