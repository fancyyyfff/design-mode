package com.fancy.experiment15_iterator.java_iterator;

import com.fancy.experiment15_iterator.Scene;

import java.util.Iterator;
import java.util.List;

public class SpotScenes implements Iterable<Scene> {
    private List<Scene> spotScenesList;

    public SpotScenes(List<Scene> spotScenesList) {
        this.spotScenesList = spotScenesList;
    }

    public List<Scene> getSpotScenesList() {
        return spotScenesList;
    }

    @Override
    public Iterator<Scene> iterator() {
        return new ListScenesIterator(this); // 返回 ListScenesIterator 实例
    }
}
