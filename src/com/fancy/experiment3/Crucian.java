package com.fancy.experiment3;

public class Crucian  implements FreshWaterfish{
    @Override
    public void grow() {
        System.out.println("鲫鱼在生长");
    }

    @Override
    public void harvest() {
        System.out.println("收获鲫鱼");

    }
}
