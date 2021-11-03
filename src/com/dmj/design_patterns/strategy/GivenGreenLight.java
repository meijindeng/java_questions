package com.dmj.design_patterns.strategy;

/**
 * @description: 开绿灯，相当于有其中一个妙计
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:44
 */
public class GivenGreenLight implements IStrategy {
    @Override
    public void operate() {
        System.out.println("开绿灯：求吴国放行");
    }
}
