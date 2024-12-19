package com.fancy.experiment2;

public class FishFarm {
    public static FreshWaterFish productFish(String type){
        if("草鱼".equals(type)){
            return new GrassCarp();
        } else if ("鲤鱼".equals(type)) {
            return new Carp();
        } else if ("鲶鱼".equals(type)) {
            return new Catfish();
        } else if ("鲫鱼".equals(type)) {
            return new Crucian();
        }else {
            System.out.println("不生产这种鱼");
            return null;
        }
    }
}
