package com.dmj.json.lab1;

import org.json.JSONObject;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

/**
 * 将Map集合、普通对象（Javabean）、字符串转换为JSON对象：只需要将它们放入一个构造方法中，返回一个json对象即可。
 */
public class Test1 {
    //将Map集合转换为JSON对象
    @Test
    public void demo1(){
        //创建一个Map集合
        Map<String, String> map = new HashMap<>();
        map.put("1729210001","zhangsan");
        map.put("1729210002","lisi");
        map.put("1729210003","wangwu");
        //Map-->json
        JSONObject json = new JSONObject(map);//引入json对象
        System.out.println(json);//打印json：{"1729210003":"wangwu","1729210002":"lisi","1729210001":"zhangsan"}
    }

    //将普通对象（Javabean）转换为JSON对象
    @Test
    public void demo2(){
        //创建一个Person对象
        Person per =new Person();
        per.setName("zhangsan");
        per.setAge(23);
        Address add = new Address("杭州","宁波");
        per.setAddress(add);
        //Javabean-->json
        JSONObject json = new JSONObject(per);
        System.out.println(json);//打印json：{"address":{"schoolAddress":"宁波","homeAddress":"杭州"},"name":"zhangsan","age":23}
    }

    //将字符串转换成JSON对象
    @Test
    public void demo3(){
        String str = "{\"name\":\"zhangsan\",\"age\":23}";//需要符合json格式
        JSONObject json = new JSONObject(str);
        System.out.println(json);
    }

    public static void main(String[] args) {
    }
}
