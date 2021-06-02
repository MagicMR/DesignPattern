package com.Factory.common;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class APizza extends Pizza{
    @Override
    public void prepare() {
        System.out.println("给A披萨准备材料中");
    }
}
