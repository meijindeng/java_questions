package com.dmj.json.lab3;

import org.json.JSONArray;
import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * JSON数组：
 */
public class Test1 {
    //String格式的json数组转换json数组（[json,json,json]，注意外层是中括号）
    @Test
    public void demo1(){
        String jsonArrayStr = "[{\"name\":\"zs\",\"age\":23},{\"classname\":\"数学班\",\"classno\":1},{\"schoolname\":\"英才学校\",\"zone\":\"杭州\"}]";
        //String格式-->json数组
        JSONArray jsonArray = new JSONArray(jsonArrayStr);
        System.out.println(jsonArray);
    }

    //Map集合转换为json数组（对于json类型转换，需要引入“json lib”库）
    @Test
    public void demo2(){
        Map<String, String> map = new HashMap<>();
        map.put("key1","value1");
        map.put("key2","value2");
        map.put("key3","value3");
        //JSONArray jsonArray = new JSONArray(map);
        //说明JSONArray中必须只能是string或者collection或者array
        //System.out.println(jsonArray);//报错：JSONArray initial value should be a string or collection or array.

        /**json lib中的jar包
         * jakarta commons-lang 2.5
         * jakarta commons-beanutils 1.8.0
         * jakarta commons-collections 3.2.1
         * jakarta commons-logging 1.1.1
         * ezmorph 1.0.6
         * json-lib-x.x-jdk15
        */
        //导入之后，使用json lib的JSONArray
        net.sf.json.JSONArray jsonArray = new net.sf.json.JSONArray(); //可以加上包名，区分json和json lib（包名.类名）
        //map-->json
        jsonArray = jsonArray.fromObject(map);
        System.out.println(jsonArray);
    }

    //json数组转换为Map集合（json数组-->获取每一个json-->拿到key和value-->map）
    @Test
    public void demo3(){
        //准备json数组数据
        String jsonArrayStr = "[" +
                "{\"name\":\"zs\",\"age\":23}," +
                "{\"classname\":\"数学班\",\"classno\":1}," +
                "{\"schoolname\":\"英才学校\",\"zone\":\"杭州\"}]";
        //string-->json数组
        net.sf.json.JSONArray jsonArray = new net.sf.json.JSONArray();
        jsonArray = jsonArray.fromObject(jsonArrayStr);

        Map<String,Object> map = new HashMap<>();
        //获取每一个json（遍历）
        for (int i = 0; i < jsonArray.size(); i++) {
            Object o = jsonArray.get(i);//这是每一个json
            //Object-->json
            net.sf.json.JSONObject json = (net.sf.json.JSONObject)o;// 强转变成json格式（json lib包中的）
            //获取每一个json的key和value-->map
            Set<String> keys = json.keySet();//每个json有多个key，keys是所有key
            for (String key : keys) {
                Object value = json.get(key);//根据key取到value
                map.put(key,value);//放入map集合中
            }
        }
        //json是冒号，map是等号
        System.out.println(map);//{classname=数学班, zone=杭州, name=zs, classno=1, age=23, schoolname=英才学校}
    }

    public static void main(String[] args) {
    }
}
