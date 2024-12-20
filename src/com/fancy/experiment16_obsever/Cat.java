package com.fancy.experiment16_obsever;

import java.util.ArrayList;
// 具体主题类
public class Cat implements Subject{
    private ArrayList<Observer> observers = new ArrayList<>();
    @Override
    public void addObserver(Observer obs) {
        observers.add(obs);
    }

    @Override
    public void removeObserver(Observer obs) {
        observers.remove(obs);
    }
// 遍历观察者，调用观察者的响应方法
    @Override
    public void cry() {
        for (Observer obs : observers) {
            obs.response();
        }
    }
}
