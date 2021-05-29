package com.dmj.arrays.one_dms;

/**
 * 创建一个char类型的26个元素的数组，分别放置'A'-'Z'，使用for循环访问所有元素并打印。
 */
public class Test3 {
    public static void main(String[] args) {
        char[] chars = new char[26];
        for (int i = 0; i < chars.length; i++) {
            //强制转换
            chars[i] = (char) ('A' + i);
        }
        //循环遍历
        for (int i = 0; i < chars.length; i++) {
            System.out.print(chars[i] + "\t");
        }
    }
}
