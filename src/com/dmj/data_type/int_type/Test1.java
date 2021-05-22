package com.dmj.data_type.int_type;

import java.util.stream.IntStream;

/**
 * 使用Lambda表达式计算1-100的偶数和
 */
public class Test1 {
    public static void main(String[] args) {
        int sum = IntStream.rangeClosed(1,100) //生成1-100的数字
                .filter(a -> a % 2 == 0) //过滤条件，表示过滤出偶数
                .sum();
        System.out.println(sum);
    }
}
