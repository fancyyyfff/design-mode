package com.fancy.experiment15_iterator.java_iterator;

import com.fancy.experiment15_iterator.Scene;

import java.util.Iterator;
//实现Iterable接口，不用自己再写抽象接口
public class CampusScenes implements Iterable<Scene> {
    private Scene[] campusScenesArray;

    public CampusScenes(Scene[] campusScenesArray) {
        this.campusScenesArray = campusScenesArray;
    }

    public Scene[] getCampusScenesArray() {
        return campusScenesArray;
    }

    @Override
    public Iterator<Scene> iterator() {
        return new ArrayScenesIterator(this); // 返回 ArrayScenesIterator 实例
    }
}
