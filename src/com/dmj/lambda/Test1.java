package com.dmj.lambda;

import org.junit.jupiter.api.Test;

public class Test1 {
    @Test
    public void demo1(){
        //创建一个线程
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("启动一个线程1......");
            }
        }).start();//启动线程
    }

    /*
    lambda：简化代码。
    组成：
        1、逗号隔开的参数列表(x,x,x)或()；
        2、箭头符号；
        3、方法体（lambda代码块)
     */
    @Test
    public void demo2(){
        //创建一个线程
        new Thread(
                //() -> {System.out.println("启动一个线程......");}//有大括号加分号
                () -> System.out.println("启动一个线程2......")
        ).start();//启动线程
    }
    /*
    1、以上为例，new Thread()中是一个接口或者抽象类。但是为了避免不能区分lambda到底重写的是哪一个方法，
       语法上lambda要求重写的接口或者抽象类中只能有一个抽象方法。
    2、仔细观察，lambda重写的接口、抽象类中会标识一个@FunctionalInterface，称为函数式接口。
    3、函数式接口：标识@FunctionalInterface，有且只有一个抽象方法。
    4、lambda表达式重写的必须是函数式接口或者只有一个抽象方法的抽象类。
    5、特殊情况：如果某个接口中有多个抽象方法，但只有一个抽象方法是本接口新定义的，其他抽象方法和Object中
       已有的抽象方法重复，那么该接口任然是函数式接口。
     */

    public static void main(String[] args) {

    }
}
