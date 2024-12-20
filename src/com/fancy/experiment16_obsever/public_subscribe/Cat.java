package com.fancy.experiment16_obsever.public_subscribe;

public class Cat {
    private EventBus eventBus;

    // 通过构造函数传入事件总线
    public Cat(EventBus eventBus) {
        this.eventBus = eventBus;
    }

    // 触发事件总线发布事件
    public void cry() {
        eventBus.publish();
    }
}
