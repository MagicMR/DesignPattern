package com.Factory.type1;

import com.Factory.common.APizza;
import com.Factory.common.BPizza;
import com.Factory.common.Pizza;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class SimpleFactory {
    public static Pizza createPizza(String orderType){
        Pizza pizza=null;
        if (orderType.equals("A")){
            pizza = new APizza();
        }else if (orderType.equals("B")){
            pizza = new BPizza();
        }
        return pizza;
    }
}
