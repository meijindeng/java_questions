package com.dmj.collection.list;

import java.util.ArrayList;
import java.util.List;

/**
 * 采用lambda表达式遍历list集合
 */
public class Test2 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("jack");
        list.add("tom");
        list.add("rose");
        list.add("jock");

        //遍历list集合
        list.forEach((s) -> System.out.println(s));
    }
}
