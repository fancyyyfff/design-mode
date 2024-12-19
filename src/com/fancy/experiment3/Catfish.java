package com.fancy.experiment3;

//鲶鱼
public class Catfish implements FreshWaterfish {

    @Override
    public void grow() {
        System.out.println("鲶鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲶鱼");

    }
}
