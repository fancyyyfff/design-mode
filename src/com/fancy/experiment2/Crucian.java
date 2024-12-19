package com.fancy.experiment2;
//鲫鱼
public class Crucian implements FreshWaterFish{

    @Override
    public void grow() {
        System.out.println("鲫鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲫鱼");
    }
}
