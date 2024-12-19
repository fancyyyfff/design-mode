package com.fancy.experiment3;

import com.fancy.experiment2.Catfish;

public class CatfishFarm implements FishFarm{

    @Override
    public FreshWaterfish productFish() {
        return (FreshWaterfish) new Catfish();
    }
}
