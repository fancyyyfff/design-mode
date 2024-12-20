package com.fancy.experiment16_obsever.jdk_obsever;

import java.util.ArrayList;
import java.util.Observable;
import java.util.Observer;

public class Cat extends Observable {
    public void cry() {
        // 设置状态已改变，通知观察者
        setChanged();
        notifyObservers();
    }
}