package com.fancy.experiment10_component;

public class TeachingServiceDepartment extends Institution {
    private String name;

    public TeachingServiceDepartment(String name) {
        this.name = name;
    }

    @Override
    public void add(Institution institution) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public void delete(Institution institution) {
        System.out.println("对不起，不支持该方法");
    }

    @Override
    public Institution get(int index) {
        System.out.println("对不起，不支持该方法");
        return null;
    }

    @Override
    public void action() {
        System.out.println("***"+name+"教学处（部)的职责是负责教学管理工作");
    }

}

