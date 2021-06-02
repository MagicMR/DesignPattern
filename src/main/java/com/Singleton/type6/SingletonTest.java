package com.Singleton.type6;

import java.security.Signature;

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
 * 静态内部类；在外部类装载时，静态内部类不会装载，当调用getInstance方法时装载静态内部类，装载类时是线程安全的。
 */
class Singleton{

    private Singleton() {};

    public static class SingletonInstance{
        public static final Singleton INSTANCE = new Singleton();
    }

    public static  Singleton getInstance(){
        return SingletonInstance.INSTANCE;
    }
}
