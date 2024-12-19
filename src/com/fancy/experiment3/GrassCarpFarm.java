package com.fancy.experiment3;

import com.fancy.experiment2.GrassCarp;

public class GrassCarpFarm implements FishFarm{

    @Override
    public FreshWaterfish productFish() {
        return (FreshWaterfish) new GrassCarp();
    }
}
