package com.Factory.absFactory.order;

import com.Factory.absFactory.pizza.Pizza;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class OrderPizza {

    private String orderType;

    public OrderPizza(AbsFactory factory) {
        setFactory(factory);
    }

    public void setFactory(AbsFactory factory) {
        Pizza pizza=null;
        String orderType =null;
        do {
            orderType=getOrderType();
            pizza = factory.createPizza(orderType);
            if (pizza!=null){
                pizza.setName(orderType);
                pizza.prepare();
                pizza.make();
                pizza.bale();
            }else {
                System.out.println("没有该类型的披萨！");
                break;
            }
        }while (true);
    }

    public String getOrderType() {
        Scanner scanner=new Scanner(System.in);
        return scanner.nextLine();
    }
}
