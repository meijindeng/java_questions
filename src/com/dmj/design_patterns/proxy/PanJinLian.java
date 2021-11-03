package com.dmj.design_patterns.proxy;

/**
 * @description: 潘金莲做的事
 * @Author: dengmeijin
 * @Date: 2021/11/3 17:01
 */
public class PanJinLian implements KindWomen {
    @Override
    public void makeEyesWithMan() {
        System.out.println("向西门庆抛媚眼");
    }

    @Override
    public void badHeart() {
        System.out.println("对武大郎使坏心眼");
    }
}
