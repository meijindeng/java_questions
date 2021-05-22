package com.dmj.data_type.int_type;

import java.util.Scanner;

/**
 * 题目：水仙花数
 */
public class Test2 {
    public static void main(String[] args) {
        //第一种：从键盘输入数字，判断是否属于水仙花数
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一个三位数：");
        int num = scanner.nextInt();
        //判断是否是三位数
        if (num >= 100 && num<=999){
            //获取到三位数的每一位
            int b = num / 100;      //百位
            int s = num % 100 / 10; //十位
            int g = num % 100 % 10; //个位
            int sum = b*b*b + s*s*s + g*g*g;
            //比较输入的数和计算出来的数是否一致
            if (num == sum){
                System.out.println("这个数是水仙花数");
            }else {
                System.out.println("这个数不是水仙花数");
            }
        }else {
            System.out.println("不是三位数，也不是水仙花数！");
        }

        System.out.println("============分隔符=============");
        //第二种：输出100-1000范围内的水仙花数
        int count = 0;
        for (int i = 100; i < 1000; i++){
            int firstNum = i / 100;
            int secondNum = i % 100 / 10;
            int thirdNum = i % 100 % 10;
            int total = firstNum*firstNum*firstNum + secondNum*secondNum*secondNum + thirdNum*thirdNum*thirdNum;
            if (total == i){
                System.out.println("水仙花数："+i);
                count++;
            }
        }
        System.out.println("水仙花总数目："+count);
    }
}
