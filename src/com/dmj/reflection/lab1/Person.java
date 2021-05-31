package com.dmj.reflection.lab1;

public class Person implements MyInterface1, MyInterface2 {
    private int id;
    private String name;
    private int age;

    public String desc;

    public Person() {
    }

    public Person(int id, String name, int age) {
        this.id = id;
        this.name = name;
        this.age = age;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    //无参私有方法
    private void privateMethod(){
        System.out.println("无参privateMethod...");
    }
    //有参私有方法
    private void privateMethod2(String name){
        System.out.println("有参privateMethod2..." + name);
    }

    public static void staticMethod(){
        System.out.println("staticMethod...");
    }

    @Override
    public void interface1Method() {
        System.out.println("interface1Method...");
    }

    @Override
    public void interface2Method() {
        System.out.println("interface2Method...");
    }
}
