package com.dmj.collection.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 * @description: sort()对集合进行升序排序
 * @Author: dengmeijin
 * @Date: 2021/9/3 17:23
 */
public class SortTest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List num = new ArrayList();
        for (int i = 0; i < 5; i++) {
            System.out.println("请输入第"+(i+1)+"数字：");
            int s = sc.nextInt();//使用s进行接收
            num.add(Integer.valueOf(s));//保存到list集合中
        }
        Collections.sort(num);//调用方法进行排序
        System.out.println("数字从低到高输出：");
        for (int i = 0; i < num.size(); i++){
            System.out.print(num.get(i)+"\t");
        }
    }
}
