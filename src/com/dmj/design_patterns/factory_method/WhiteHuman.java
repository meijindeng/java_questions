package com.dmj.design_patterns.factory_method;

/**
 * @description: 白种人
 * @Author: dengmeijin
 * @Date: 2021/11/4 10:35
 */
public class WhiteHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("白种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("白种人会哭");
    }

    @Override
    public void talk() {
        System.out.println("白种人也会说话");
    }
}
