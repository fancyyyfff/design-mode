package com.fancy.experiment16_obsever.jdk_obsever;
import java.util.Observable;
import java.util.Observer;

public class Mouse implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("老鼠（Mouse）开始逃跑");
    }
}