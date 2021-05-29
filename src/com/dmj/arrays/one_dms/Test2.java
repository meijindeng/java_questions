package com.dmj.arrays.one_dms;

import java.util.Scanner;

/**
 * 数组的三种使用方式
 */
public class Test2 {
    public static void main(String[] args) {
        System.out.println("================方式一===========");
        //第一种方式：动态初始化--->"数据类型[] 数组名 = new 数据类型[大小]"
        Scanner scanner = new Scanner(System.in);
        double[] arr = new double[5]; //声明并开辟空间
        for (int i = 0; i < arr.length; i++) {//赋值
            System.out.println("请输入第"+(i+1)+"个元素的值：");
            arr[i] = scanner.nextDouble();
        }
        System.out.println("输出数据：");
        for (int i = 0; i < arr.length; i++) {//遍历
            System.out.println("第"+ (i+1) +"个数字为：" + arr[i]);
        }

        System.out.println("================方式二===========");
        //第二种方式：动态初始化--->"数据类型[] 数组名"，然后再 "数组名 = new 数据类型[大小]"
        int[] arr1; //先声明，并没有分配空间
        arr1 = new int[5];//分配空间
        for (int i = 0; i < arr1.length; i++) {//赋值
            System.out.println("请输入第"+(i+1)+"个元素的值：");
            arr1[i] = scanner.nextInt();
        }
        System.out.println("输出数据：");
        for (int i = 0; i < arr.length; i++) {//遍历
            System.out.println("第"+ (i+1) +"个数字为：" + arr1[i]);
        }

        System.out.println("================方式三===========");
        //第三种方式：静态初始化--->"数据类型[] 数组名 = {值1，值2，...}"
        int[] arr3 = {1, 2, 3, 4};
        for (int i = 0; i < arr3.length; i++) {
            System.out.println("第"+ (i+1) +"个元素的值=" + arr3[i]);
        }
    }
}
