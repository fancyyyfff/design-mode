package com.fancy.experiment16_obsever;

public interface  Subject {
    public void addObserver(Observer obs); //添加观察者
    public void removeObserver(Observer obs); //移除观察者
    public void cry();
}
