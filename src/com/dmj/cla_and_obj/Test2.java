package com.dmj.cla_and_obj;

/**
 * 向上转型：父类 父类实例 = 子类实例、自动完成转换
 */
public class Test2 {
    public static void main(String[] args) {
        Father base = new Son();
        base.method1();   //Son类的方法1
        //base.method2();  //编译错误
    }
}
/*
   向上转型，也就是创建一个子类对象，把他当做父类来看待；
   向上转型，一定是安全的，但是一旦向上转型为父类对象，就不能调用子类原本特有的方法。
 */
//父类
class Father
{
    public void method1()
    {
        System.out.println("Father类的方法1");
    }
}
//子类继承父类
class Son extends Father
{
    public void method1()
    {
        System.out.println("Son类的方法1");
    }

    public void method2()
    {
        System.out.println("Son类的方法2");
    }
}
