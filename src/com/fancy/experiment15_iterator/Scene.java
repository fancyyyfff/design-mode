package com.fancy.experiment15_iterator;

public class Scene {
    private String name; //景点名称
    private String info; //景点介绍

    public Scene(String name, String info) {
        this.name = name;
        this.info = info;
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getInfo() {
        return info;
    }
    public void setInfo(String info) {
        this.info = info;
    }

}
