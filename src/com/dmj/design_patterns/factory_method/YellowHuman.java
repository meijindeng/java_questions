package com.dmj.design_patterns.factory_method;

/**
 * @description: 黄种人，具体的人种
 * @Author: dengmeijin
 * @Date: 2021/11/4 10:32
 */
public class YellowHuman implements Human {
    @Override
    public void laugh() {
        System.out.println("黄种人会笑");
    }

    @Override
    public void cry() {
        System.out.println("黄忠人会哭");
    }

    @Override
    public void talk() {
        System.out.println("黄种人也会说话");
    }
}
