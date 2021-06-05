package com.dmj.json.lab2;

import com.dmj.json.lab1.Address;
import com.dmj.json.lab1.Person;
import org.apache.commons.io.FileUtils;
import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.io.*;
import java.util.HashMap;
import java.util.Map;

/**
 * json文件与JSON对象之间的转换
 */
public class Test1 {
    //json文件转换JSON对象（文件-->String-->JSON）
    @Test
    public void demo1() throws IOException {
        //文件-->String(方式一)
        InputStream in = super.getClass().getClassLoader().getResourceAsStream("com/dmj/json/lab2/per.json");//相对路径
        byte[] bs = new byte[10];//定义缓冲区，大小为10
        int len = -1;
        StringBuffer sb = new StringBuffer();//字符串拼接为sb（读取一个拼接一个）
        while ((len = in.read(bs)) != -1){//不断向缓冲区读取内容，如果不等于-1，说明有内容
        String str = new String(bs,0,len);//读取的字节数组转换字符串
        sb.append(str);//进行拼接
        }
        //System.out.println(sb);
        //StringBuffer-->String
        String s = sb.toString();
        //String-->JSON
        JSONObject json = new JSONObject(s);
        System.out.println(json);
}

    //json文件转换JSON对象（文件-->String-->JSON）
    @Test
    public void demo2() throws IOException {
        //文件-->String(方式二，需要commons-io.jar包)
        String s = FileUtils.readFileToString(
                new File("E:\\IdeaSpace\\dmj_java_questions\\java_questions\\src\\com\\dmj\\json\\lab2\\per.json"),
                         "utf8");//绝对路径
        //String-->JSON
        JSONObject json = new JSONObject(s);
        System.out.println(json);
    }

    //JSON对象转换json文件（）
    @Test
    public void demo3() throws IOException {
        //准备json数据(map-->json)
        Map<String, Person> map = new HashMap<>();
        Person p1 = new Person("zs",20,new Address("杭州","宁波"));
        Person p2 = new Person("ls",21,new Address("台州","上海"));
        Person p3 = new Person("ww",22,new Address("衢州","南京"));
        map.put("zs",p1);
        map.put("ls",p2);
        map.put("ww",p3);
        //map-->json
        JSONObject json = new JSONObject(map);
        //生成json文件
        Writer w = new FileWriter("E:\\IdeaSpace\\dmj_java_questions\\java_questions\\src\\com\\dmj\\json\\lab2\\per1.json");
        json.write(w);
        w.close();
        System.out.println("生成json文件成功！");
    }
    public static void main(String[] args) {

    }
}
