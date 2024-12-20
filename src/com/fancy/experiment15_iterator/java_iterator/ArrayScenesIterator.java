package com.fancy.experiment15_iterator.java_iterator;

import java.util.Iterator;
//实现Iterator接口，不用自己再写自定义的Iterator接口
public class ArrayScenesIterator implements Iterator {

    private CampusScenes campusScenes; // 持有对具体聚合类的引用
    private int cursor = 0;

    public ArrayScenesIterator(CampusScenes campusScenes) {
        this.campusScenes = campusScenes;
    }

    @Override
    public boolean hasNext() {
        return cursor < campusScenes.getCampusScenesArray().length && campusScenes.getCampusScenesArray()[cursor] != null;
    }

    @Override
    public Object next() {
        return campusScenes.getCampusScenesArray()[cursor++];
    }
}
