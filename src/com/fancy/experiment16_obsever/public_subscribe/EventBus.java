package com.fancy.experiment16_obsever.public_subscribe;

import com.fancy.experiment16_obsever.Observer;

import java.util.ArrayList;
import java.util.List;

public class EventBus {
    private List<Observer> observers = new ArrayList<>();

    // 添加订阅者
    public void subscribe(Observer observer) {
        observers.add(observer);
    }

    // 移除订阅者
    public void unsubscribe(Observer observer) {
        observers.remove(observer);
    }

    // 发布事件
    public void publish() {
        for (Observer observer : observers) {
            observer.response();
        }
    }
}
