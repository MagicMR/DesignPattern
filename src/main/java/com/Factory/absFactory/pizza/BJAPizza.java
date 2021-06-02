package com.Factory.absFactory.pizza;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class BJAPizza extends Pizza{

    @Override
    public void prepare() {
        System.out.println("我是BJ的工厂");
    }
}
