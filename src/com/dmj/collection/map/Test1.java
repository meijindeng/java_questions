package com.dmj.collection.map;

import java.util.HashMap;
import java.util.Map;

/**
 * 采用lambda表达式遍历map集合
 */
public class Test1 {
    public static void main(String[] args) {
        Map<Integer, String> map = new HashMap<>();
        map.put(1, "jack");
        map.put(2, "tom");
        map.put(3, "rose");
        map.put(4, "jock");

        map.forEach((k, v)->{
            System.out.println(k +","+ v);
        });
    }
}
