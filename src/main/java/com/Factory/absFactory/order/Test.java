package com.Factory.absFactory.order;

import java.util.Scanner;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public class Test {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        if (scanner.nextLine().equals("BJ")){
            new OrderPizza(new BJFactory());
        }else {
            new OrderPizza(new LDFactory());
        }
    }
}
