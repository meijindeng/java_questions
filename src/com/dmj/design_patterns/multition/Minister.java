package com.dmj.design_patterns.multition;

/**
 * @description: 大臣
 * @Author: dengmeijin
 * @Date: 2021/11/4 10:13
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {

        int ministerNum =10; //10个大臣

        for(int i=0;i<ministerNum;i++){
            Emperor emperor = Emperor.getInstance();
            System.out.print("第"+(i+1)+"个大臣参拜的是：");
            emperor.emperorInfo();
        }
    }
}
