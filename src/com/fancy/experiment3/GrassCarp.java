package com.fancy.experiment3;



public class GrassCarp implements FreshWaterfish {

    @Override
    public void grow() {
        System.out.println("草鱼在生长！");
    }

    @Override
    public void harvest() {
        System.out.println("收获草鱼！");
    }

}