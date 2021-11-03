package com.dmj.design_patterns.strategy;

/**
 * @description: 锦囊，存放妙计
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:48
 */
public class Context {

    //构造函数，要使用哪个妙计
    private IStrategy strategy;
    public Context(IStrategy strategy) {
        this.strategy = strategy;
    }

    //使用计谋
    public void operate(){
        this.strategy.operate();
    }
}
