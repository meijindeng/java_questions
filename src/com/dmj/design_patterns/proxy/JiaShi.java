package com.dmj.design_patterns.proxy;

/**
 * @description: 贾氏做的事
 * @Author: dengmeijin
 * @Date: 2021/11/3 17:36
 */
public class JiaShi implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("贾氏抛媚眼");
    }

    @Override
    public void badHeart() {
        System.out.println("贾氏坏心思");
    }
}
