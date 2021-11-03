package com.dmj.design_patterns.strategy;

/**
 * @description: 赵云，拆开锦囊妙计
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:53
 */
public class ZhaoYun {
    public static void main(String[] args) {
        Context context;

        System.out.println("***************刚到吴国，拆开第一个****************");
        context = new Context(new BackDoor());//取出妙计
        context.operate();//执行

        System.out.println("***************想家了，拆开第二个****************");
        context = new Context(new GivenGreenLight());
        context.operate();

        System.out.println("***************回不了，拆开第三个****************");
        context = new Context(new BlockEnemy());
        context.operate();
    }
}
