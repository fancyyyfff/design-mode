package com.fancy.experiment10_component;

public abstract class Institution {
    public abstract void add(Institution institution);
    public abstract void delete(Institution institution);
    public abstract Institution get(int index);
    public abstract void action();//机构行使职责工作
}
