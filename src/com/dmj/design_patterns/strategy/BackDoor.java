package com.dmj.design_patterns.strategy;

/**
 * @description: 开后门，相当于有其中一个妙计
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:41
 */
public class BackDoor implements IStrategy {
    @Override
    public void operate() {
        System.out.println("开后门：找人帮忙，阻止孙权杀刘备");
    }
}
