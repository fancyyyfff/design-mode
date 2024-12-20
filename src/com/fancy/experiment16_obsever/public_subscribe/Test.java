package com.fancy.experiment16_obsever.public_subscribe;
import com.fancy.experiment16_obsever.Master;
import com.fancy.experiment16_obsever.Mouse;

public class Test {
    public static void main(String[] args) {
        EventBus eventBus = new EventBus();
        Cat cat = new Cat(eventBus);

        // 创建观察者
        Mouse mouse = new Mouse();
        Master master = new Master();

//        由事件总线添加观察者
        eventBus.subscribe(mouse);
        eventBus.subscribe(master);
//        触发猫叫事件，通知所有订阅者
        cat.cry();
    }
}
