package com.fancy.experiment15_iterator;

import java.lang.reflect.Array;
import java.util.List;

//具体聚合类：创建迭代器，存储数据
public class CampusScenes  implements SceneAggregate{
    protected Scene[] campusScenesArray;

    public CampusScenes(Scene[] campusScenesArray) {
        this.campusScenesArray = campusScenesArray;
    }

    public Scene[] getCampusScenesArray() {
        return campusScenesArray;
    }

    @Override
    public void add() {
        System.out.println("添加校区");

    }

    @Override
    public void remove() {
        System.out.println("删除校区");

    }

    @Override
    public SceneIterator iterator() {
        return new ArrayScenesIterator(this);
    }
}
