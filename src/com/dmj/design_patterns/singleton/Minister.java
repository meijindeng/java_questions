package com.dmj.design_patterns.singleton;

/**
 * @description: 大臣：天天面见皇帝，而且是同一个
 * @Author: dengmeijin
 * @Date: 2021/11/3 23:11
 */
@SuppressWarnings("all")
public class Minister {
    public static void main(String[] args) {
        //第一天
        Emperor emperor1 = Emperor.getInstance();
        emperor1.emperorInfo();

        //第二天
        Emperor emperor2 = Emperor.getInstance();
        emperor2.emperorInfo();

        //第三天
        Emperor emperor3 = Emperor.getInstance();
        emperor3.emperorInfo();

        //第...天

        //一个测试而已，new与getInstance的区别
        Emperor s1 = Emperor.getInstance();
        Emperor s2 = Emperor.getInstance();
        if(s1 == s2)
            System.out.println("此类是单例模式");
        else
            System.out.println("此类不是单例模式");
    }
}
