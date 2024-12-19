package com.fancy.experiment2;
//草鱼
public class GrassCarp implements FreshWaterFish{

    @Override
    public void grow() {
        System.out.println("草鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获草鱼");

    }
}
