package com.Singleton.type5;

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
 * 双重检查；线程安全的
 */
class Singleton{

    private Singleton() {};

    public static volatile  Singleton instance ;

    public static  Singleton getInstance(){
        if (instance==null){
            synchronized (Singleton.class){
                if (instance==null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
