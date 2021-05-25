package com.dmj.data_type.int_type;

import java.util.Arrays;

/**
 * 题目：将int数组转换成Integer数组
 */
public class Test4 {
    public static void main(String[] args) {
        //第一种方案：使用for循环
        int[] array = {8,5,9,6};
        Integer[] integers1 = new Integer[array.length];
        for (int i = 0; i < array.length ; i++) {
            integers1[i] = array[i];
        }
        System.out.println(Arrays.toString(integers1));//将数组转换字符串
        System.out.println("==========分隔符==========");
        //第二种方案：使用流式编程
        Integer[] integers2 = Arrays.stream(array).boxed()//将array传入stream方法中转换成流，并变成包装类boxed
                .toArray(Integer[]::new);//调用toArray转换成integers2数组，方法引用
        System.out.println(Arrays.toString(integers2));
    }
}
