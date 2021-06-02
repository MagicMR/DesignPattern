package com.SRP;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/5/30
 */
public class SingleResponsibilityPrinciple1 {
    public static void main(String[] args) {
        Transportation t=new Transportation();
        t.run("汽车");
        t.run("摩托车");
        t.run("飞机");
        t.run("轮船");
    }
}

class Transportation{
    public void run(String transportation){
        System.out.println(transportation+"在地上跑");
    }
}

