package com.dmj.data_type.int_type;

import java.util.Scanner;

/**
 * 题目：鸡兔同笼
 */
public class Test3 {
    public static void main(String[] args) {
        //题目1：m只鸡，n条兔，输出脚的数量
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入鸡的数量：");
        int m = scanner.nextInt();

        System.out.println("请输入兔的数量：");
        int n = scanner.nextInt();
        //计算总和
        int total = m*2+n*4;
        System.out.println("笼子里一共有"+total+"只脚");

        System.out.println("===========分隔符==============");
        //题目二：反过来，输入脚的数量，输出可能会有的鸡和兔
        System.out.println("请输入脚的数量：");
        int foot = scanner.nextInt();
        for (int ji = 0; ji<= foot/2; ji++){ //鸡的范围：0-（脚的数量/2）
            int tu_j = foot - ji*2;//兔的脚为所有脚减去鸡的脚
            //判断完整的组装兔子
            if (tu_j % 4 == 0){
                int tu = tu_j / 4;
                System.out.println("可能有鸡"+ji+"只，有兔子"+tu+"只");
            }
        }
    }
}
