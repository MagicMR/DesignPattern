package com.Singleton.type1;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/5/31
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.getInstance();
        Singleton singleton2=Singleton.getInstance();
        System.out.println(singleton1==singleton2);
        System.out.println("singleton1 = "+ singleton1.hashCode());
        System.out.println("singleton2 = "+ singleton2.hashCode());
    }
}

/**
 * 饿汉式(静态常量)：线程安全，但可能造成浪费
 */
class Singleton{

    private Singleton() {};

    public static  Singleton instance = new Singleton();

    public static Singleton getInstance(){
        return instance;
    }
}
