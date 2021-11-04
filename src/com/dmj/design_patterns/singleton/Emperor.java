package com.dmj.design_patterns.singleton;

/**
 * @description: 单例模式：主要是单例的，比如皇帝
 * @Author: dengmeijin
 * @Date: 2021/11/3 23:04
 */
public class Emperor {
    private static Emperor emperor = null;//定义一个皇帝

    private Emperor(){
        //为了不产生第二个皇帝
    }

    /**
     * 单例模式：一般用于比较大，复杂的对象，只初始化一次，应该还有一个private的构造函数，使得不能用new来实例化对象，
     * 只能调用getInstance方法来得到对象，而getInstance保证了每次调用都返回相同的对象。
     * 对象的实例化方法，也是比较多的，最常用方法是直接new，而这是最普通的，如果要考虑到其它的需要，如单实例模式，层次间调用等等。
     * 直接使用new就不能实现好的，这时候需要使用间接使用new，即getInstance方法。这是一个设计方式的代表，而不仅仅指代一个方法名。
     * getInstance()，get获取instance实例，就是获取唯一的实例。
     * @return
     */
    public static Emperor getInstance(){
        //如果皇帝没有被定义，则定义一个
        if (emperor == null){
            emperor = new Emperor();
        }
        return emperor;
    }

    //皇帝的名字
    public static void emperorInfo(){
        System.out.println("我是某某某皇帝......");
    }
}
