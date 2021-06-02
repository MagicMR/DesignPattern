package com.Factory.type1;

import com.Factory.common.Pizza;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class OrderPizza {
    public OrderPizza() {
        String orderType=setOrderType();
        Pizza pizza = SimpleFactory.createPizza(orderType);
        if (pizza!=null){
            pizza.prepare();
            pizza.setName(orderType);
            pizza.make();
            pizza.bale();
        }
    }
    public String setOrderType(){
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}
