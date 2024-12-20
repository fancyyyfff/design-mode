package com.fancy.experiment16_obsever;

public class Master implements Observer {
    @Override
    public void response() {
        System.out.println("主人（Master）被惊醒");
    }
}
