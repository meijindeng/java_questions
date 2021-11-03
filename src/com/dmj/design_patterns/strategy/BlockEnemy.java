package com.dmj.design_patterns.strategy;

/**
 * @description: 断后，相当于有其中一个妙计
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:46
 */
public class BlockEnemy implements IStrategy {
    @Override
    public void operate() {
        System.out.println("断后：阻挡追兵");
    }
}
