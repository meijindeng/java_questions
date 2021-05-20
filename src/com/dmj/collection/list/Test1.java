package com.dmj.collection.list;

import sun.text.resources.no.CollationData_no;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * 题目：怎么将List集合中的元素去重
 */
public class Test1 {
    public static void main(String[] args) {

        List<String> words = Arrays.asList("a","b","c","a","b","d");

        //方法一：将List集合转换为Set集合（Set集合无序不重复）
        Set<String> set = new HashSet<>();
        for (String word : words) {  //遍历List集合
            set.add(word);  //取出元素放入Set中
        }
        for (String word : set) { //遍历Set集合
            System.out.println(word);
        }

        System.out.println("============分割线===========");

        //方法二：jdk8的流式编程
        words.stream()//调用List集合的stream()方法，将集合转换成流
                .distinct()  //该方法可以去重
                .collect(Collectors.toList())  //去重后，流再转换成List集合
                .forEach(System.out::println); //对List集合进行遍历（方法引用）
    }
}
