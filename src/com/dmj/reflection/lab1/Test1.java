package com.dmj.reflection.lab1;

import org.junit.jupiter.api.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * 通过反射获取类、方法、接口、父类、构造方法、属性以及对象
 */
public class Test1 {
    //通过反射获取类
    @Test
    public void demo1() throws ClassNotFoundException {
        //获取反射对象（入口）：Class.forName();  类名.class;  对象.getClass()
        System.out.println("==========方式一：Class.forName()=========");
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        System.out.println(c1);

        System.out.println("==========方式二：类名.class=========");
        Class c2 = Person.class;
        System.out.println(c2);

        System.out.println("==========方式三：对象.getClass=========");
        Person person = new Person();
        Class c3 = person.getClass();
        System.out.println(c3);
    }

    //通过反射获取方法
    @Test
    public void demo2() throws ClassNotFoundException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过getMethods()获取所有"公共的"方法（1.本类、父类、接口中的所有方法；2.符合访问修饰符规律public）
        Method[] methods = c1.getMethods();
        for (Method method : methods) {
            System.out.println(method);
        }
        System.out.println("================");
        //获取当前类的所有方法（1.只能是当前类；2.忽略访问修饰符限制）
        Method[] declaredMethods = c1.getDeclaredMethods();
        for (Method declaredMethod : declaredMethods) {
            System.out.println(declaredMethod);
        }
    }

    //通过反射获取所有的接口
    @Test
    public void demo3() throws ClassNotFoundException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过getInterfaces()获取接口
        Class[] interfaces = c1.getInterfaces();//接口有多个
        for (Class inter : interfaces) {
            System.out.println(inter);
        }
    }

    //通过反射获取所有的父类
    @Test
    public void demo4() throws ClassNotFoundException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过getSuperclass()获取父类
        Class superclass = c1.getSuperclass();//继承有一个
        System.out.println(superclass);
    }

    //通过反射获取所有的构造方法
    @Test
    public void demo5() throws ClassNotFoundException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过getConstructors()获取构造方法
        Constructor[] constructors = c1.getConstructors();//多个：有参和无参
        for (Constructor c : constructors) {
            System.out.println(c);
        }
    }

    //通过反射获取所有的属性
    @Test
    public void demo6() throws ClassNotFoundException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过getFields()获取公共的属性
        Field[] fields = c1.getFields();
        for (Field field : fields) {
            System.out.println(field);
        }
        System.out.println("==========");
        //通过getDeclaredFields()获取当前类的所有属性
        Field[] declaredFields = c1.getDeclaredFields();
        for (Field declaredField : declaredFields) {
            System.out.println(declaredField);
        }
    }

    //通过反射获取当前所代表类（接口）的对象（实例）
    @Test
    public void demo7() throws ClassNotFoundException, IllegalAccessException, InstantiationException {
        //入口
        Class c1 = Class.forName("com.dmj.reflection.lab1.Person");
        //通过newInstance()获取
        Object instance = c1.newInstance();
        Person per = (Person)instance;
        per.interface1Method();
    }

    public static void main(String[] args) {

    }
}
