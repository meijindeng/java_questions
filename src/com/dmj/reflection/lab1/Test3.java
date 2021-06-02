package com.dmj.reflection.lab1;

import java.io.FileReader;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Properties;

public class Test3 {
    //动态加载类名和方法
    public static void demo1() throws IOException, ClassNotFoundException, NoSuchMethodException, IllegalAccessException, InstantiationException, InvocationTargetException {
        Properties prop = new Properties();
        FileReader reader = new FileReader("dmj/reflection.txt");
        prop.load(reader);
        //prop.load(new FileReader("dmj/reflection.txt"));
        String classname = prop.getProperty("classname");
        String methodname = prop.getProperty("methodname");

        Class c = Class.forName(classname);
        Method method = c.getMethod(methodname);
        method.invoke(c.newInstance());
    }

    //反射可以越过泛型检查（不建议使用，了解即可）
    public static void demo2() throws NoSuchMethodException, InvocationTargetException, IllegalAccessException, InstantiationException {
        //创建Integer类型的集合
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        //list.add("dmj"); 只能add整数，类型不匹配，使用反射可以add

        Class c = list.getClass(); //反射的一个入口方法
        Method method = c.getMethod("add", Object.class);//通过getMethod，反射调add方法，类型改为Object（任何类型）
        //method.invoke(c.newInstance(),"dmj");这是传入了c.newInstance()对象中，所以是另一个对象，改为list
        method.invoke(list, "dmj"); //传入list对象和参数值
        System.out.println(list);//结果[1, 2, dmj]
    }

    //通过一个方法给任意对象的属性赋值
    public static void demo3() throws NoSuchFieldException, IllegalAccessException {
        //new一个对象
        Person per = new Person();
        //给对象赋值
        PropertyUtil.setProperty(per,"name","meijindeng");
        PropertyUtil.setProperty(per,"age",23);
        System.out.println("姓名："+per.getName()+"，年龄："+per.getAge());
        //后面还可以添加其他对象
    }

    public static void main(String[] args) throws NoSuchMethodException, IOException, InstantiationException, IllegalAccessException, InvocationTargetException, ClassNotFoundException, NoSuchFieldException {
        //demo1();
        //demo2();
        demo3();
    }
}
