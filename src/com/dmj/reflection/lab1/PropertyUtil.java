package com.dmj.reflection.lab1;

import java.lang.reflect.Field;

public class PropertyUtil {
    //需要给对象、属性、值：per.setxxx(value)
    public static void setProperty(Object obj, String propertyName, Object value) throws NoSuchFieldException, IllegalAccessException {
        //获取反射入口
        Class c = obj.getClass();
        //获取属性
        Field field = c.getDeclaredField(propertyName);
        //打开访问权限
        field.setAccessible(true);
        //给属性赋值
        field.set(obj,value);
    }
}
