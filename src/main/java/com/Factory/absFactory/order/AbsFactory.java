package com.Factory.absFactory.order;

import com.Factory.absFactory.pizza.Pizza;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public abstract class AbsFactory {
    public abstract Pizza createPizza(String orderType);
}
