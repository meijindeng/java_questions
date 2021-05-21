package com.dmj.io.file;

import java.io.File;
import java.io.IOException;

/**
 * 获取文件基本信息（文件名getName,绝对路径getAbsolutePath、、、）
 */
public class Test2 {
    public static void main(String[] args) throws IOException {
        //创建文件对象
        File file = new File("dmj/test.txt");
        //先判断上层文件夹是否存在
        File parentFile = file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();//不存在，创建上层文件夹
        }else {
            System.out.println("文件夹已经存在，不需要再创建了！！！");//已经存在
        }
        //判断之后再创建文件
        file.createNewFile();
        //调用相应的方法，得到对应的信息
        System.out.println("==========文件信息如下:=========");
        System.out.println("文件名字="+file.getName());
        System.out.println("绝对路径="+file.getAbsolutePath());
        System.out.println("文件父级目录="+file.getParent());
        System.out.println("文件大小(字节)="+file.length());
        System.out.println("文件是否存在="+file.exists());
        //等等...
    }
}
