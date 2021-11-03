package com.dmj.design_patterns.strategy;

/**
 * @description: 策略接口，这是诸葛亮给赵云的三个锦囊妙计的接口
 * @Author: dengmeijin
 * @Date: 2021/11/3 15:38
 */
public interface IStrategy {
    //每个锦囊妙计都是一个可执行的算法
    void operate();
}
