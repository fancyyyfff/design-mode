package com.fancy.experiment3;

public class CarpFarm implements FishFarm{
    @Override
    public FreshWaterfish productFish() {
        return new Carp();
    }
}
