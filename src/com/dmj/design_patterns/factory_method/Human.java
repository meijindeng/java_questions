package com.dmj.design_patterns.factory_method;

/**
 * @description: 工厂方法模式：定义一个人类的统称，这些人有什么特点
 * @Author: dengmeijin
 * @Date: 2021/11/4 10:28
 */
public interface Human {
    /**
     * 笑
     */
    void laugh();

    /**
     * 哭
     */
    void cry();

    /**
     * 说
     */
    void talk();
}
