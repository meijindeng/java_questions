package com.dmj.reflection.lab2;

import java.lang.reflect.Array;
import java.util.Scanner;

/**
 * 通过反射操作数组：可以动态生成数组类型和大小
 */
public class Test1 {
    //操作一维数组
    public static void array1() throws Exception {
        Scanner input = new Scanner(System.in);
        System.out.println("请输入数组的类型：");
        String type = input.nextLine();//java.lang.String
        System.out.println("请输入数组的个数：");
        int num = input.nextInt();

        Class c = Class.forName(type);//type什么类型就返回什么类型
        //创建数组对象，传入类型和个数
        Object arr = Array.newInstance(c, num);//arr目前还是对象，不是数组
        //给数组元素赋值
        Array.set(arr,0,"dmj");
        Array.set(arr,1,"wds");
        Array.set(arr,2,"psi");
        //给数组元素取值
        System.out.println(Array.get(arr,0));
        System.out.println(Array.get(arr,1));
        System.out.println(Array.get(arr,2));
    }
    //操作二维数组
    public static void  array2() throws Exception {
        Class c = Integer.TYPE;//数组类型为int，使用Class.forName也可以
        //数组的长度
        int dim[] = {3 , 3};
        Object arr = Array.newInstance(c, dim);
        //先获取数组的某一行
        Object arr2 = Array.get(arr,2);//二维数组的第三行
        //再给数组赋值
        Array.set(arr2,0,249);//第三行第一列赋值249
        Array.set(arr2,1,250);//第三行第二列赋值250
        System.out.println(Array.get(arr2,0));
        System.out.println(Array.get(arr2,1));
    }

    public static void main(String[] args) throws Exception {
        //array1();
        array2();
    }
}
