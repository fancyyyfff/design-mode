package com.fancy.experiment3;

public class CrucianFarm implements FishFarm{
    @Override
    public FreshWaterfish productFish() {
        return new Crucian();
    }
}
