package com.dmj.design_patterns.proxy;

/**
 * @description: 王婆做代理
 * @Author: dengmeijin
 * @Date: 2021/11/3 17:03
 */
public class WangPo implements KindWomen {

    private KindWomen kindWomen;

    /**
     * 可以是PanJinLian的代理（无参构造，比如潘金莲）
     */
    public WangPo() {
        this.kindWomen = new PanJinLian();
    }

    /**
     * 也可以是KindWomen这一类型的人的代理（有参构造，比如贾氏）
     * @param kindWomen
     */
    public WangPo(KindWomen kindWomen) {
        this.kindWomen = kindWomen;
    }

    @Override
    public void makeEyesWithMan() {
        this.kindWomen.makeEyesWithMan(); //抛媚眼，王婆年轻的时候也会
    }

    @Override
    public void badHeart() {
        this.kindWomen.badHeart();//坏心思，王婆也不差
    }
}
