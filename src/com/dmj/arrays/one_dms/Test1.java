package com.dmj.arrays.one_dms;

/**
 * 计算一组数据的和
 */
public class Test1 {
    public static void main(String[] args) {
        //定义数组
        double[] array = {3, 5, 7, 9.6, 2.9, 13};
        //遍历数组
        double total = 0;
        for (int i = 0; i < array.length ; i++) {
            System.out.println("第"+ i +"个元素的值=" + array[i]);
            total += array[i];
        }
        System.out.println("总数="+total);
    }
}
