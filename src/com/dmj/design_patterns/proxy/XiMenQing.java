package com.dmj.design_patterns.proxy;

/**
 * @description: 西门庆
 * @Author: dengmeijin
 * @Date: 2021/11/3 17:28
 */
public class XiMenQing {
    public static void main(String[] args) {
        //先叫出王婆
        WangPo wangPo = new WangPo();
        //然后说要找潘金莲，此时通过王婆就知道潘金莲会抛媚眼和使坏心思
        wangPo.makeEyesWithMan();
        wangPo.badHeart();

        System.out.println("*****************");

        JiaShi jiaShi = new JiaShi();
        //让王婆代理贾氏
        WangPo wangPo1 = new WangPo(jiaShi);
        //然后通过王婆知道贾氏会什么
        wangPo1.makeEyesWithMan();
        wangPo1.badHeart();
    }
}
