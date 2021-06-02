package com.Singleton.type7;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/5/31
 */
public class SingletonTest {
    public static void main(String[] args) {
        Singleton singleton1=Singleton.INSTANCE;
        Singleton singleton2=Singleton.INSTANCE;
        System.out.println(singleton1==singleton2);
        singleton1.sayOk();
    }
}

/**
 * 枚举
 */
enum  Singleton{
    INSTANCE;
    public void sayOk(){
        System.out.println("OK");
    }
}
