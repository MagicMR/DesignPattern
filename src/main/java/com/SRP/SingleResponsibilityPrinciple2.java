package com.SRP;

/**
 * Created by IntelliJ IDEA.
 *
 * @author MagicMushroom
 * @date 2021/5/30
 */
public class SingleResponsibilityPrinciple2 {
    public static void main(String[] args) {
        CarTransportation car=new CarTransportation();
        car.run("汽车");
        car.run("摩托车");
        AriTransportation ari = new AriTransportation();
        ari.run("飞机");
        WaterTransportation water = new WaterTransportation();
        water.run("轮船");
    }
}

class CarTransportation{
    public void run(String transportation){
        System.out.println(transportation+"在地上运行");
    }
}
class AriTransportation{
    public void run(String transportation){
        System.out.println(transportation+"在空中运行");
    }
}
class WaterTransportation{
    public void run(String transportation){
        System.out.println(transportation+"在水中运行");
    }
}
