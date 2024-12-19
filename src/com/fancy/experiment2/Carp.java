package com.fancy.experiment2;
//鲤鱼
public class Carp implements FreshWaterFish{
    @Override
    public void grow() {
        System.out.println("鲤鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲤鱼");

    }
}
