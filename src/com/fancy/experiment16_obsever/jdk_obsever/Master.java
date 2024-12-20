package com.fancy.experiment16_obsever.jdk_obsever;

import java.util.Observable;
import java.util.Observer;

public class Master implements Observer {
    @Override
    public void update(Observable o, Object arg) {
        System.out.println("主人（Master）被惊醒");
    }
}
