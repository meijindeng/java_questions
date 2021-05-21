package com.dmj.io.file;

import org.junit.jupiter.api.Test;

import java.io.File;
import java.io.IOException;

/**
 * 创建文件的三个方式
 */
public class Test1 {
    public static void main(String[] args) {

    }

    //方式一：new File(String pathname)
    @Test
    public void create01() throws IOException {
        String filePath = "dmj/news1.txt";
        File file = new File(filePath);
        file.createNewFile();
        System.out.println("文件创建成功");
        //查看是否成功
        System.out.println(file.exists());
    }

    //方式二：new File(File parent,String child)根据父目录文件+子路径
    @Test
    public void create02() throws IOException {
        File parentFile = new File("e:\\");
        String fileName = "news2.txt";
        File file = new File(parentFile, fileName);

        file.createNewFile();
        System.out.println("文件创建成功");
    }

    //方式三：new File(String parent,String child)根据父目录+子路径
    @Test
    public void create03() throws IOException {
        String parentPath = "e:\\";
        String fileName = "news3.txt";
        File file = new File(parentPath, fileName);

        file.createNewFile();
        System.out.println("文件创建成功");
    }


    /**
     * 创建文件完整步骤：
     */
    @Test
    public void create04() throws IOException{
        File file = new File("abc/dmj.txt");
        //第一步：先判断上层文件夹是否存在
        File parentFile = file.getParentFile();
        if (!parentFile.exists()){
            parentFile.mkdirs();//创建上层文件夹
        }else {
            System.out.println("文件夹已经存在");
        }
        //第二步：创建文件
        file.createNewFile();
    }
}
