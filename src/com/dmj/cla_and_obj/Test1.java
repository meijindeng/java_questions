package com.dmj.cla_and_obj;

/**
 * 题目：对一个类中的对象数组进行排序。
 * 定义一个类Person，初始化其对象数组，并按照age从大到小进行排序。提示：使用冒泡排序。
 */
public class Test1 {
    public static void main(String[] args) {
        //初始化Person对象数组，有3个person对象
        Person[] persons = new Person[4];
        persons[0] = new Person("jack", 21, "java开发工程师");
        persons[1] = new Person("tom", 33, "大数据工程师");
        persons[2] = new Person("mary", 28, "C++开发工程师");
        persons[3] = new Person("jock", 38, "PHP开发工程师");
        //输出当前对象数组
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i]);//默认调用对象的toString方法
        }
        System.out.println("===========冒泡排序===========");
        //冒泡排序
        Person tmp = null;
        for (int i = 0; i < persons.length-1; i++) {//外层循环
            for (int j = 0; j < persons.length-1-i; j++) {//内层循环
                if (persons[j].getAge() < persons[j+1].getAge()){
                    tmp = persons[j];
                    persons[j] = persons[j+1];
                    persons[j+1] = tmp;
                }
            }
        }
        for (int i = 0; i < persons.length ; i++) {
            System.out.println(persons[i]);//默认调用对象的toString方法
        }
    }
}

class Person {
    private String name;
    private int age;
    private String job;

    //有参构造
    public Person(String name, int age, String job) {
        this.name = name;
        this.age = age;
        this.job = job;
    }
    //get.set方法

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

    public String getJob() {
        return job;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //toString方法
    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", job='" + job + '\'' +
                '}';
    }
}

