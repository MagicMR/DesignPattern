package com.Factory.common;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/6/2
 */
public abstract class Pizza {
    public String name;

    public abstract void prepare();

    public void setName(String name) {
        this.name = name;
    }

    public  void make(){
        System.out.println(name+"准备制作中;");
    }
    public  void bale(){
        System.out.println(name+"准备打包中;");
    }
}
