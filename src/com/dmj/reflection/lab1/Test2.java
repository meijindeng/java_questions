package com.dmj.reflection.lab1;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * 获取对象的实例，并操作对象；通过反射操作属性和方法
 */
public class Test2 {

    //获取对象的实例，并操作对象
    public static void demo1() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //通过反射获取类
        Class c = Class.forName("com.dmj.reflection.lab1.Person");
        //通过newInstance()得到对象的实例
        Person per = (Person) c.newInstance();
        //得到属性并赋值
        per.setName("meijindeng");
        per.setAge(23);
        System.out.println("名字：" + per.getName() + "\t" + "，年龄" + per.getAge());
    }

    //通过反射操作属性和方法
    public static void demo2() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //通过反射获取类
        Class c = Class.forName("com.dmj.reflection.lab1.Person");
        //通过newInstance()得到对象的实例
        Person per = (Person) c.newInstance();
        //获取某一个属性getDeclaredField()，传入哪个属性设置哪个属性

        System.out.println("=======属性=========");
        Field nameField = c.getDeclaredField("name");
        //name是private私有的，只能通过setName进行赋值，需要修改属性的访问权限，设置setAccessible为true
        nameField.setAccessible(true);//暂时把权限打开
        nameField.set(per,"meijindeng"); //per.setName("meijindeng")
        System.out.println(per.getName());

        System.out.println("=======方法=========");
        Method method = c.getDeclaredMethod("privateMethod", null);//方法名和参数（没有参数）
        method.setAccessible(true);
        method.invoke(per,null);//属性通过set赋值，方法通过invoke

        //调用有参
        Method method2 = c.getDeclaredMethod("privateMethod2", String.class);//方法名和参数（参数是String类型）
        method2.setAccessible(true);
        method2.invoke(per,"meijindeng");//属性通过set赋值，方法通过invoke
    }

    //通过反射操作构造方法
    public static void demo3() throws ClassNotFoundException, IllegalAccessException, InstantiationException, NoSuchMethodException, InvocationTargetException {
        //通过反射获取类
        Class c = Class.forName("com.dmj.reflection.lab1.Person");
        Constructor constructor = c.getConstructor();//无参构造可为Null或者不传值，若是有参则为：数据类型.class
        System.out.println(constructor);
        Person instance = (Person)constructor.newInstance();//因为constructor无参，所以不需要传值
        System.out.println(instance.hashCode());
    }

    public static void main(String[] args) throws IllegalAccessException, InstantiationException, ClassNotFoundException, NoSuchFieldException, NoSuchMethodException, InvocationTargetException {
        //demo1();
        //demo2();
        demo3();
    }
}
