package com.fancy.experiment16_obsever;

public class Mouse implements Observer{

    @Override
    public void response() {
        System.out.println("老鼠（Mouse）开始逃跑");
    }
}
