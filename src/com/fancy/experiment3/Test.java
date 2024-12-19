package com.fancy.experiment3;


public class Test {
    public static void main(String[] args) {
        FishFarm fishFarm = (FishFarm)XMLUtil.getBean();
        FreshWaterfish fish = fishFarm.productFish();
        fish.grow();
        fish.harvest();

    }
}
