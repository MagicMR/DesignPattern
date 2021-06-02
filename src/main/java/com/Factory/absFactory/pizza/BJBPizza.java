package com.Factory.absFactory.pizza;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class BJBPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("我是BJ的工厂");
    }
}
