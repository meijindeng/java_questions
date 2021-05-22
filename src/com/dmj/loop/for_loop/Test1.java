package com.dmj.loop.for_loop;

/**
 * for嵌套实现九九乘法表
 */
public class Test1 {
    public static void main(String[] args) {
        //特点一：共九行
        //特点二：第1行1个，第2行2个，...，第n行n个
        for (int i = 1; i <= 9; i++){ //纵向循环
            for (int j = 1; j<=i; j++){ //横向循环
                System.out.print(j+"*"+i+"="+i*j+" ");
            }
            System.out.println();//纵向循环一次，就换一次行
        }
    }
}

