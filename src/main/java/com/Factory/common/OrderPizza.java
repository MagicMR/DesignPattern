package com.Factory.common;

import java.io.BufferedReader;
import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class OrderPizza {
    public OrderPizza() {
        Pizza pizza=null;
        String orderType;
        do {
            orderType=getOrderType();
            if (orderType.equals("A")){
                pizza = new APizza();
            }else if (orderType.equals("B")){
                pizza = new BPizza();
            }else {
                System.out.println("没有该类型的披萨！");
                break;
            }
            pizza.setName(orderType);
            pizza.prepare();
            pizza.make();
            pizza.bale();
        }while (true);
    }
    public String getOrderType(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
