package com.fancy.experiment16_obsever.jdk_obsever;

public class Test {
    public static void main(String[] args) {
        // 创建主题（猫）
        Cat cat = new Cat();

        // 创建观察者（老鼠和主人）
        Mouse mouse = new Mouse();
        Master master = new Master();

        // 添加观察者
        cat.addObserver(mouse);
        cat.addObserver(master);

        // 触发猫叫
        cat.cry();
    }
}
