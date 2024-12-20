package com.fancy.experiment15_iterator.java_iterator;

import java.util.Iterator;

public class ListScenesIterator implements Iterator {
    private SpotScenes spotScenes;
    private int cursor = 0;

    public ListScenesIterator(SpotScenes spotScenes) {
        this.spotScenes = spotScenes;
    }

    @Override
    public boolean hasNext() {
        return cursor < spotScenes.getSpotScenesList().size();
    }

    @Override
    public Object next() {
        return spotScenes.getSpotScenesList().get(cursor++);
    }
}
