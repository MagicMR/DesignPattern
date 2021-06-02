package com.Factory.absFactory.order;

import com.Factory.absFactory.pizza.BJAPizza;
import com.Factory.absFactory.pizza.BJBPizza;
import com.Factory.absFactory.pizza.Pizza;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class BJFactory extends AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("A")){
            pizza=new BJAPizza();
        }else if (orderType.equals("B")){
            pizza=new BJBPizza();
        }
        return pizza;
    }
}
