package com.dmj.design_patterns.factory_method;

/**
 * @description: 黑种人
 * @Author: dengmeijin
 * @Date: 2021/11/4 10:37
 */
public class BlackHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黑种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黑种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黑种人也会说话");
    }
}
