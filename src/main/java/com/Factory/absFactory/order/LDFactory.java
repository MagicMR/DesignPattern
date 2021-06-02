package com.Factory.absFactory.order;

import com.Factory.absFactory.pizza.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class LDFactory extends AbsFactory{
    @Override
    public Pizza createPizza(String orderType) {
        Pizza pizza=null;
        if (orderType.equals("A")){
            pizza=new LDAPizza();
        }else if (orderType.equals("B")){
            pizza=new LDBPizza();
        }
        return pizza;
    }
}
