package com.fancy.experiment3;

public class Carp implements FreshWaterfish{

    @Override
    public void grow() {
        System.out.println("鲤鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲤鱼");
    }
}
