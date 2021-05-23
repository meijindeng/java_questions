package com.dmj.arrays.two_dms;

/**
 * 题目：打印杨辉三角
 */

/**
 * 规律：1.第1行有1个元素，第n行n个；
 *      2.每一行第1个元素和最后1个元素都是1；
 *      3.从第三行开始，对于非第一个和最后一个元素的元素的值.yh[i][j]
 *      yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1]
 */
public class Test1 {
    public static void main(String[] args) {
        int[][] yh = new int[10][];
        //遍历每一个元素
        for (int i = 0; i < yh.length; i++) {
            //给每一个一维数组开空间
            yh[i] = new int[i + 1];
            //给每一个一维数组赋值
            for (int j = 0; j < yh[i].length; j++) {
                //每一行的第一个和最后一个元素为1
                if (j == 0 || j == yh[i].length - 1) {
                    yh[i][j] = 1;
                } else {
                    yh[i][j] = yh[i - 1][j] + yh[i - 1][j - 1];//中间的元素
                }
            }
        }
        //输出杨辉三角
        for (int i = 0; i < yh.length; i++) {
            for (int j = 0; j < yh[i].length; j++) {
                System.out.print(yh[i][j] + "\t");
            }
            System.out.println();//输出一行再换行
        }
    }
}
