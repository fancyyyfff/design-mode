package com.fancy.experiment2;

public class SimpleFactoryTest {
    public static void main(String[] args) {
        FreshWaterFish carp=FishFarm.productFish("鲤鱼");
        if(carp!=null){
            carp.grow();
            carp.harvest();
        }
        carp.grow();

        FreshWaterFish grashCarp =FishFarm.productFish("草鱼");
        if(grashCarp!=null){
            grashCarp.grow();
            grashCarp.harvest();
        }
        grashCarp.grow();

        FreshWaterFish catFish=FishFarm.productFish("鲶鱼");
        if(catFish!=null){
            catFish.grow();
            catFish.harvest();
        }
        catFish.grow();

//        鲫鱼
        FreshWaterFish crucian = FishFarm.productFish("鲫鱼");
        if(crucian!=null){
            crucian.grow();
            crucian.harvest();
        }
        crucian.grow();

    }
}
