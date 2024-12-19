package com.fancy.experiment2;
//鲶鱼
public class Catfish implements FreshWaterFish{

    @Override
    public void grow() {
        System.out.println("鲶鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲶鱼");

    }
}
